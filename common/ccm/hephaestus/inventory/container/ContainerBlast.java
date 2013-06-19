package ccm.hephaestus.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.hephaestus.inventory.slot.SlotBlastCoal;
import ccm.hephaestus.inventory.slot.SlotBlastSulfur;
import ccm.hephaestus.inventory.slot.SlotOutput;
import ccm.hephaestus.tileentity.TileBlast;
import ccm.hephaestus.tileentity.TileGrinder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerBlast extends ContainerBase {
    
    private final TileBlast blast;
    
    private int             lastSmeltTime;
    
    /**
     * Creates the Container for the Grinders GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link TileGrinder} instance that the player is looking at.
     */
    public ContainerBlast(final InventoryPlayer player, final TileEntity blast) {
        super(player, blast, 8, 84, 142);
        this.blast = (TileBlast) blast;
        // (Input)
        addSlotToContainer(new Slot(this.blast, 0, 57, 35));
        // (Coal)
        addSlotToContainer(new SlotBlastCoal(this.blast, 1, 30, 15));
        // (Sulfur)
        addSlotToContainer(new SlotBlastSulfur(this.blast, 2, 30, 45));
        // (Output)
        addSlotToContainer(new SlotOutput(this.blast, 3, 124, 35));
    }
    
    @Override
    public void addCraftingToCrafters(final ICrafting crafting) {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, blast.blastSmeltTime);
    }
    
    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        if (blast.canSmelt()) {
            for (int i = 0; i < crafters.size(); ++i) {
                final ICrafting icrafting = (ICrafting) crafters.get(i);
                if (lastSmeltTime != blast.blastSmeltTime) {
                    icrafting.sendProgressBarUpdate(this, 0, blast.blastSmeltTime);
                }
            }
            lastSmeltTime = blast.blastSmeltTime;
        } else {
            lastSmeltTime = 0;
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
            blast.blastSmeltTime = progress;
        }
    }
}