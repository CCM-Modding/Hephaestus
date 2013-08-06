package ccm.dendritis.utils.registry;

import net.minecraftforge.oredict.OreDictionary;
import ccm.dendritis.Dendritis;
import ccm.dendritis.enums.blocks.EnumBlocks;
import ccm.dendritis.enums.blocks.EnumOres;
import ccm.dendritis.enums.items.EnumGems;
import ccm.nucleum_omnium.handler.LogHandler;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class OreDictionaryRegistry {

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary() {
        LogHandler.finest(Dendritis.instance, "Adding Ore Dictionary Entries");

        OreDictionary.registerOre("gemAmethyst", EnumToItemStack.getItemIS(EnumGems.gemAmethyst));
        OreDictionary.registerOre("gemBDiamond", EnumToItemStack.getItemIS(EnumGems.gemBDiamond));
        OreDictionary.registerOre("gemCitrine", EnumToItemStack.getItemIS(EnumGems.gemCitrine));
        OreDictionary.registerOre("gemCZirconia", EnumToItemStack.getItemIS(EnumGems.gemCZirconia));
        OreDictionary.registerOre("gemFuchsia", EnumToItemStack.getItemIS(EnumGems.gemFuchsia));
        OreDictionary.registerOre("gemJet", EnumToItemStack.getItemIS(EnumGems.gemJet));
        OreDictionary.registerOre("gemOlivine", EnumToItemStack.getItemIS(EnumGems.gemOlivine));
        OreDictionary.registerOre("gemOpal", EnumToItemStack.getItemIS(EnumGems.gemOpal));
        OreDictionary.registerOre("gemRuby", EnumToItemStack.getItemIS(EnumGems.gemRuby));
        OreDictionary.registerOre("gemSapphire", EnumToItemStack.getItemIS(EnumGems.gemSapphire));
        OreDictionary.registerOre("gemSQuartz", EnumToItemStack.getItemIS(EnumGems.gemSQuartz));
        OreDictionary.registerOre("gemSun", EnumToItemStack.getItemIS(EnumGems.gemSun));
        OreDictionary.registerOre("gemTopaz", EnumToItemStack.getItemIS(EnumGems.gemTopaz));
        OreDictionary.registerOre("gemTurquoise", EnumToItemStack.getItemIS(EnumGems.gemTurquoise));
        OreDictionary.registerOre("gemWAlabaster", EnumToItemStack.getItemIS(EnumGems.gemWAlabaster));

        OreDictionary.registerOre("oreAmethyst", EnumToItemStack.getBlockIS(EnumOres.oreAmethyst));
        OreDictionary.registerOre("oreBDiamond", EnumToItemStack.getBlockIS(EnumOres.oreBDiamond));
        OreDictionary.registerOre("oreCitrine", EnumToItemStack.getBlockIS(EnumOres.oreCitrine));
        OreDictionary.registerOre("oreCZirconia", EnumToItemStack.getBlockIS(EnumOres.oreCZirconia));
        OreDictionary.registerOre("oreFuchsia", EnumToItemStack.getBlockIS(EnumOres.oreFuchsia));
        OreDictionary.registerOre("oreJet", EnumToItemStack.getBlockIS(EnumOres.oreJet));
        OreDictionary.registerOre("oreOlivine", EnumToItemStack.getBlockIS(EnumOres.oreOlivine));
        OreDictionary.registerOre("oreOpal", EnumToItemStack.getBlockIS(EnumOres.oreOpal));
        OreDictionary.registerOre("oreRuby", EnumToItemStack.getBlockIS(EnumOres.oreRuby));
        OreDictionary.registerOre("oreSapphire", EnumToItemStack.getBlockIS(EnumOres.oreSapphire));
        OreDictionary.registerOre("oreSQuartz", EnumToItemStack.getBlockIS(EnumOres.oreSQuartz));
        OreDictionary.registerOre("oreSun", EnumToItemStack.getBlockIS(EnumOres.oreSun));
        OreDictionary.registerOre("oreTopaz", EnumToItemStack.getBlockIS(EnumOres.oreTopaz));
        OreDictionary.registerOre("oreTurquoise", EnumToItemStack.getBlockIS(EnumOres.oreTurquoise));
        OreDictionary.registerOre("oreWAlabaster", EnumToItemStack.getBlockIS(EnumOres.oreWAlabaster));

        OreDictionary.registerOre("blockAmethyst", EnumToItemStack.getBlockIS(EnumBlocks.blockAmethyst));
        OreDictionary.registerOre("blockBDiamond", EnumToItemStack.getBlockIS(EnumBlocks.blockBDiamond));
        OreDictionary.registerOre("blockCitrine", EnumToItemStack.getBlockIS(EnumBlocks.blockCitrine));
        OreDictionary.registerOre("blockCZirconia", EnumToItemStack.getBlockIS(EnumBlocks.blockCZirconia));
        OreDictionary.registerOre("blockFuchsia", EnumToItemStack.getBlockIS(EnumBlocks.blockFuchsia));
        OreDictionary.registerOre("blockJet", EnumToItemStack.getBlockIS(EnumBlocks.blockJet));
        OreDictionary.registerOre("blockOlivine", EnumToItemStack.getBlockIS(EnumBlocks.blockOlivine));
        OreDictionary.registerOre("blockOpal", EnumToItemStack.getBlockIS(EnumBlocks.blockOpal));
        OreDictionary.registerOre("blockRuby", EnumToItemStack.getBlockIS(EnumBlocks.blockRuby));
        OreDictionary.registerOre("blockSapphire", EnumToItemStack.getBlockIS(EnumBlocks.blockSapphire));
        OreDictionary.registerOre("blockSQuartz", EnumToItemStack.getBlockIS(EnumBlocks.blockSQuartz));
        OreDictionary.registerOre("blockSun", EnumToItemStack.getBlockIS(EnumBlocks.blockSun));
        OreDictionary.registerOre("blockTopaz", EnumToItemStack.getBlockIS(EnumBlocks.blockTopaz));
        OreDictionary.registerOre("blockTurquoise", EnumToItemStack.getBlockIS(EnumBlocks.blockTurquoise));
        OreDictionary.registerOre("blockWAlabaster", EnumToItemStack.getBlockIS(EnumBlocks.blockWAlabaster));
    }
}