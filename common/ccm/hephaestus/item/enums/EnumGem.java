package ccm.hephaestus.item.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum.omnium.utils.helper.TextureHelper;
import ccm.nucleum.omnium.utils.helper.enums.IItemEnum;

public enum EnumGem implements IItemEnum
{
    // Items (Stack up to 64)
    gemChildarium,
    gemCitrine,
    gemCZirconia,
    gemOlivine,
    gemRuby,
    gemSapphire,
    gemTopaz;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumGem item : EnumGem.values())
        {
            item.icon = register.registerIcon(item.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumGem()
    {
        texture = TextureHelper.getTexture(name(), Locations.TEXTURE + "gems/");
    }

    @Override
    public Icon getIcon()
    {
        return icon;
    }

    @Override
    public Item getBaseItem()
    {
        return ModItems.gemItems;
    }
}