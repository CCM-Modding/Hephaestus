package ccm.hephaestus.client.inventory.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;

import ccm.hephaestus.inventory.container.ContainerBlast;
import ccm.hephaestus.tileentity.TileBlast;
import ccm.hephaestus.utils.lib.TileConstants;

public class GUIBlast extends GuiContainer
{

    private final TileBlast blast;

    /**
     * Creates the Blast Furnace's GUI
     * 
     * @param player
     *            The Player looking at the GUI
     * @param grinder
     *            The {@link TileBlast} instance that the player is looking at.
     */
    public GUIBlast(final InventoryPlayer player,
                    final TileEntity blast)
    {
        super(new ContainerBlast(player, blast));
        this.blast = (TileBlast) blast;
    }

    /**
     * Draw the Background layer for the GuiContainer (everything in back of the
     * items)
     */
    @Override
    protected void drawGuiContainerBackgroundLayer(final float opacity, final int x, final int y)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(TileConstants.GRINDER_GUI);
        final int xStart = (this.width - this.xSize) / 2;
        final int yStart = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, this.xSize, this.ySize);
        int scale;
        if (this.blast.canSmelt()){
            scale = this.blast.getSmeltProgressScaled(35);
            this.drawTexturedModalRect(xStart + 79, yStart + 35, 176, 0, scale, 15);
        }
    }

    /**
     * Draw the Foreground layer for the GuiContainer (everything in front of
     * the items)
     */
    @Override
    protected void drawGuiContainerForegroundLayer(final int x, final int y)
    {
        final String containerName = this.blast.isInvNameLocalized() ? this.blast.getInvName() : StatCollector.translateToLocal(this.blast.getInvName());
        this.fontRenderer.drawString(containerName, (this.xSize / 2) - (this.fontRenderer.getStringWidth(containerName) / 2), 3, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal(TileConstants.INVENTORY), 9, (this.ySize - 96) + 3, 4210752);
    }
}