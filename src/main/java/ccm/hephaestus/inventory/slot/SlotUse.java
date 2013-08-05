package ccm.hephaestus.inventory.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public abstract class SlotUse extends Slot {
    
    public SlotUse(final IInventory inventory, final int index, final int x, final int y) {
        super(inventory, index, x, y);
    }
    
    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    @Override
    public abstract boolean isItemValid(ItemStack item);
}