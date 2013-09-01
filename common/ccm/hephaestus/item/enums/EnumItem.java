package ccm.hephaestus.item.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum.omnium.utils.helper.TextureHelper;
import ccm.nucleum.omnium.utils.helper.enums.IItemEnum;

public enum EnumItem implements IItemEnum
{
    // Items (Stack up to 64)
    stuff;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumItem item : EnumItem.values())
        {
            item.icon = register.registerIcon(item.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumItem()
    {
        texture = TextureHelper.getTexture(name(), Locations.TEXTURE + "items/");
    }

    @Override
    public Icon getIcon()
    {
        return icon;
    }

    @Override
    public Item getBaseItem()
    {
        return ModItems.mainItems;
    }
}