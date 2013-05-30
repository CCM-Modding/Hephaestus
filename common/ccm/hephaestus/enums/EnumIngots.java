package ccm.hephaestus.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum EnumIngots {

    ingotAluminum,
    ingotBronze,
    ingotCopper,
    ingotHardIron,
    ingotHeavyIron,
    ingotLead,
    ingotSilver,
    ingotSteel,
    ingotTin,
    ingotTitanite,
    ingotTitanium,
    ingotTitCarbide,
    ingotTunCarbide,
    ingotTungsten;

    public static void registerIcons(final IconRegister register) {
        for (final EnumIngots ingot : EnumIngots.values()) {
            ingot.icon = register.registerIcon(ingot.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumIngots() {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "ingots/");
    }

    public Icon getIcon() {
        return this.icon;
    }
}