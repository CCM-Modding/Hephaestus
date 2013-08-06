package ccm.dendritis.creativetab;

import net.minecraft.item.ItemStack;
import ccm.dendritis.enums.EnumBlocks;
import ccm.dendritis.enums.EnumGems;
import ccm.dendritis.enums.EnumMain;
import ccm.dendritis.item.ModArmors;
import ccm.dendritis.item.ModTools;
import ccm.dendritis.utils.lib.Archive;
import ccm.nucleum_omnium.creativetab.CreativeTab;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

public class DendritisTabs {

    /**
     * Tabs that Contains All the blocks
     */
    public static CreativeTab tabDendritisBlocks;

    /**
     * Contains All the Gems Items
     */
    public static CreativeTab tabDendritisGems;

    /**
     * Contains All the Misc Items
     */
    public static CreativeTab tabDendritisItems;

    /**
     * Contains All the Tools Items
     */
    public static CreativeTab tabDendritisTools;

    /**
     * Contains All the Armor Items
     */
    public static CreativeTab tabDendritisArmor;

    /**
     * Contains All the TC Items
     */
    public static CreativeTab tabDendritisTC;

    public static void initTabs() {
        DendritisTabs.tabDendritisBlocks = new CreativeTab(Archive.TAB_DENDRITIS_BLOCKS);
        DendritisTabs.tabDendritisGems = new CreativeTab(Archive.TAB_DENDRITIS_GEMS);
        DendritisTabs.tabDendritisItems = new CreativeTab(Archive.TAB_DENDRITIS_ITEMS);
        DendritisTabs.tabDendritisTools = new CreativeTab(Archive.TAB_DENDRITIS_TOOLS);
        DendritisTabs.tabDendritisArmor = new CreativeTab(Archive.TAB_DENDRITIS_ARMOR);
        DendritisTabs.tabDendritisTC = new CreativeTab(Archive.TAB_DENDRITIS_TC);
    }

    public static void initTabIcons() {
        DendritisTabs.tabDendritisBlocks.init(EnumToItemStack.getBlockIS(EnumBlocks.blockAmethyst));
        DendritisTabs.tabDendritisGems.init(EnumToItemStack.getItemIS(EnumGems.gemAmethyst));
        DendritisTabs.tabDendritisItems.init(EnumToItemStack.getItemIS(EnumMain.handle));
        DendritisTabs.tabDendritisTools.init(new ItemStack(ModTools.swordAmethyst));
        DendritisTabs.tabDendritisArmor.init(new ItemStack(ModArmors.chestAmethyst));
        DendritisTabs.tabDendritisTC.init(EnumToItemStack.getItemIS(EnumMain.handle));
    }
}