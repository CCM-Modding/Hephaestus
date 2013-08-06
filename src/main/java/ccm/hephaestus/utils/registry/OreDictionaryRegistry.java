package ccm.hephaestus.utils.registry;

import net.minecraftforge.oredict.OreDictionary;
import ccm.dendritis.enums.blocks.EnumBlocksD;
import ccm.dendritis.enums.blocks.EnumOresD;
import ccm.dendritis.enums.items.EnumGemsD;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.enums.blocks.EnumBlocksH;
import ccm.hephaestus.enums.blocks.EnumOresH;
import ccm.hephaestus.enums.items.EnumDustsH;
import ccm.hephaestus.enums.items.EnumIngotsH;
import ccm.nucleum_omnium.utils.handler.LogHandler;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class OreDictionaryRegistry {

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary() {
        LogHandler.finest(Hephaestus.instance, "Adding Ore Dictionary Entries");

        OreDictionary.registerOre("naturalAluminum", EnumToItemStack.getItemIS(EnumIngotsH.ingotAluminum));
        OreDictionary.registerOre("ingotAluminium", EnumToItemStack.getItemIS(EnumIngotsH.ingotAluminum));
        OreDictionary.registerOre("ingotAluminum", EnumToItemStack.getItemIS(EnumIngotsH.ingotAluminum));
        OreDictionary.registerOre("ingotCopper", EnumToItemStack.getItemIS(EnumIngotsH.ingotCopper));
        OreDictionary.registerOre("ingotLead", EnumToItemStack.getItemIS(EnumIngotsH.ingotLead));
        OreDictionary.registerOre("ingotSilver", EnumToItemStack.getItemIS(EnumIngotsH.ingotSilver));
        OreDictionary.registerOre("ingotTin", EnumToItemStack.getItemIS(EnumIngotsH.ingotTin));
        OreDictionary.registerOre("ingotTitanium", EnumToItemStack.getItemIS(EnumIngotsH.ingotTitanium));
        OreDictionary.registerOre("ingotTungsten", EnumToItemStack.getItemIS(EnumIngotsH.ingotTungsten));

        OreDictionary.registerOre("dustAluminium", EnumToItemStack.getItemIS(EnumDustsH.dustAluminum));
        OreDictionary.registerOre("dustAluminum", EnumToItemStack.getItemIS(EnumDustsH.dustAluminum));
        OreDictionary.registerOre("dustCopper", EnumToItemStack.getItemIS(EnumDustsH.dustCopper));
        OreDictionary.registerOre("dustGold", EnumToItemStack.getItemIS(EnumDustsH.dustGold));
        OreDictionary.registerOre("dustIron", EnumToItemStack.getItemIS(EnumDustsH.dustIron));
        OreDictionary.registerOre("dustLead", EnumToItemStack.getItemIS(EnumDustsH.dustLead));
        OreDictionary.registerOre("dustSilver", EnumToItemStack.getItemIS(EnumDustsH.dustSilver));
        OreDictionary.registerOre("dustSulphur", EnumToItemStack.getItemIS(EnumDustsH.dustSulfur));
        OreDictionary.registerOre("dustSulfur", EnumToItemStack.getItemIS(EnumDustsH.dustSulfur));
        OreDictionary.registerOre("dustTin", EnumToItemStack.getItemIS(EnumDustsH.dustTin));
        OreDictionary.registerOre("dustTitanium", EnumToItemStack.getItemIS(EnumDustsH.dustTitanium));
        OreDictionary.registerOre("dustTungsten", EnumToItemStack.getItemIS(EnumDustsH.dustTungsten));

        OreDictionary.registerOre("blockNaturalAluminum", EnumToItemStack.getBlockIS(EnumBlocksH.blockAluminum));
        OreDictionary.registerOre("blockAluminum", EnumToItemStack.getBlockIS(EnumBlocksH.blockAluminum));
        OreDictionary.registerOre("blockAluminum", EnumToItemStack.getBlockIS(EnumBlocksH.blockAluminum));
        OreDictionary.registerOre("blockCopper", EnumToItemStack.getBlockIS(EnumBlocksH.blockCopper));
        OreDictionary.registerOre("blockLead", EnumToItemStack.getBlockIS(EnumBlocksH.blockLead));
        OreDictionary.registerOre("blockSilver", EnumToItemStack.getBlockIS(EnumBlocksH.blockSilver));
        OreDictionary.registerOre("blockSulphur", EnumToItemStack.getBlockIS(EnumBlocksH.blockSulfur));
        OreDictionary.registerOre("blockSulfur", EnumToItemStack.getBlockIS(EnumBlocksH.blockSulfur));
        OreDictionary.registerOre("blockTin", EnumToItemStack.getBlockIS(EnumBlocksH.blockTin));
        OreDictionary.registerOre("blockTitanium", EnumToItemStack.getBlockIS(EnumBlocksH.blockTitanium));
        OreDictionary.registerOre("blockTungsten", EnumToItemStack.getBlockIS(EnumBlocksH.blockTungsten));

        OreDictionary.registerOre("oreNaturalAluminium", EnumToItemStack.getBlockIS(EnumOresH.oreAluminum));
        OreDictionary.registerOre("oreAluminium", EnumToItemStack.getBlockIS(EnumOresH.oreAluminum));
        OreDictionary.registerOre("oreAluminum", EnumToItemStack.getBlockIS(EnumOresH.oreAluminum));
        OreDictionary.registerOre("oreCopper", EnumToItemStack.getBlockIS(EnumOresH.oreCopper));
        OreDictionary.registerOre("oreLead", EnumToItemStack.getBlockIS(EnumOresH.oreLead));
        OreDictionary.registerOre("oreSilver", EnumToItemStack.getBlockIS(EnumOresH.oreSilver));
        OreDictionary.registerOre("oreSulphur", EnumToItemStack.getBlockIS(EnumOresH.oreSulfur));
        OreDictionary.registerOre("oreSulfur", EnumToItemStack.getBlockIS(EnumOresH.oreSulfur));
        OreDictionary.registerOre("oreTin", EnumToItemStack.getBlockIS(EnumOresH.oreTin));
        OreDictionary.registerOre("oreTitanium", EnumToItemStack.getBlockIS(EnumOresH.oreTitanium));
        OreDictionary.registerOre("oreTungsten", EnumToItemStack.getBlockIS(EnumOresH.oreTungsten));

        // Dendritis

        OreDictionary.registerOre("gemAmethyst", EnumToItemStack.getItemIS(EnumGemsD.gemAmethyst));
        OreDictionary.registerOre("gemBDiamond", EnumToItemStack.getItemIS(EnumGemsD.gemBDiamond));
        OreDictionary.registerOre("gemCitrine", EnumToItemStack.getItemIS(EnumGemsD.gemCitrine));
        OreDictionary.registerOre("gemCZirconia", EnumToItemStack.getItemIS(EnumGemsD.gemCZirconia));
        OreDictionary.registerOre("gemFuchsia", EnumToItemStack.getItemIS(EnumGemsD.gemFuchsia));
        OreDictionary.registerOre("gemJet", EnumToItemStack.getItemIS(EnumGemsD.gemJet));
        OreDictionary.registerOre("gemOlivine", EnumToItemStack.getItemIS(EnumGemsD.gemOlivine));
        OreDictionary.registerOre("gemOpal", EnumToItemStack.getItemIS(EnumGemsD.gemOpal));
        OreDictionary.registerOre("gemRuby", EnumToItemStack.getItemIS(EnumGemsD.gemRuby));
        OreDictionary.registerOre("gemSapphire", EnumToItemStack.getItemIS(EnumGemsD.gemSapphire));
        OreDictionary.registerOre("gemSQuartz", EnumToItemStack.getItemIS(EnumGemsD.gemSQuartz));
        OreDictionary.registerOre("gemSun", EnumToItemStack.getItemIS(EnumGemsD.gemSun));
        OreDictionary.registerOre("gemTopaz", EnumToItemStack.getItemIS(EnumGemsD.gemTopaz));
        OreDictionary.registerOre("gemTurquoise", EnumToItemStack.getItemIS(EnumGemsD.gemTurquoise));
        OreDictionary.registerOre("gemWAlabaster", EnumToItemStack.getItemIS(EnumGemsD.gemWAlabaster));

        OreDictionary.registerOre("oreAmethyst", EnumToItemStack.getBlockIS(EnumOresD.oreAmethyst));
        OreDictionary.registerOre("oreBDiamond", EnumToItemStack.getBlockIS(EnumOresD.oreBDiamond));
        OreDictionary.registerOre("oreCitrine", EnumToItemStack.getBlockIS(EnumOresD.oreCitrine));
        OreDictionary.registerOre("oreCZirconia", EnumToItemStack.getBlockIS(EnumOresD.oreCZirconia));
        OreDictionary.registerOre("oreFuchsia", EnumToItemStack.getBlockIS(EnumOresD.oreFuchsia));
        OreDictionary.registerOre("oreJet", EnumToItemStack.getBlockIS(EnumOresD.oreJet));
        OreDictionary.registerOre("oreOlivine", EnumToItemStack.getBlockIS(EnumOresD.oreOlivine));
        OreDictionary.registerOre("oreOpal", EnumToItemStack.getBlockIS(EnumOresD.oreOpal));
        OreDictionary.registerOre("oreRuby", EnumToItemStack.getBlockIS(EnumOresD.oreRuby));
        OreDictionary.registerOre("oreSapphire", EnumToItemStack.getBlockIS(EnumOresD.oreSapphire));
        OreDictionary.registerOre("oreSQuartz", EnumToItemStack.getBlockIS(EnumOresD.oreSQuartz));
        OreDictionary.registerOre("oreSun", EnumToItemStack.getBlockIS(EnumOresD.oreSun));
        OreDictionary.registerOre("oreTopaz", EnumToItemStack.getBlockIS(EnumOresD.oreTopaz));
        OreDictionary.registerOre("oreTurquoise", EnumToItemStack.getBlockIS(EnumOresD.oreTurquoise));
        OreDictionary.registerOre("oreWAlabaster", EnumToItemStack.getBlockIS(EnumOresD.oreWAlabaster));

        OreDictionary.registerOre("blockAmethyst", EnumToItemStack.getBlockIS(EnumBlocksD.blockAmethyst));
        OreDictionary.registerOre("blockBDiamond", EnumToItemStack.getBlockIS(EnumBlocksD.blockBDiamond));
        OreDictionary.registerOre("blockCitrine", EnumToItemStack.getBlockIS(EnumBlocksD.blockCitrine));
        OreDictionary.registerOre("blockCZirconia", EnumToItemStack.getBlockIS(EnumBlocksD.blockCZirconia));
        OreDictionary.registerOre("blockFuchsia", EnumToItemStack.getBlockIS(EnumBlocksD.blockFuchsia));
        OreDictionary.registerOre("blockJet", EnumToItemStack.getBlockIS(EnumBlocksD.blockJet));
        OreDictionary.registerOre("blockOlivine", EnumToItemStack.getBlockIS(EnumBlocksD.blockOlivine));
        OreDictionary.registerOre("blockOpal", EnumToItemStack.getBlockIS(EnumBlocksD.blockOpal));
        OreDictionary.registerOre("blockRuby", EnumToItemStack.getBlockIS(EnumBlocksD.blockRuby));
        OreDictionary.registerOre("blockSapphire", EnumToItemStack.getBlockIS(EnumBlocksD.blockSapphire));
        OreDictionary.registerOre("blockSQuartz", EnumToItemStack.getBlockIS(EnumBlocksD.blockSQuartz));
        OreDictionary.registerOre("blockSun", EnumToItemStack.getBlockIS(EnumBlocksD.blockSun));
        OreDictionary.registerOre("blockTopaz", EnumToItemStack.getBlockIS(EnumBlocksD.blockTopaz));
        OreDictionary.registerOre("blockTurquoise", EnumToItemStack.getBlockIS(EnumBlocksD.blockTurquoise));
        OreDictionary.registerOre("blockWAlabaster", EnumToItemStack.getBlockIS(EnumBlocksD.blockWAlabaster));
    }
}