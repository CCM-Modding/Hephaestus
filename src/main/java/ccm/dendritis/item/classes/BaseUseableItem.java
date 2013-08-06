package ccm.dendritis.item.classes;

import net.minecraft.client.renderer.texture.IconRegister;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.handler.TextureHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseUseableItem extends BaseItemClass {

    public BaseUseableItem(final int id, final int maxDamage) {
        super(id);
        this.setMaxStackSize(1);
        this.setHasSubtypes(false);
        this.setMaxDamage(maxDamage);
        this.setCreativeTab(DendritisTabs.tabDendritisTools);
    }

    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register) {
        this.itemIcon = register.registerIcon(TextureHandler.getTexture(this, Locations.TEXTURE));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering() {
        return true;
    }
}