package ccm.hephaestus.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import ccm.hephaestus.api.recipes.RecipesGrinder;
import ccm.hephaestus.block.machines.BlockGrinder;
import ccm.hephaestus.utils.lib.TileConstants;
import ccm.nucleum_omnium.helper.InventoryHelper;
import ccm.nucleum_omnium.helper.ItemHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileGrinder extends TileBase {
    
    private final RecipesGrinder recipe          = RecipesGrinder.grinding();
    
    /** The number of ticks that the current item has been grinding for */
    public int                   grinderCookTime = 0;
    
    /** The time that the item allows has to be used */
    private static final int     invSize         = 3;
    
    /**
     * Creates a new {@link TileGrinder} Instance.
     */
    public TileGrinder() {
        super(TileGrinder.invSize, TileConstants.GRINDER_UNLOCALIZED);
    }
    
    /**
     * Returns true if the grinder can grind an item, i.e. has a source item, destination stack isn't full, etc.
     */
    public boolean canGrind() {
        if (inventory[0] != null) {
            if (inventory[1] != null) {
                if (recipe.getGrindingResult(inventory[0]) != null) {
                    final ItemStack itemstack = recipe.getGrindingResult(inventory[0]).getOutput1();
                    if (inventory[2] == null) {
                        return true;
                    }
                    if (!inventory[2].isItemEqual(itemstack)) {
                        return false;
                    }
                    final int result = inventory[2].stackSize + itemstack.stackSize;
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
     * Returns an integer between 0 and the passed value representing how close the current item is to being completely cooked
     */
    @SideOnly(Side.CLIENT)
    public int getGrindProgressScaled(final int scale) {
        return (grinderCookTime * scale) / 1000;
    }
    
    /**
     * Turn one item from the grinder source stack into the appropriate ground item in the grinder result stack
     */
    public void grindItem() {
        if (canGrind()) {
            final ItemStack itemstack = recipe.getGrindingResult(inventory[0]).getOutput1();
            if (inventory[2] == null) {
                inventory[2] = itemstack.copy();
            } else if (inventory[2].isItemEqual(itemstack)) {
                inventory[2].stackSize += itemstack.stackSize;
            }
            --inventory[0].stackSize;
            if (inventory[0].stackSize <= 0) {
                inventory[0] = null;
            }
        }
    }
    
    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(final NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        setInventory(InventoryHelper.readInventoryFromNBT(nbt.getTagList(TileConstants.INVENTORY), TileGrinder.invSize));
    }
    
    @Override
    public void updateEntity() {
        if (!worldObj.isRemote) {
            if (canGrind()) {
                ItemHelper.damageItem(inventory, 1, 2);
                BlockGrinder.updateBlockState(true, worldObj, xCoord, yCoord, zCoord);
                ++grinderCookTime;
                if (grinderCookTime == 1000) {
                    grinderCookTime = 0;
                    grindItem();
                    onInventoryChanged();
                    BlockGrinder.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
                }
            } else {
                grinderCookTime = 0;
                BlockGrinder.updateBlockState(false, worldObj, xCoord, yCoord, zCoord);
            }
        }
    }
    
    /**
     * Writes a tile entity to NBT.
     */
    @Override
    public void writeToNBT(final NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setTag(TileConstants.INVENTORY, InventoryHelper.writeInventoryToNBT(getInventory()));
    }
}