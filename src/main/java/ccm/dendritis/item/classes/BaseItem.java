package ccm.dendritis.item.classes;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.enums.items.EnumGemsD;
import ccm.dendritis.enums.items.EnumMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseItem extends BaseItemClass {

    private int enumType;

    private static EnumMain[] currentMain = EnumMain.values();

    private static EnumGemsD[] currentGems = EnumGemsD.values();

    /**
     * Creates an Item Instance.
     * 
     * @param id
     *            The Item ID
     */
    public BaseItem(final int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(DendritisTabs.tabDendritisItems);
    }

    /**
     * Creates an Item Instance.
     * 
     * @param id
     *            The Item ID
     */
    public BaseItem(final int id, final int enumType) {
        super(id);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
        this.enumType = enumType;
        this.setCreativeTab(DendritisTabs.tabDendritisItems);
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * Gets an icon index based on an item's damage value
     */
    public Icon getIconFromDamage(final int meta) {
        switch (this.enumType) {
            case 0:
                return BaseItem.currentMain[meta].getIcon();
            case 1:
                return BaseItem.currentGems[meta].getIcon();
            default:
                return null;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(final int itemID, final CreativeTabs creativeTabs, final List list) {
        switch (this.enumType) {
            case 0:
                for (int currentMeta = 0; currentMeta < EnumMain.values().length; ++currentMeta) {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
            case 1:
                for (int currentMeta = 0; currentMeta < EnumGemsD.values().length; ++currentMeta) {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
        }
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack) {
        switch (this.enumType) {
            case 0:
                this.setUnlocalizedName(BaseItem.currentMain[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            case 1:
                this.setUnlocalizedName(BaseItem.currentGems[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            default:
                return null;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRergister) {
        EnumMain.registerIcons(iconRergister);
        EnumGemsD.registerIcons(iconRergister);
    }
}