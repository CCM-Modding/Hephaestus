package ccm.hephaestus.enums.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.handler.TextureHandler;
import ccm.nucleum_omnium.helper.enums.IItemEnum;

public enum EnumIngots implements IItemEnum {

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
        this.texture = TextureHandler.getTextureFromName(this.name(), Locations.TEXTURE + "ingots/");
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Item getBaseItem() {
        return ModItems.itemIngot;
    }
}