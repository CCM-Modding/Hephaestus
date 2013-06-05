package ccm.hephaestus.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.nucleum_omnium.helper.InventoryHelper;

import ccm.hephaestus.api.fuels.FuelsBlast;
import ccm.hephaestus.api.recipes.RecipesBlast;
import ccm.hephaestus.block.machines.BlockBlast;
import ccm.hephaestus.utils.lib.TileConstants;

public class TileBlast extends TileBase
{

    private final RecipesBlast recipe           = RecipesBlast.smelting();

    /** The number of ticks that the current item has been smelting for */
    public int                 blastSmeltTime   = 0;

    /** The number of ticks that the current item has been smelting for */
    public int                 currentSmeltTime = 0;

    /** The number of ticks that the furnace will keep burning */
    public int                 blastBurnTime    = 0;

    /** The time that the item allows has to be used */
    private static final int   invSize          = 4;

    /**
     * Creates a new {@link TileBlast} Instance.
     */
    public TileBlast()
    {
        super(invSize, TileConstants.BLAST_UNLOCALIZED);
    }

    /**
     * Removes from an inventory slot (first arg) up to a specified number
     * (second arg) of items and returns them in a new stack.
     */
    @Override
    public ItemStack decrStackSize(final int solt, final int amount)
    {
        if (this.inventory[solt] != null){
            ItemStack itemstack;
            if (this.inventory[solt].stackSize <= amount){
                itemstack = this.inventory[solt];
                this.inventory[solt] = null;
                return itemstack;
            }
            ItemStack itemstack1;
            itemstack1 = this.inventory[solt].splitStack(amount);

            if (this.inventory[solt].stackSize == 0){
                this.inventory[solt] = null;
            }
            return itemstack1;
        }else{
            return null;
        }
    }

    /**
     * When some containers are closed they call this on each slot, then drop
     * whatever it returns as an EntityItem - like when you close a workbench
     * GUI.
     */
    @Override
    public ItemStack getStackInSlotOnClosing(final int par1)
    {
        if (this.inventory[par1] != null){
            final ItemStack itemstack = this.inventory[par1];
            this.inventory[par1] = null;
            return itemstack;
        }else{
            return null;
        }
    }

    /**
     * Sets the given item stack to the specified slot in the inventory (can be
     * crafting or armor sections).
     */
    @Override
    public void setInventorySlotContents(final int par1, final ItemStack par2ItemStack)
    {
        this.inventory[par1] = par2ItemStack;

        if ((par2ItemStack != null) && (par2ItemStack.stackSize > this.getInventoryStackLimit())){
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }
    }

    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(final NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        this.setInventory(InventoryHelper.readInventoryFromNBT(nbt.getTagList(TileConstants.INVENTORY), invSize));
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be
     * 64, possibly will be extended. *Isn't this more of a set than a get?*
     */
    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    /**
     * Returns an integer between 0 and the passed value representing how close
     * the current item is to being completely smelted
     */
    @SideOnly(Side.CLIENT)
    public int getSmeltProgressScaled(final int scale)
    {
        return (this.blastSmeltTime * scale) / 500;
    }

    /**
     * Returns true if the furnace is currently burning
     */
    public boolean isBurning()
    {
        return this.blastBurnTime > 0;
    }

    /**
     * Allows the entity to update its state. Overridden in most subclasses,
     * e.g. the mob spawner uses this to count ticks and creates a new spawn
     * inside its implementation.
     */
    @Override
    public void updateEntity()
    {
        final boolean flag = this.blastBurnTime > 0;
        boolean flag1 = false;
        if (this.blastBurnTime > 0){
            --this.blastBurnTime;
        }
        if (!this.worldObj.isRemote){
            if ((this.blastBurnTime == 0) && this.canSmelt()){
                this.currentSmeltTime = this.blastBurnTime = getItemBurnTime(this.inventory[1]);
                if (this.blastBurnTime > 0){
                    flag1 = true;
                    if (this.inventory[1] != null){
                        --this.inventory[1].stackSize;
                        if (this.inventory[1].stackSize == 0){
                            this.inventory[1] = this.inventory[1].getItem().getContainerItemStack(this.inventory[1]);
                        }
                    }
                }
            }

            if (this.isBurning() && this.canSmelt()){
                ++this.blastSmeltTime;
                if (this.blastSmeltTime == 500){
                    this.blastSmeltTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            }else{
                this.blastSmeltTime = 0;
            }
            if (flag != (this.blastBurnTime > 0)){
                flag1 = true;
                BlockBlast.updateBlockState(false, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
        if (flag1){
            this.onInventoryChanged();
        }
    }

    /**
     * Returns true if the Blast Furnace can smelt an item, i.e. has a source
     * item, destination stack isn't full, etc.
     */
    public boolean canSmelt()
    {
        if ((this.inventory[0] != null)){
            if ((this.inventory[1] != null) && (this.inventory[2] != null)){
                if (this.recipe.getSmeltingResult(this.inventory[0]) != null){
                    final ItemStack itemstack = this.recipe.getSmeltingResult(this.inventory[0]).getOutput1();
                    if (this.inventory[3] == null){
                        return true;
                    }
                    if (!this.inventory[3].isItemEqual(itemstack)){
                        return false;
                    }
                    final int result = this.inventory[3].stackSize + itemstack.stackSize;
                    return ((result <= this.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize()));
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    /**
     * Turn one item from the Blast Furnace's source stack into the appropriate
     * smelted item in the Blast Furnace's result stack
     */
    public void smeltItem()
    {
        if (this.canSmelt()){
            final ItemStack itemstack = this.recipe.getSmeltingResult(this.inventory[0]).getOutput1();
            if (this.inventory[3] == null){
                this.inventory[3] = itemstack.copy();
            }else if (this.inventory[3].isItemEqual(itemstack)){
                this.inventory[3].stackSize += itemstack.stackSize;
            }
            --this.inventory[0].stackSize;
            if (this.inventory[0].stackSize <= 0){
                this.inventory[0] = null;
            }
        }
    }

    /**
     * Returns the number of ticks that the supplied fuel item will keep the
     * furnace burning, or 0 if the item isn't fuel
     */
    public static int getItemBurnTime(final ItemStack stack)
    {
        if (stack == null){
            return 0;
        }else{
            return FuelsBlast.getCoalValue(stack) + FuelsBlast.getSulfurValue(stack);
        }
    }

    /**
     * Return true if item is a fuel source (getItemBurnTime() > 0).
     */
    public static boolean isItemFuel(final ItemStack stack)
    {
        return getItemBurnTime(stack) > 0;
    }
}
