package ccm.hephaestus.item;

import net.minecraft.item.Item;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.item.classes.BaseItem;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

public final class ModItems {

    public static Item itemHandle;

    public static Item itemIngot;

    public static Item itemDust;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init() {
        Handler.log(Hephaestus.instance, "Loading Items");
        itemHandle = new BaseItem(Properties.itemHandleID, 0);
        itemIngot = new BaseItem(Properties.itemIngotID, 1).setCreativeTab(HephaestusTabs.tabHephaestusMaterials);
        itemDust = new BaseItem(Properties.itemDustID, 2).setCreativeTab(HephaestusTabs.tabHephaestusMaterials);
}
}
