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
     *            The {@link TileGrinder} instance that the player is looking
     *            at.
     */
    public ContainerBlast(final InventoryPlayer player, final TileEntity blast) {
        super(player, blast, 8, 84, 142);
        this.blast = (TileBlast) blast;
        // (Input)
        this.addSlotToContainer(new Slot(this.blast, 0, 57, 35));
        // (Coal)
        this.addSlotToContainer(new SlotBlastCoal(this.blast, 1, 30, 15));
        // (Sulfur)
        this.addSlotToContainer(new SlotBlastSulfur(this.blast, 2, 30, 45));
        // (Output)
        this.addSlotToContainer(new SlotOutput(this.blast, 3, 124, 35));
    }

    @Override
    public void addCraftingToCrafters(final ICrafting crafting) {
        super.addCraftingToCrafters(crafting);
        crafting.sendProgressBarUpdate(this, 0, this.blast.blastSmeltTime);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        if (this.blast.canSmelt()) {
            for (int i = 0; i < this.crafters.size(); ++i) {
                final ICrafting icrafting = (ICrafting) this.crafters.get(i);
                if (this.lastSmeltTime != this.blast.blastSmeltTime)
                    icrafting.sendProgressBarUpdate(this, 0, this.blast.blastSmeltTime);
            }
            this.lastSmeltTime = this.blast.blastSmeltTime;
        } else
            this.lastSmeltTime = 0;
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int slotIndex) {
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(final int progressIndex, final int progress) {
        if (progressIndex == 0)
            this.blast.blastSmeltTime = progress;
    }
}