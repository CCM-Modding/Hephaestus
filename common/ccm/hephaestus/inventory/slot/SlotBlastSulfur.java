package ccm.hephaestus.inventory.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import ccm.hephaestus.api.fuels.FuelsBlast;

public class SlotBlastSulfur extends SlotUse
{

    public SlotBlastSulfur(final IInventory inventory,
                           final int index,
                           final int x,
                           final int y)
    {
        super(inventory, index, x, y);
    }

    @Override
    public boolean isItemValid(final ItemStack item)
    {
        return FuelsBlast.isSulfurFuel(item);
    }
}