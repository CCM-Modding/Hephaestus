package ccm.hephaestus.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum EnumDusts {

    dustAluminum,
    dustBronze,
    dustCopper,
    dustGold,
    dustHardIron,
    dustHeavyIron,
    dustIron,
    dustLead,
    dustSilver,
    dustSteel,
    dustSulfur,
    dustTin,
    dustTitanium,
    dustTitCarbide,
    dustTunCrabide,
    dustTungsten;

    public static void registerIcons(final IconRegister register) {
        for (final EnumDusts dust : EnumDusts.values()) {
            dust.icon = register.registerIcon(dust.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumDusts() {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "gems/");
    }

    public Icon getIcon() {
        return this.icon;
    }
}