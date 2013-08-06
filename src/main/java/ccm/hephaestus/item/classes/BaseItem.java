package ccm.hephaestus.item.classes;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.enums.items.EnumDusts;
import ccm.hephaestus.enums.items.EnumHandle;
import ccm.hephaestus.enums.items.EnumIngots;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseItem extends BaseItemClass {

    private int enumType;

    private static EnumHandle[] currentHandels = EnumHandle.values();

    private static EnumIngots[] currentIngots = EnumIngots.values();

    private static EnumDusts[] currentDusts = EnumDusts.values();

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
        this.setCreativeTab(HephaestusTabs.tabHephaestusParts);
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
        this.setCreativeTab(HephaestusTabs.tabHephaestusParts);
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * Gets an icon index based on an item's damage value
     */
    public Icon getIconFromDamage(final int meta) {
        switch (this.enumType) {
            case 0:
                return BaseItem.currentHandels[meta].getIcon();
            case 1:
                return BaseItem.currentIngots[meta].getIcon();
            case 2:
                return BaseItem.currentDusts[meta].getIcon();
            default:
                return null;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(final int itemID, final CreativeTabs creativeTabs, final List list) {
        switch (this.enumType) {
            case 0:
                for (int currentMeta = 0; currentMeta < EnumHandle.values().length; ++currentMeta) {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
            case 1:
                for (int currentMeta = 0; currentMeta < EnumIngots.values().length; ++currentMeta) {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
            case 2:
                for (int currentMeta = 0; currentMeta < EnumDusts.values().length; ++currentMeta) {
                    list.add(new ItemStack(itemID, 1, currentMeta));
                }
                break;
        }
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack) {
        switch (this.enumType) {
            case 0:
                this.setUnlocalizedName(BaseItem.currentHandels[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            case 1:
                this.setUnlocalizedName(BaseItem.currentIngots[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            case 2:
                this.setUnlocalizedName(BaseItem.currentDusts[itemStack.getItemDamage()].name());
                return super.getUnlocalizedName();
            default:
                return null;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRergister) {
        EnumHandle.registerIcons(iconRergister);
        EnumIngots.registerIcons(iconRergister);
        EnumDusts.registerIcons(iconRergister);
    }
}