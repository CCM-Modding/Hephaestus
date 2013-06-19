package ccm.hephaestus.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.hephaestus.inventory.slot.SlotGrinder;
import ccm.hephaestus.inventory.slot.SlotOutput;
import ccm.hephaestus.tileentity.TileGrinder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerGrinder extends ContainerBase {
    
    private final TileGrinder grinder;
    
    private int               lastGrindTime;
    
    /**
     * Creates the Container for the Grinders GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link TileGrinder} instance that the player is looking at.
     */
    public ContainerGrinder(final InventoryPlayer player, final TileEntity grinder) {
        super(player, grinder, 8, 84, 142);
        this.grinder = (TileGrinder) grinder;
        // (Input)
        addSlotToContainer(new Slot(this.grinder, 0, 57, 35));
        // (Grinding)
        addSlotToContainer(new SlotGrinder(this.grinder, 1, 30, 35));
        // (Output)
        addSlotToContainer(new SlotOutput(this.grinder, 2, 124, 35));
    }
    
    @Override
    public void addCraftingToCrafters(final ICrafting crafting) {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, grinder.grinderCookTime);
    }
    
    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        if (grinder.canGrind()) {
            for (int i = 0; i < crafters.size(); ++i) {
                final ICrafting icrafting = (ICrafting) crafters.get(i);
                if (lastGrindTime != grinder.grinderCookTime) {
                    icrafting.sendProgressBarUpdate(this, 0, grinder.grinderCookTime);
                }
            }
            lastGrindTime = grinder.grinderCookTime;
        } else {
            lastGrindTime = 0;
        }
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int slotIndex) {
        return null;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(final int progressIndex, final int progress) {
        if (progressIndex == 0) {
            grinder.grinderCookTime = progress;
        }
    }
}