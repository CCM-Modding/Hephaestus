package ccm.hephaestus.creativetab;

import ccm.nucleum_omnium.creativetab.CreativeTab;
import ccm.nucleum_omnium.helper.enums.EnumHelper;

import ccm.hephaestus.enums.EnumBlocks;
import ccm.hephaestus.enums.EnumHandle;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.utils.lib.Archive;

public class HephaestusTabs
{

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

    public static void initTabs()
    {
        tabHephaestusBlocks = new CreativeTab(Archive.TAB_HEPHAESTUS_BLOCK);
        tabHephaestusMaterials = new CreativeTab(Archive.TAB_HEPHAESTUS_MATERIAL);
        tabHephaestusParts = new CreativeTab(Archive.TAB_HEPHAESTUS_PART);
        tabHephaestusTools = new CreativeTab(Archive.TAB_HEPHAESTUS_TOOL);
    }

    public static void initTabIcons()
    {
        tabHephaestusBlocks.init(EnumHelper.getBlockIS(EnumBlocks.blockCopper));
        tabHephaestusMaterials.init(EnumHelper.getItemIS(EnumIngots.ingotCopper));
        tabHephaestusParts.init(EnumHelper.getItemIS(EnumHandle.handleWood));
        tabHephaestusTools.init(EnumHelper.getItemIS(EnumHandle.handleWood));
    }
}