package ccm.hephaestus.item.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum.omnium.utils.handler.TextureHandler;
import ccm.nucleum.omnium.utils.helper.enums.IItemEnum;

public enum EnumModTool implements IItemEnum {
    // Grinder "Fuel", TODO Update with the right Damages
    gsStone(250),
    gsIron(400),
    gsBronze(600),
    gsObsidian(2000),
    gsDiamond(3000);

    public static void registerIcons(final IconRegister register) {
        for (final EnumModTool item : EnumModTool.values()) {
            item.icon = register.registerIcon(item.texture);
        }
    }

    public final String texture;

    public final int duration;

    private Icon icon;

    private EnumModTool(final int duration) {
        this.texture = TextureHandler.getTextureFromName(this.name(), Locations.TEXTURE);
        this.duration = duration;
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Item getBaseItem() {
        return null;
    }
}