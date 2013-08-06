package ccm.dendritis.item;

import net.minecraft.item.Item;
import ccm.dendritis.Dendritis;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.item.classes.BaseItem;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.utils.handler.LogHandler;

public final class ModItems {

    public static Item itemMain;

    public static Item itemGems;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init() {
        LogHandler.finest(Dendritis.instance, "Loading Items");
        ModItems.itemMain = new BaseItem(Properties.itemMainID, 0);
        ModItems.itemGems = new BaseItem(Properties.itemGemsID, 1).setCreativeTab(DendritisTabs.tabDendritisGems);
    }
}