package ccm.hephaestus.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.handler.enums.IEnum;
import ccm.nucleum_omnium.helper.TextureHelper;

public enum EnumUsable implements IEnum {
    gsStone(100), gsIron(250), gsBronze(400), gsObsidian(1000), gsDiamond(1500);

    public static void registerIcons(final IconRegister register) {
        for (final EnumUsable item : EnumUsable.values()) {
            item.icon = register.registerIcon(item.texture);
        }
    }

    public final String texture;

    public final int duration;

    private Icon icon;

    private EnumUsable(final int duration) {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE);
        this.duration = duration;
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }
}