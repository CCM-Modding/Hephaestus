package ccm.hephaestus.enums.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.helper.enums.IItemEnum;

public enum EnumDustsH implements IItemEnum {

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
    dustTitanite,
    dustTitanium,
    dustTitCarbide,
    dustTunCarbide,
    dustTungsten;

    public static void registerIcons(final IconRegister register) {
        for (final EnumDustsH dust : EnumDustsH.values()) {
            dust.icon = register.registerIcon(dust.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumDustsH() {
        this.texture = TextureHandler.getTextureFromName(this.name(), Locations.TEXTURE + "dusts/");
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Item getBaseItem() {
        return ModItems.itemDust;
    }
}