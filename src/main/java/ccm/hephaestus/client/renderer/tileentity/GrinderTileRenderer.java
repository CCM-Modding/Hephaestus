package ccm.hephaestus.client.renderer.tileentity;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import ccm.hephaestus.block.enums.EnumModeled;
import ccm.hephaestus.tileentity.logic.GrinderLogic;
import ccm.nucleum_omnium.client.renderer.tileentity.TileRenderer;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.tileentity.LogicTE;

public class GrinderTileRenderer extends TileRenderer {

    // The grinder needs to render only parts depending on inventory
    // also the grind wheel needs to rotate

    public GrinderTileRenderer() {
        this.model = EnumModeled.machineGrinder.getModel();
    }

    @Override
    public void render(final TileEntity tile, final double x, final double y, final double z, final float tick) {

        if (tile instanceof ActiveTE) {
            if (((LogicTE) tile).getTileLogic() instanceof GrinderLogic) {

                // Translate, Scale
                GL11.glTranslatef((float) x + 0.5F, (float) y, (float) z + 0.5F);
                GL11.glScalef(0.39F, 0.39F, 0.39F);

                // Bind Texture and Render
                this.model.render();
            }
        }
    }
}