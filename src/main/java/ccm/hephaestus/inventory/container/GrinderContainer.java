package ccm.hephaestus.inventory.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import ccm.hephaestus.api.fuels.GrinderFuels;
import ccm.hephaestus.tileentity.logic.GrinderLogic;
import ccm.nucleum_omnium.inventory.container.ProgressContainer;
import ccm.nucleum_omnium.inventory.slot.OutputSlot;
import ccm.nucleum_omnium.inventory.slot.UseSlot;
import ccm.nucleum_omnium.tileentity.InventoryTE;
import ccm.nucleum_omnium.tileentity.LogicTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;

public class GrinderContainer extends ProgressContainer {

    /**
     * Creates the Container for the Grinders GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param tile
     *            The {@link GrinderLogic} instance that the player is looking
     *            at.
     */
    public GrinderContainer(final InventoryPlayer player, final TileEntity tile) {
        super((InventoryTE) tile, ((IGUITileLogic) ((LogicTE) tile).getTileLogic()), player, 8, 84);

        final InventoryTE te = (InventoryTE) tile;
        // Middle Hand Slot (Input)
        this.addSlotToContainer(new Slot(te, 0, 57, 35));
        // Left Slot (Grinding)
        this.addSlotToContainer(new UseSlot(te, 1, 30, 35, GrinderFuels.instance()));
        // Right Hand Slot (Output)
        this.addSlotToContainer(new OutputSlot(te, 2, 124, 35));
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int slotIndex) {
        return null;
    }
}