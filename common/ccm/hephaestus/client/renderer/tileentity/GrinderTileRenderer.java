package ccm.hephaestus.client.renderer.tileentity;

import org.lwjgl.opengl.GL11;

import net.minecraft.tileentity.TileEntity;

import ccm.hephaestus.block.enums.EnumModeled;
import ccm.hephaestus.tileentity.logic.GrinderLogic;
import ccm.nucleum.omnium.client.renderer.tileentity.SimpleTileRenderer;
import ccm.nucleum.omnium.tileentity.ActiveTE;
import ccm.nucleum.omnium.tileentity.LogicTE;

public class GrinderTileRenderer extends SimpleTileRenderer
{

    // The grinder needs to render only parts depending on inventory
    // also the grind wheel needs to rotate

    public GrinderTileRenderer()
    {
        model = EnumModeled.machineGrinder.getModel();
    }

    @Override
    public void render(final TileEntity tile, final double x, final double y, final double z, final float tick)
    {

        if (tile instanceof ActiveTE)
        {
            if (((LogicTE) tile).getTileLogic() instanceof GrinderLogic)
            {

                // Translate, Scale
                GL11.glTranslatef((float) x + 0.5F, (float) y, (float) z + 0.5F);
                GL11.glScalef(0.39F, 0.39F, 0.39F);

                // Bind Texture and Render
                model.render();
            }
        }
    }
}