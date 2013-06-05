package ccm.hephaestus.item.classes;

import net.minecraft.client.renderer.texture.IconRegister;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.nucleum_omnium.helper.TextureHelper;

import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.utils.lib.Locations;

public class BaseUseableItem extends BaseItemClass
{

    public BaseUseableItem(final int id,
                           final int maxDamage)
    {
        super(id);
        this.setMaxStackSize(1);
        this.setHasSubtypes(false);
        this.setMaxDamage(maxDamage);
        this.setCreativeTab(HephaestusTabs.tabHephaestusTools);
    }

    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register)
    {
        this.itemIcon = register.registerIcon(TextureHelper.getTexture(this, Locations.TEXTURE));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }
}