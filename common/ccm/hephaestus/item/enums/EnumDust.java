package ccm.hephaestus.item.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum.omnium.utils.helper.TextureHelper;
import ccm.nucleum.omnium.utils.helper.enums.IItemEnum;

public enum EnumDust implements IItemEnum
{
    // Items (Stack up to 64)
    dustTin,
    dustAluminum,
    dustSilver,
    dustCopper,
    dustTitanium,
    dustIron,
    dustGold,
    dustSulfur,
    dustSoldarium,
    dustElectrum,
    dustBronze,
    dustSteel,
    dustTitanite;

    public static void registerIcons(final IconRegister register)
    {
        for (final EnumDust item : EnumDust.values())
        {
            item.icon = register.registerIcon(item.texture);
        }
    }

    private Icon icon;

    public final String texture;

    private EnumDust()
    {
        texture = TextureHelper.getTexture(name(), Locations.TEXTURE + "dusts/");
    }

    @Override
    public Icon getIcon()
    {
        return icon;
    }

    @Override
    public Item getBaseItem()
    {
        return ModItems.dustItems;
    }
}