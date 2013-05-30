package ccm.hephaestus.creativetab;

import ccm.hephaestus.core.handlers.EHandler;
import ccm.hephaestus.enums.EnumBlocks;
import ccm.hephaestus.enums.EnumHandle;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.utils.lib.Archive;
import ccm.nucleum_omnium.creativetab.CreativeTab;

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
        tabHephaestusBlocks = new CreativeTab(Archive.TAB_HEPHAESTUS_BLOCK);
        tabHephaestusMaterials = new CreativeTab(Archive.TAB_HEPHAESTUS_MATERIAL);
        tabHephaestusParts = new CreativeTab(Archive.TAB_HEPHAESTUS_PART);
        tabHephaestusTools = new CreativeTab(Archive.TAB_HEPHAESTUS_TOOL);
    }

    public static void initTabIcons() {
        tabHephaestusBlocks.init(EHandler.getItem(EnumBlocks.blockCopper));
        tabHephaestusMaterials.init(EHandler.getItem(EnumIngots.ingotCopper));
        tabHephaestusParts.init(EHandler.getItem(EnumHandle.handleWood));
    }
}