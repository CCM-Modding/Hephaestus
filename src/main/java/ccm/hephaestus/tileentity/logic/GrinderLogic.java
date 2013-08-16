package ccm.hephaestus.tileentity.logic;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.hephaestus.api.recipes.GrinderRecipes;
import ccm.nucleum.omnium.tileentity.ActiveTE;
import ccm.nucleum.omnium.tileentity.logic.GUILogic;
import ccm.nucleum.omnium.utils.helper.InventoryHelper;
import ccm.nucleum.omnium.utils.helper.ItemHelper;

public class GrinderLogic extends GUILogic {

    private final ActiveTE te;

    private final GrinderRecipes recipes = GrinderRecipes.instance();

    private final int inputSlot = 0;

    private final int fuelSlot = 1;

    private final int outSlot = 2;

    public GrinderLogic(final TileEntity te) {
        this.te = (ActiveTE) te;
    }

    @Override
    public void runLogic() {

        if (!this.te.worldObj.isRemote) {
            if (this.canRun()) {
                ItemHelper.damageItem(this.te, this.fuelSlot, 3);
                this.te.setState(true);
                ++this.progress;
                if (this.progress == this.getMaxTime(this.te.getStackInSlot(this.inputSlot))) {
                    this.progress = 0;
                    this.run();
                    this.te.onInventoryChanged();
                    this.te.setState(false);
                }
            } else {
                this.progress = 0;
                this.te.setState(false);
            }
        }
    }

    /**
     * Returns true if the grinder can grind an item, i.e. has a source item,
     * destination stack isn't full, etc.
     */
    @Override
    public boolean canRun() {
        if (this.te.getStackInSlot(this.inputSlot) != null) {
            if (this.te.getStackInSlot(this.fuelSlot) != null) {
                if (this.recipes.getResult(this.te.getStackInSlot(this.inputSlot)) != null) {

                    if (this.te.getStackInSlot(this.outSlot) == null) {
                        return true;
                    }

                    final ItemStack itemstack = this.recipes.getResult(this.te.getStackInSlot(this.inputSlot)).getOutput();

                    if (!this.te.getStackInSlot(this.outSlot).isItemEqual(itemstack)) {
                        return false;
                    }

                    final int result = this.te.getStackInSlot(this.outSlot).stackSize + itemstack.stackSize;

                    return (result <= this.te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
                }
            }
        }
        return false;
    }

    /**
     * Turn one item from the grinder source stack into the appropriate ground
     * item in the grinder result stack
     */
    @Override
    public void run() {
        if (this.canRun()) {

            final ItemStack itemstack = this.recipes.getResult(this.te.getStackInSlot(this.inputSlot)).getOutput();

            if (this.te.getStackInSlot(this.outSlot) == null) {
                this.te.setInventorySlotContents(this.outSlot, itemstack.copy());
            } else if (this.te.getStackInSlot(this.outSlot).isItemEqual(itemstack)) {
                this.te.setInventorySlotContents(this.outSlot, ItemHelper.getUniun(this.te.getStackInSlot(this.outSlot), itemstack));
            }

            if (this.te.getStackInSlot(this.inputSlot).stackSize <= 0) {
                InventoryHelper.setEmty(this.te, this.inputSlot);
            }

            this.te.decrStackSize(this.inputSlot, 1);
        }
    }
}