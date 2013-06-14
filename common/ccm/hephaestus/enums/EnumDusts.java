package ccm.hephaestus.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.helper.enums.IItemEnum;

public enum EnumDusts implements IItemEnum {

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
        for (final EnumDusts dust : EnumDusts.values())
            dust.icon = register.registerIcon(dust.texture);
    }

    private Icon        icon;

    public final String texture;

    private EnumDusts() {
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "dusts/");
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