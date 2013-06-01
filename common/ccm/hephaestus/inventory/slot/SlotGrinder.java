package ccm.hephaestus.inventory.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.api.fuels.FuelsGrinder;

public class SlotGrinder extends SlotUse {

    public SlotGrinder(final IInventory inventory, final int index, final int x, final int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean isItemValid(final ItemStack item) {
        return FuelsGrinder.isGrinderFuel(item);
    }
}