package ccm.hephaestus.item.classes;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.item.enums.EnumDust;
import ccm.hephaestus.item.enums.EnumGem;
import ccm.hephaestus.item.enums.EnumIngot;
import ccm.hephaestus.item.enums.EnumItem;

public class BaseItem extends BaseItemClass
{

    private int enumType;

    private static EnumItem[] currentBaseItems = EnumItem.values();

    private static EnumGem[] currentGemItems = EnumGem.values();

    private static EnumIngot[] currentIngotItems = EnumIngot.values();

    private static EnumDust[] currentDustItems = EnumDust.values();

    /**
     * Creates an Item Instance.
     * 
     * @param id
     *            The Item ID
     */
    public BaseItem(final int id)
    {
        super(id);
        setHasSubtypes(true);
        setMaxDamage(0);
        setCreativeTab(HephaestusTabs.tabHephaestusItems);
    }

    /**
     * Creates an Item Instance.
     * 
     * @param id
     *            The Item ID
     */
    public BaseItem(final int id, final int enumType)
    {
        super(id);
        setMaxDamage(0);
        setHasSubtypes(true);
        this.enumType = enumType;
        setCreativeTab(HephaestusTabs.tabHephaestusItems);
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(final int meta)
    {
        switch (enumType)
        {
            case 0:
                return BaseItem.currentBaseItems[meta].getIcon();
            case 1:
                return BaseItem.currentGemItems[meta].getIcon();
            case 2:
                return BaseItem.currentIngotItems[meta].getIcon();
            case 3:
                return BaseItem.currentDustItems[meta].getIcon();
            default:
                return null;
        }
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(final int itemID, final CreativeTabs creativeTabs, final List list)
    {
        switch (enumType)
        {
            case 0:
                for (int currentMeta = 0; currentMeta < EnumItem.values().length; ++currentMeta)
                {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
            case 1:
                for (int currentMeta = 0; currentMeta < EnumGem.values().length; ++currentMeta)
                {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
            case 2:
                for (int currentMeta = 0; currentMeta < EnumIngot.values().length; ++currentMeta)
                {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
            case 3:
                for (int currentMeta = 0; currentMeta < EnumDust.values().length; ++currentMeta)
                {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
        }
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack)
    {
        switch (enumType)
        {
            case 0:
                setUnlocalizedName(BaseItem.currentBaseItems[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            case 1:
                setUnlocalizedName(BaseItem.currentGemItems[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            case 2:
                setUnlocalizedName(BaseItem.currentIngotItems[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            case 3:
                setUnlocalizedName(BaseItem.currentDustItems[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            default:
                return null;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRergister)
    {
        EnumItem.registerIcons(iconRergister);
        EnumGem.registerIcons(iconRergister);
        EnumIngot.registerIcons(iconRergister);
        EnumDust.registerIcons(iconRergister);
    }
}