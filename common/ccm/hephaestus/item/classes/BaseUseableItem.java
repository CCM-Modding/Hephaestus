package ccm.hephaestus.item.classes;

import net.minecraft.client.renderer.texture.IconRegister;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum.omnium.utils.handler.ResourceHandler;

public class BaseUseableItem extends BaseItemClass
{

    public BaseUseableItem(final int id, final int maxDamage)
    {
        super(id);
        setMaxStackSize(1);
        setHasSubtypes(false);
        setMaxDamage(maxDamage);
        setCreativeTab(HephaestusTabs.tabHephaestusTools);
    }

    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register)
    {
        itemIcon = register.registerIcon(ResourceHandler.getTexture(this, Locations.TEXTURE));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }
}