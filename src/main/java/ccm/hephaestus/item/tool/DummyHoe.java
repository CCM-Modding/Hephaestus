package ccm.hephaestus.item.tool;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.handler.TextureHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DummyHoe extends ItemHoe {

    public DummyHoe(final int par1, final EnumToolMaterial par2EnumToolMaterial) {
        super(par1, par2EnumToolMaterial);
        this.setCreativeTab(HephaestusTabs.tabHephaestusTools);
        // TODO Auto-generated constructor stub
    }

    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register) {
        this.itemIcon = register.registerIcon(TextureHandler.getTextureFromName(this.getUnlocalizedName(), Locations.TEXTURE + "tools/"));
    }
}