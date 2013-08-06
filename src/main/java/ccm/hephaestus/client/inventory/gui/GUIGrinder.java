package ccm.hephaestus.client.inventory.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import ccm.hephaestus.block.enums.EnumModeled;
import ccm.hephaestus.inventory.container.GrinderContainer;
import ccm.hephaestus.tileentity.logic.GrinderLogic;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.interfaces.IGUITileLogic;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.lib.TileConstants;

public class GUIGrinder extends GuiContainer {

    private final ActiveTE grinder;

    private final IGUITileLogic grinderL;

    /**
     * Creates the Grinder's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link GrinderLogic} instance that the player is looking
     *            at.
     */
    public GUIGrinder(final InventoryPlayer player, final TileEntity grinder) {
        super(new GrinderContainer(player, grinder));
        this.grinder = (ActiveTE) grinder;
        this.grinderL = (IGUITileLogic) this.grinder.getTileLogic();
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the
     * items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.func_110434_K().func_110577_a(TextureHandler.getGUI(EnumModeled.machineGrinder.name()));
        final int xStart = (this.width - this.xSize) / 2;
        final int yStart = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, this.xSize, this.ySize);
        int scale;
        if (this.grinderL.canRun()) {
            scale = this.grinderL.getProgressScaled(24);
            this.drawTexturedModalRect(xStart + 79, yStart + 31, 176, 0, 20, scale);
        }
    }

    /**
     * Draw the Foreground layer for the GuiContainer (everything in front of
     * the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(final int x, final int y) {
        final String containerName;

        if (this.grinder.isInvNameLocalized()) {
            containerName = this.grinder.getInvName();
        } else {
            containerName = StatCollector.translateToLocal(this.grinder.getInvName());
        }

        this.fontRenderer.drawString(containerName, (this.xSize / 2) - (this.fontRenderer.getStringWidth(containerName) / 2), 3, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY), 9, (this.ySize - 96) + 3, 4210752);
    }
}