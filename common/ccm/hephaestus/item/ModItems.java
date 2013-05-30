package ccm.hephaestus.item;

import net.minecraft.item.Item;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.enums.EnumUsable;
import ccm.hephaestus.item.classes.BaseItem;
import ccm.hephaestus.item.classes.BaseUseableItem;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

public final class ModItems {

    public static Item itemHandle;

    public static Item itemIngot;

    public static Item itemDust;

    public static Item gsStone;
    public static Item gsIron;
    public static Item gsBronze;
    public static Item gsObsidian;
    public static Item gsDiamond;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init() {
        Handler.log(Hephaestus.instance, "Loading Items");
        itemHandle = new BaseItem(Properties.itemHandleID, 0);
        itemIngot = new BaseItem(Properties.itemIngotID, 1).setCreativeTab(HephaestusTabs.tabHephaestusMaterials);
        itemDust = new BaseItem(Properties.itemDustID, 2).setCreativeTab(HephaestusTabs.tabHephaestusMaterials);

        gsStone = new BaseUseableItem(Properties.gsStoneID, EnumUsable.gsStone.duration).setUnlocalizedName(EnumUsable.gsStone.name());
        gsIron = new BaseUseableItem(Properties.gsIronID, EnumUsable.gsIron.duration).setUnlocalizedName(EnumUsable.gsIron.name());
        gsBronze = new BaseUseableItem(Properties.gsBronzeID, EnumUsable.gsBronze.duration).setUnlocalizedName(EnumUsable.gsBronze.name());
        gsObsidian = new BaseUseableItem(Properties.gsObsidianID, EnumUsable.gsObsidian.duration).setUnlocalizedName(EnumUsable.gsObsidian.name());
        gsDiamond = new BaseUseableItem(Properties.gsDiamondID, EnumUsable.gsDiamond.duration).setUnlocalizedName(EnumUsable.gsDiamond.name());
    }
}
