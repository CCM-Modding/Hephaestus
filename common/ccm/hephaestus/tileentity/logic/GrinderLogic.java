package ccm.hephaestus.tileentity.logic;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import ccm.hephaestus.api.recipes.GrinderRecipes;
import ccm.nucleum.omnium.tileentity.ActiveTE;
import ccm.nucleum.omnium.tileentity.logic.GUILogic;
import ccm.nucleum.omnium.utils.helper.item.InventoryHelper;
import ccm.nucleum.omnium.utils.helper.item.ItemHelper;

public class GrinderLogic extends GUILogic
{

    private final ActiveTE te;

    private final GrinderRecipes recipes = GrinderRecipes.instance();

    private final int inputSlot = 0;

    private final int fuelSlot = 1;

    private final int outSlot = 2;

    public GrinderLogic(final TileEntity te)
    {
        this.te = (ActiveTE) te;
    }

    @Override
    public void runLogic()
    {

        if (!te.worldObj.isRemote)
        {
            if (canRun())
            {
                ItemHelper.damageItem(te, fuelSlot, 3);
                te.setState(true);
                ++progress;
                if (progress == getMaxTime(te.getStackInSlot(inputSlot)))
                {
                    progress = 0;
                    run();
                    te.onInventoryChanged();
                    te.setState(false);
                }
            } else
            {
                progress = 0;
                te.setState(false);
            }
        }
    }

    /**
     * Returns true if the grinder can grind an item, i.e. has a source item, destination stack isn't full, etc.
     */
    @Override
    public boolean canRun()
    {
        if (te.getStackInSlot(inputSlot) != null)
        {
            if (te.getStackInSlot(fuelSlot) != null)
            {
                if (recipes.getResult(te.getStackInSlot(inputSlot)) != null)
                {

                    if (te.getStackInSlot(outSlot) == null)
                    {
                        return true;
                    }

                    final ItemStack itemstack = recipes.getResult(te.getStackInSlot(inputSlot)).getOutput().getWrappedStack();

                    if (!te.getStackInSlot(outSlot).isItemEqual(itemstack))
                    {
                        return false;
                    }

                    final int result = te.getStackInSlot(outSlot).stackSize + itemstack.stackSize;

                    return (result <= te.getInventoryStackLimit()) && (result <= itemstack.getMaxStackSize());
                }
            }
        }
        return false;
    }

    /**
     * Turn one item from the grinder source stack into the appropriate ground item in the grinder result stack
     */
    @Override
    public void run()
    {
        if (canRun())
        {

            final ItemStack itemstack = recipes.getResult(te.getStackInSlot(inputSlot)).getOutput().getWrappedStack();

            if (te.getStackInSlot(outSlot) == null)
            {
                te.setInventorySlotContents(outSlot, itemstack.copy());
            } else if (te.getStackInSlot(outSlot).isItemEqual(itemstack))
            {
                te.setInventorySlotContents(outSlot, ItemHelper.getUniun(te.getStackInSlot(outSlot), itemstack));
            }

            if (te.getStackInSlot(inputSlot).stackSize <= 0)
            {
                InventoryHelper.setEmty(te, inputSlot);
            }

            te.decrStackSize(inputSlot, 1);
        }
    }
}