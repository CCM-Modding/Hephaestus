package ccm.hephaestus.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import ccm.hephaestus.api.fuels.FuelsBlast;
import ccm.hephaestus.api.recipes.RecipesBlast;
import ccm.hephaestus.block.machines.BlockBlast;
import ccm.hephaestus.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.InventoryHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileBlast extends TileBase {
    
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
    public TileBlast() {
        super(TileBlast.invSize, TileConstants.BLAST_UNLOCALIZED);
    }
    
    /**
     * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a new stack.
     */
    @Override
    public ItemStack decrStackSize(final int solt, final int amount) {
        if (inventory[solt] != null) {
            ItemStack itemstack;
            if (inventory[solt].stackSize <= amount) {
                itemstack = inventory[solt];
                inventory[solt] = null;
                return itemstack;
            }
            ItemStack itemstack1;
            itemstack1 = inventory[solt].splitStack(amount);
            
            if (inventory[solt].stackSize == 0) {
                inventory[solt] = null;
            }
            return itemstack1;
        } else {
            return null;
        }
    }
    
    /**
     * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem - like when you close a workbench GUI.
     */
    @Override
    public ItemStack getStackInSlotOnClosing(final int par1) {
        if (inventory[par1] != null) {
            final ItemStack itemstack = inventory[par1];
            inventory[par1] = null;
            return itemstack;
        } else {
            return null;
        }
    }
    
    /**
     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
     */
    @Override
    public void setInventorySlotContents(final int par1, final ItemStack par2ItemStack) {
        inventory[par1] = par2ItemStack;
        
        if ((par2ItemStack != null) && (par2ItemStack.stackSize > getInventoryStackLimit())) {
            par2ItemStack.stackSize = getInventoryStackLimit();
        }
    }
    
    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(final NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        setInventory(InventoryHelper.readInventoryFromNBT(nbt.getTagList(TileConstants.INVENTORY), TileBlast.invSize));
    }
    
    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't this more of a set than a get?*
     */
    @Override
    public int getInventoryStackLimit() {
        return 64;
    }
    
    /**
     * Returns an integer between 0 and the passed value representing how close the current item is to being completely smelted
     */
    @SideOnly(Side.CLIENT)
    public int getSmeltProgressScaled(final int scale) {
        return (blastSmeltTime * scale) / 500;
    }
    
    /**
     * Returns true if the furnace is currently burning
     */
    public boolean isBurning() {
        return blastBurnTime > 0;
    }
    
    /**
     * Allows the entity to update its state. Overridden in most subclasses, e.g. the mob spawner uses this to count ticks and creates a new spawn inside its implementation.
     */
    @Override
    public void updateEntity() {
        final boolean flag = blastBurnTime > 0;
        boolean flag1 = false;
        if (blastBurnTime > 0) {
            --blastBurnTime;
        }
        if (!worldObj.isRemote) {
            if ((blastBurnTime == 0) && canSmelt()) {
                currentSmeltTime = blastBurnTime = TileBlast.getItemBurnTime(inventory[1]);
                if (blastBurnTime > 0) {
                    flag1 = true;
                    if (inventory[1] != null) {
                        --inventory[1].stackSize;
                        if (inventory[1].stackSize == 0) {
                            inventory[1] = inventory[1].getItem().getContainerItemStack(inventory[1]);
                        }
                    }
                }
            }
            
            if (isBurning() && canSmelt()) {
                ++blastSmeltTime;
                if (blastSmeltTime == 500) {
                    blastSmeltTime = 0;
                    smeltItem();
                    flag1 = true;
                }
            } else {
                blastSmeltTime = 0;
            }
            if (flag != (blastBurnTime > 0)) {
                flag1 = true;
                BlockBlast.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
            }
        }
        if (flag1) {
            onInventoryChanged();
        }
    }
    
    /**
     * Returns true if the Blast Furnace can smelt an item, i.e. has a source item, destination stack isn't full, etc.
     */
    public boolean canSmelt() {
        if (inventory[0] != null) {
            if ((inventory[1] != null) && (inventory[2] != null)) {
                if (recipe.getSmeltingResult(inventory[0]) != null) {
                    final ItemStack itemstack = recipe.getSmeltingResult(inventory[0]).getOutput1();
                    if (inventory[3] == null) {
                        return true;
                    }
                    if (!inventory[3].isItemEqual(itemstack)) {
                        return false;
                    }
                    final int result = inventory[3].stackSize + itemstack.stackSize;
                    return (result <= getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    /**
     * Turn one item from the Blast Furnace's source stack into the appropriate smelted item in the Blast Furnace's result stack
     */
    public void smeltItem() {
        if (canSmelt()) {
            final ItemStack itemstack = recipe.getSmeltingResult(inventory[0]).getOutput1();
            if (inventory[3] == null) {
                inventory[3] = itemstack.copy();
            } else if (inventory[3].isItemEqual(itemstack)) {
                inventory[3].stackSize += itemstack.stackSize;
            }
            --inventory[0].stackSize;
            if (inventory[0].stackSize <= 0) {
                inventory[0] = null;
            }
        }
    }
    
    /**
     * Returns the number of ticks that the supplied fuel item will keep the furnace burning, or 0 if the item isn't fuel
     */
    public static int getItemBurnTime(final ItemStack stack) {
        if (stack == null) {
            return 0;
        } else {
            return FuelsBlast.getCoalValue(stack) + FuelsBlast.getSulfurValue(stack);
        }
    }
    
    /**
     * Return true if item is a fuel source (getItemBurnTime() > 0).
     */
    public static boolean isItemFuel(final ItemStack stack) {
        return TileBlast.getItemBurnTime(stack) > 0;
    }
}
