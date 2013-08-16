package ccm.hephaestus.item;

import net.minecraft.item.Item;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.item.classes.BaseItem;
import ccm.hephaestus.item.classes.BaseUseableItem;
import ccm.hephaestus.item.enums.EnumModTool;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum.omnium.utils.handler.LogHandler;

public final class ModItems {

    public static Item mainItems;

    public static Item gemItems;

    public static Item ingotItems;

    public static Item dustItems;

    public static Item gsStone;

    public static Item gsIron;

    public static Item gsBronze;

    public static Item gsObsidian;

    public static Item gsDiamond;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init() {
        LogHandler.finest(Hephaestus.instance, "Loading Items");
        ModItems.mainItems = new BaseItem(Properties.mainItemID, 0);
        ModItems.gemItems = new BaseItem(Properties.gemItemID, 1);
        ModItems.ingotItems = new BaseItem(Properties.ingotItemID, 2);
        ModItems.dustItems = new BaseItem(Properties.dustItemID, 3);
        ModItems.gsStone = new BaseUseableItem(Properties.gsStoneID, EnumModTool.gsStone.duration).setUnlocalizedName(EnumModTool.gsStone.name());
        ModItems.gsIron = new BaseUseableItem(Properties.gsIronID, EnumModTool.gsIron.duration).setUnlocalizedName(EnumModTool.gsIron.name());
        ModItems.gsBronze = new BaseUseableItem(Properties.gsBronzeID, EnumModTool.gsBronze.duration).setUnlocalizedName(EnumModTool.gsBronze.name());
        ModItems.gsObsidian = new BaseUseableItem(Properties.gsObsidianID, EnumModTool.gsObsidian.duration).setUnlocalizedName(EnumModTool.gsObsidian.name());
        ModItems.gsDiamond = new BaseUseableItem(Properties.gsDiamondID, EnumModTool.gsDiamond.duration).setUnlocalizedName(EnumModTool.gsDiamond.name());

        initModCompat();
    }

    static void initModCompat() {

    }
}