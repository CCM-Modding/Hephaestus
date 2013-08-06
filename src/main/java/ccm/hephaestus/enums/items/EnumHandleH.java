package ccm.hephaestus.enums.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.helper.enums.IItemEnum;

public enum EnumHandleH implements IItemEnum {

    handleWood,
    handleBronze,
    handleHardIron,
    handleIron,
    handleSteel,
    handleTitanium;

    public static void registerIcons(final IconRegister register) {
        for (final EnumHandleH handle : EnumHandleH.values()) {
            handle.icon = register.registerIcon(handle.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumHandleH() {
        this.texture = TextureHandler.getTextureFromName(this.name(), Locations.TEXTURE);
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Item getBaseItem() {
        return ModItems.itemHandle;
    }
}