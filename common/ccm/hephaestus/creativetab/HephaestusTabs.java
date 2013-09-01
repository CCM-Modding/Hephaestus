package ccm.hephaestus.creativetab;

import ccm.hephaestus.block.enums.EnumBlocksA;
import ccm.hephaestus.block.enums.EnumBlocksM;
import ccm.hephaestus.item.enums.EnumIngot;
import ccm.hephaestus.utils.lib.Archive;
import ccm.nucleum.omnium.creativetab.CreativeTab;
import ccm.nucleum.omnium.utils.helper.enums.EnumToItemStack;

public class HephaestusTabs
{

    /**
     * Tabs that Contains All the blocks
     */
    public static CreativeTab tabHephaestusBlocks;

    /**
     * Contains All the 64 Items
     */
    public static CreativeTab tabHephaestusItems;

    /**
     * Contains All the Food Items
     */
    public static CreativeTab tabHephaestusTools;

    /**
     * Contains All the Usable Items
     */
    public static CreativeTab tabHephaestusParts;

    public static void initTabs()
    {
        HephaestusTabs.tabHephaestusBlocks = new CreativeTab(Archive.TAB_HEPHAESTUS_BLOCK);
        HephaestusTabs.tabHephaestusItems = new CreativeTab(Archive.TAB_HEPHAESTUS_ITEMS);
        HephaestusTabs.tabHephaestusTools = new CreativeTab(Archive.TAB_HEPHAESTUS_TOOLS);
        HephaestusTabs.tabHephaestusParts = new CreativeTab(Archive.TAB_HEPHAESTUS_PARTS);
    }

    public static void initTabIcons()
    {
        HephaestusTabs.tabHephaestusBlocks.init(EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum));
        HephaestusTabs.tabHephaestusItems.init(EnumToItemStack.getItemIS(EnumIngot.ingotAluminum));
        HephaestusTabs.tabHephaestusTools.init(EnumToItemStack.getBlockIS(EnumBlocksA.blockSteel));
        HephaestusTabs.tabHephaestusParts.init(EnumToItemStack.getItemIS(EnumIngot.ingotSteel));
    }
}