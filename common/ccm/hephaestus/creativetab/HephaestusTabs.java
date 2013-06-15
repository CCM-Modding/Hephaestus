package ccm.hephaestus.creativetab;

import ccm.hephaestus.enums.EnumBlocks;
import ccm.hephaestus.enums.EnumHandle;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.utils.lib.Archive;
import ccm.nucleum_omnium.creativetab.CreativeTab;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

public class HephaestusTabs {

    /**
     * Tabs that Contains All the blocks
     */
    public static CreativeTab tabHephaestusBlocks;

    /**
     * Contains All the Gems Items
     */
    public static CreativeTab tabHephaestusMaterials;

    /**
     * Contains All the Misc Items
     */
    public static CreativeTab tabHephaestusParts;

    /**
     * Contains All the Tools Items
     */
    public static CreativeTab tabHephaestusTools;

    public static void initTabs() {
        HephaestusTabs.tabHephaestusBlocks = new CreativeTab(Archive.TAB_HEPHAESTUS_BLOCK);
        HephaestusTabs.tabHephaestusMaterials = new CreativeTab(Archive.TAB_HEPHAESTUS_MATERIAL);
        HephaestusTabs.tabHephaestusParts = new CreativeTab(Archive.TAB_HEPHAESTUS_PART);
        HephaestusTabs.tabHephaestusTools = new CreativeTab(Archive.TAB_HEPHAESTUS_TOOL);
    }

    public static void initTabIcons() {
        HephaestusTabs.tabHephaestusBlocks.init(EnumToItemStack.getBlockIS(EnumBlocks.blockCopper));
        HephaestusTabs.tabHephaestusMaterials.init(EnumToItemStack.getItemIS(EnumIngots.ingotCopper));
        HephaestusTabs.tabHephaestusParts.init(EnumToItemStack.getItemIS(EnumHandle.handleWood));
        HephaestusTabs.tabHephaestusTools.init(EnumToItemStack.getItemIS(EnumHandle.handleWood));
    }
}