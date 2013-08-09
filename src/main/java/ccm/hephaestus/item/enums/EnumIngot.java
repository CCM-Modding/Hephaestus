package ccm.hephaestus.item.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.helper.enums.IItemEnum;

public enum EnumIngot implements IItemEnum {
    // Items (Stack up to 64)
    ingotTin,
    ingotAluminum,
    ingotSilver,
    ingotCopper,
    ingotTitanium,
    ingotSoldarium,
    ingotElectrum,
    ingotBronze,
    ingotSteel,
    ingotTitanite;

    public static void registerIcons(final IconRegister register) {
        for (final EnumIngot item : EnumIngot.values()) {
            item.icon = register.registerIcon(item.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumIngot() {
        this.texture = TextureHandler.getTextureFromName(this.name(), Locations.TEXTURE + "items/");
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Item getBaseItem() {
        return ModItems.ingotItems;
    }
}