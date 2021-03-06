package ccm.hephaestus.client.renderer.item;

import org.lwjgl.opengl.GL11;

import net.minecraft.item.ItemStack;

import ccm.hephaestus.block.enums.EnumModeled;
import ccm.nucleum.omnium.client.renderer.item.ModeledItemRenderer;

public class GrinderItemRenderer extends ModeledItemRenderer
{

    // The item for the grinder needs to render only the
    // GrindWheel, Box1, Box2, Box3, Box4, Base, GrindPole, Box011, Box012, and
    // Box013 parts

    public GrinderItemRenderer()
    {
        model = EnumModeled.machineGrinder.getModel();
    }

    @Override
    public void renderItem(final ItemRenderType type, final ItemStack item, final Object... data)
    {
        switch (type)
        {
            case ENTITY:
            {
                render(0, 0, 0, 0.5F, 0);
                return;
            }
            case EQUIPPED:
            {
                render(1.0F, 0, 1.0F, 0.5F, 0);
                return;
            }
            case EQUIPPED_FIRST_PERSON:
            {
                render(0, 0, 1.0F, 0.4F, 0);
                return;
            }
            case INVENTORY:
            {
                render(0, -1.4F, 0, 0.45F, 0);
                return;
            }
            default:
                return;
        }
    }

    @Override
    public void render(final float x, final float y, final float z, final float scale, final float angle)
    {

        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);

        // Scale, Translate, Rotate
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(x, y, z);
        GL11.glRotatef(angle, x, y, z);

        // Bind Texture and Render
        model.render();

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
}
