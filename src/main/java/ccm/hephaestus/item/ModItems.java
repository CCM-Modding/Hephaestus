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
        ModItems.itemHandle = new BaseItem(Properties.itemHandleID, 0);
        ModItems.itemIngot = new BaseItem(Properties.itemIngotID, 1).setCreativeTab(HephaestusTabs.tabHephaestusMaterials);
        ModItems.itemDust = new BaseItem(Properties.itemDustID, 2).setCreativeTab(HephaestusTabs.tabHephaestusMaterials);
        
        ModItems.gsStone = new BaseItem(Properties.gsStoneID).setUnlocalizedName("gsStone").setMaxDamage(250).setCreativeTab(HephaestusTabs.tabHephaestusTools);
        ModItems.gsIron = new BaseItem(Properties.gsIronID).setUnlocalizedName("gsIron").setMaxDamage(400).setCreativeTab(HephaestusTabs.tabHephaestusTools);
        ModItems.gsBronze = new BaseItem(Properties.gsBronzeID).setUnlocalizedName("gsBronze").setMaxDamage(600).setCreativeTab(HephaestusTabs.tabHephaestusTools);
        ModItems.gsObsidian = new BaseItem(Properties.gsObsidianID).setUnlocalizedName("gsObsidian").setMaxDamage(2000).setCreativeTab(HephaestusTabs.tabHephaestusTools);
        ModItems.gsDiamond = new BaseItem(Properties.gsDiamondID).setUnlocalizedName("gsDiamond").setMaxDamage(3000).setCreativeTab(HephaestusTabs.tabHephaestusTools);
    }
}
