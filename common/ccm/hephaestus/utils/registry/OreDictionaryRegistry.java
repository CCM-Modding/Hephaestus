package ccm.hephaestus.utils.registry;

import net.minecraftforge.oredict.OreDictionary;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.enums.EnumBlocks;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.nucleum.handler.Handler;
import ccm.nucleum.helper.enums.EnumHelper;

final class OreDictionaryRegistry {

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary() {
        Handler.log(Hephaestus.instance, "Adding Ore Dictionary Entries");

        OreDictionary
                .registerOre("naturalAluminum", EnumHelper.getItemIS(EnumIngots.ingotAluminum));
        OreDictionary.registerOre("ingotAluminium", EnumHelper.getItemIS(EnumIngots.ingotAluminum));
        OreDictionary.registerOre("ingotAluminum", EnumHelper.getItemIS(EnumIngots.ingotAluminum));
        OreDictionary.registerOre("ingotCopper", EnumHelper.getItemIS(EnumIngots.ingotCopper));
        OreDictionary.registerOre("ingotLead", EnumHelper.getItemIS(EnumIngots.ingotLead));
        OreDictionary.registerOre("ingotSilver", EnumHelper.getItemIS(EnumIngots.ingotSilver));
        OreDictionary.registerOre("ingotTin", EnumHelper.getItemIS(EnumIngots.ingotTin));
        OreDictionary.registerOre("ingotTitanium", EnumHelper.getItemIS(EnumIngots.ingotTitanium));
        OreDictionary.registerOre("ingotTungsten", EnumHelper.getItemIS(EnumIngots.ingotTungsten));

        OreDictionary.registerOre("dustAluminium", EnumHelper.getItemIS(EnumDusts.dustAluminum));
        OreDictionary.registerOre("dustAluminum", EnumHelper.getItemIS(EnumDusts.dustAluminum));
        OreDictionary.registerOre("dustCopper", EnumHelper.getItemIS(EnumDusts.dustCopper));
        OreDictionary.registerOre("dustGold", EnumHelper.getItemIS(EnumDusts.dustGold));
        OreDictionary.registerOre("dustIron", EnumHelper.getItemIS(EnumDusts.dustIron));
        OreDictionary.registerOre("dustLead", EnumHelper.getItemIS(EnumDusts.dustLead));
        OreDictionary.registerOre("dustSilver", EnumHelper.getItemIS(EnumDusts.dustSilver));
        OreDictionary.registerOre("dustSulphur", EnumHelper.getItemIS(EnumDusts.dustSulfur));
        OreDictionary.registerOre("dustSulfur", EnumHelper.getItemIS(EnumDusts.dustSulfur));
        OreDictionary.registerOre("dustTin", EnumHelper.getItemIS(EnumDusts.dustTin));
        OreDictionary.registerOre("dustTitanium", EnumHelper.getItemIS(EnumDusts.dustTitanium));
        OreDictionary.registerOre("dustTungsten", EnumHelper.getItemIS(EnumDusts.dustTungsten));

        OreDictionary.registerOre("blockNaturalAluminum",
                EnumHelper.getBlockIS(EnumBlocks.blockAluminum));
        OreDictionary.registerOre("blockAluminum", EnumHelper.getBlockIS(EnumBlocks.blockAluminum));
        OreDictionary.registerOre("blockAluminum", EnumHelper.getBlockIS(EnumBlocks.blockAluminum));
        OreDictionary.registerOre("blockCopper", EnumHelper.getBlockIS(EnumBlocks.blockCopper));
        OreDictionary.registerOre("blockLead", EnumHelper.getBlockIS(EnumBlocks.blockLead));
        OreDictionary.registerOre("blockSilver", EnumHelper.getBlockIS(EnumBlocks.blockSilver));
        OreDictionary.registerOre("blockSulphur", EnumHelper.getBlockIS(EnumBlocks.blockSulfur));
        OreDictionary.registerOre("blockSulfur", EnumHelper.getBlockIS(EnumBlocks.blockSulfur));
        OreDictionary.registerOre("blockTin", EnumHelper.getBlockIS(EnumBlocks.blockTin));
        OreDictionary.registerOre("blockTitanium", EnumHelper.getBlockIS(EnumBlocks.blockTitanium));
        OreDictionary.registerOre("blockTungsten", EnumHelper.getBlockIS(EnumBlocks.blockTungsten));

        OreDictionary.registerOre("oreNaturalAluminium",
                EnumHelper.getBlockIS(EnumOres.oreAluminum));
        OreDictionary.registerOre("oreAluminium", EnumHelper.getBlockIS(EnumOres.oreAluminum));
        OreDictionary.registerOre("oreAluminum", EnumHelper.getBlockIS(EnumOres.oreAluminum));
        OreDictionary.registerOre("oreCopper", EnumHelper.getBlockIS(EnumOres.oreCopper));
        OreDictionary.registerOre("oreLead", EnumHelper.getBlockIS(EnumOres.oreLead));
        OreDictionary.registerOre("oreSilver", EnumHelper.getBlockIS(EnumOres.oreSilver));
        OreDictionary.registerOre("oreSulphur", EnumHelper.getBlockIS(EnumOres.oreSulfur));
        OreDictionary.registerOre("oreSulfur", EnumHelper.getBlockIS(EnumOres.oreSulfur));
        OreDictionary.registerOre("oreTin", EnumHelper.getBlockIS(EnumOres.oreTin));
        OreDictionary.registerOre("oreTitanium", EnumHelper.getBlockIS(EnumOres.oreTitanium));
        OreDictionary.registerOre("oreTungsten", EnumHelper.getBlockIS(EnumOres.oreTungsten));
    }
}