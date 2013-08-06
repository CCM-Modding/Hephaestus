package ccm.dendritis.item.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.item.ModArmors;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SuppressWarnings("deprecation")
public class DummyArmor extends ItemArmor implements IArmorTextureProvider {

    public DummyArmor(final int par1, final EnumArmorMaterial par2EnumArmorMaterial, final int par3, final int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);
        this.setCreativeTab(DendritisTabs.tabDendritisArmor);
        // TODO Auto-generated constructor stub
    }

    /**
     * Registers the Icons for all the Usable Items.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister register) {
        this.itemIcon = register.registerIcon(TextureHandler.getTextureFromName(this.getUnlocalizedName(), Locations.TEXTURE + "armor/"));
    }

    @Override
    public String getArmorTextureFile(final ItemStack stack) {

        if ((stack.itemID == ModArmors.headAmethyst.itemID) || (stack.itemID == ModArmors.chestAmethyst.itemID) || (stack.itemID == ModArmors.bootsAmethyst.itemID)) {
            return Locations.ARMOR + "Amethyst_1.png";
        } else if (stack.itemID == ModArmors.legsAmethyst.itemID) {
            return Locations.ARMOR + "Amethyst_2.png";
        } else if ((stack.itemID == ModArmors.headBDiamond.itemID) || (stack.itemID == ModArmors.chestBDiamond.itemID) || (stack.itemID == ModArmors.bootsBDiamond.itemID)) {
            return Locations.ARMOR + "BDiamond_1.png";
        } else if (stack.itemID == ModArmors.legsBDiamond.itemID) {
            return Locations.ARMOR + "BDiamond_2.png";
        } else if ((stack.itemID == ModArmors.headCitrine.itemID) || (stack.itemID == ModArmors.chestCitrine.itemID) || (stack.itemID == ModArmors.bootsCitrine.itemID)) {
            return Locations.ARMOR + "Citrine_1.png";
        } else if (stack.itemID == ModArmors.legsCitrine.itemID) {
            return Locations.ARMOR + "Citrine_2.png";
        } else if ((stack.itemID == ModArmors.headCZirconia.itemID) || (stack.itemID == ModArmors.chestCZirconia.itemID) || (stack.itemID == ModArmors.bootsCZirconia.itemID)) {
            return Locations.ARMOR + "CZirconia_1.png";
        } else if (stack.itemID == ModArmors.legsCZirconia.itemID) {
            return Locations.ARMOR + "CZirconia_2.png";
        } else if ((stack.itemID == ModArmors.headEmerald.itemID) || (stack.itemID == ModArmors.chestEmerald.itemID) || (stack.itemID == ModArmors.bootsEmerald.itemID)) {
            return Locations.ARMOR + "Emerald_1.png";
        } else if (stack.itemID == ModArmors.legsEmerald.itemID) {
            return Locations.ARMOR + "Emerald_2.png";
        } else if ((stack.itemID == ModArmors.headFuchsia.itemID) || (stack.itemID == ModArmors.chestFuchsia.itemID) || (stack.itemID == ModArmors.bootsFuchsia.itemID)) {
            return Locations.ARMOR + "Fuchsia_1.png";
        } else if (stack.itemID == ModArmors.legsFuchsia.itemID) {
            return Locations.ARMOR + "Fuchsia_2.png";
        } else if ((stack.itemID == ModArmors.headJet.itemID) || (stack.itemID == ModArmors.chestJet.itemID) || (stack.itemID == ModArmors.bootsJet.itemID)) {
            return Locations.ARMOR + "Jet_1.png";
        } else if (stack.itemID == ModArmors.legsJet.itemID) {
            return Locations.ARMOR + "Jet_2.png";
        } else if ((stack.itemID == ModArmors.headOlivine.itemID) || (stack.itemID == ModArmors.chestOlivine.itemID) || (stack.itemID == ModArmors.bootsOlivine.itemID)) {
            return Locations.ARMOR + "Olivine_1.png";
        } else if (stack.itemID == ModArmors.legsOlivine.itemID) {
            return Locations.ARMOR + "Olivine_2.png";
        } else if ((stack.itemID == ModArmors.headOpal.itemID) || (stack.itemID == ModArmors.chestOpal.itemID) || (stack.itemID == ModArmors.bootsOpal.itemID)) {
            return Locations.ARMOR + "Opal_1.png";
        } else if (stack.itemID == ModArmors.legsOpal.itemID) {
            return Locations.ARMOR + "Opal_2.png";
        } else if ((stack.itemID == ModArmors.headQuartz.itemID) || (stack.itemID == ModArmors.chestQuartz.itemID) || (stack.itemID == ModArmors.bootsQuartz.itemID)) {
            return Locations.ARMOR + "Quartz_1.png";
        } else if (stack.itemID == ModArmors.legsQuartz.itemID) {
            return Locations.ARMOR + "Quartz_2.png";
        } else if ((stack.itemID == ModArmors.headRuby.itemID) || (stack.itemID == ModArmors.chestRuby.itemID) || (stack.itemID == ModArmors.bootsRuby.itemID)) {
            return Locations.ARMOR + "Ruby_1.png";
        } else if (stack.itemID == ModArmors.legsRuby.itemID) {
            return Locations.ARMOR + "Ruby_2.png";
        } else if ((stack.itemID == ModArmors.headSapphire.itemID) || (stack.itemID == ModArmors.chestSapphire.itemID) || (stack.itemID == ModArmors.bootsSapphire.itemID)) {
            return Locations.ARMOR + "Sapphire_1.png";
        } else if (stack.itemID == ModArmors.legsSapphire.itemID) {
            return Locations.ARMOR + "Sapphire_2.png";
        } else if ((stack.itemID == ModArmors.headSQuartz.itemID) || (stack.itemID == ModArmors.chestSQuartz.itemID) || (stack.itemID == ModArmors.bootsSQuartz.itemID)) {
            return Locations.ARMOR + "SQuartz_1.png";
        } else if (stack.itemID == ModArmors.legsSQuartz.itemID) {
            return Locations.ARMOR + "SQuartz_2.png";
        } else if ((stack.itemID == ModArmors.headSun.itemID) || (stack.itemID == ModArmors.chestSun.itemID) || (stack.itemID == ModArmors.bootsSun.itemID)) {
            return Locations.ARMOR + "Sun_1.png";
        } else if (stack.itemID == ModArmors.legsSun.itemID) {
            return Locations.ARMOR + "Sun_2.png";
        } else if ((stack.itemID == ModArmors.headTopaz.itemID) || (stack.itemID == ModArmors.chestTopaz.itemID) || (stack.itemID == ModArmors.bootsTopaz.itemID)) {
            return Locations.ARMOR + "Topaz_1.png";
        } else if (stack.itemID == ModArmors.legsTopaz.itemID) {
            return Locations.ARMOR + "Topaz_2.png";
        } else if ((stack.itemID == ModArmors.headTurquoise.itemID) || (stack.itemID == ModArmors.chestTurquoise.itemID) || (stack.itemID == ModArmors.bootsTurquoise.itemID)) {
            return Locations.ARMOR + "Turquoise_1.png";
        } else if (stack.itemID == ModArmors.legsTurquoise.itemID) {
            return Locations.ARMOR + "Turquoise_2.png";
        } else if ((stack.itemID == ModArmors.headWAlabaster.itemID) || (stack.itemID == ModArmors.chestWAlabaster.itemID) || (stack.itemID == ModArmors.bootsWAlabaster.itemID)) {
            return Locations.ARMOR + "WAlabaster_1.png";
        } else if (stack.itemID == ModArmors.legsWAlabaster.itemID) {
            return Locations.ARMOR + "WAlabaster_2.png";
        } else {
            return null;
        }
    }
}