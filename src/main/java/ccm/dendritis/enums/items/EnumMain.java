package ccm.dendritis.enums.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.dendritis.item.ModItems;
import ccm.dendritis.utils.lib.Locations;
import ccm.nucleum_omnium.handler.TextureHandler;
import ccm.nucleum_omnium.helper.enums.IItemEnum;

public enum EnumMain implements IItemEnum {

    handle;

    public static void registerIcons(final IconRegister register) {
        for (final EnumMain main : EnumMain.values()) {
            main.icon = register.registerIcon(main.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumMain() {
        this.texture = TextureHandler.getTextureFromName(this.name(), Locations.TEXTURE);
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Item getBaseItem() {
        return ModItems.itemMain;
    }
}