package ccm.hephaestus.utils.registry;

import net.minecraftforge.oredict.OreDictionary;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.core.handlers.EHandler;
import ccm.hephaestus.enums.EnumBlocks;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.nucleum_omnium.handler.Handler;

final class OreDictionaryRegistry {

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary() {
        Handler.log(Hephaestus.instance, "Adding Ore Dictionary Entries");

        OreDictionary.registerOre("naturalAluminum", EHandler.getItem(EnumIngots.ingotAluminum));
        OreDictionary.registerOre("ingotAluminium", EHandler.getItem(EnumIngots.ingotAluminum));
        OreDictionary.registerOre("ingotAluminum", EHandler.getItem(EnumIngots.ingotAluminum));
        OreDictionary.registerOre("ingotCopper", EHandler.getItem(EnumIngots.ingotCopper));
        OreDictionary.registerOre("ingotLead", EHandler.getItem(EnumIngots.ingotLead));
        OreDictionary.registerOre("ingotSilver", EHandler.getItem(EnumIngots.ingotSilver));
        OreDictionary.registerOre("ingotTin", EHandler.getItem(EnumIngots.ingotTin));
        OreDictionary.registerOre("ingotTitanium", EHandler.getItem(EnumIngots.ingotTitanium));
        OreDictionary.registerOre("ingotTungsten", EHandler.getItem(EnumIngots.ingotTungsten));

        OreDictionary.registerOre("dustAluminium", EHandler.getItem(EnumDusts.dustAluminum));
        OreDictionary.registerOre("dustAluminum", EHandler.getItem(EnumDusts.dustAluminum));
        OreDictionary.registerOre("dustCopper", EHandler.getItem(EnumDusts.dustCopper));
        OreDictionary.registerOre("dustGold", EHandler.getItem(EnumDusts.dustGold));
        OreDictionary.registerOre("dustIron", EHandler.getItem(EnumDusts.dustIron));
        OreDictionary.registerOre("dustLead", EHandler.getItem(EnumDusts.dustLead));
        OreDictionary.registerOre("dustSilver", EHandler.getItem(EnumDusts.dustSilver));
        OreDictionary.registerOre("dustSulphur", EHandler.getItem(EnumDusts.dustSulfur));
        OreDictionary.registerOre("dustSulfur", EHandler.getItem(EnumDusts.dustSulfur));
        OreDictionary.registerOre("dustTin", EHandler.getItem(EnumDusts.dustTin));
        OreDictionary.registerOre("dustTitanium", EHandler.getItem(EnumDusts.dustTitanium));
        OreDictionary.registerOre("dustTungsten", EHandler.getItem(EnumDusts.dustTungsten));

        OreDictionary.registerOre("blockNaturalAluminum", EHandler.getItem(EnumBlocks.blockAluminum));
        OreDictionary.registerOre("blockAluminum", EHandler.getItem(EnumBlocks.blockAluminum));
        OreDictionary.registerOre("blockAluminum", EHandler.getItem(EnumBlocks.blockAluminum));
        OreDictionary.registerOre("blockCopper", EHandler.getItem(EnumBlocks.blockCopper));
        OreDictionary.registerOre("blockLead", EHandler.getItem(EnumBlocks.blockLead));
        OreDictionary.registerOre("blockSilver", EHandler.getItem(EnumBlocks.blockSilver));
        OreDictionary.registerOre("blockSulphur", EHandler.getItem(EnumBlocks.blockSulfur));
        OreDictionary.registerOre("blockSulfur", EHandler.getItem(EnumBlocks.blockSulfur));
        OreDictionary.registerOre("blockTin", EHandler.getItem(EnumBlocks.blockTin));
        OreDictionary.registerOre("blockTitanium", EHandler.getItem(EnumBlocks.blockTitanium));
        OreDictionary.registerOre("blockTungsten", EHandler.getItem(EnumBlocks.blockTungsten));

        OreDictionary.registerOre("oreNaturalAluminium", EHandler.getItem(EnumOres.oreAluminum));
        OreDictionary.registerOre("oreAluminium", EHandler.getItem(EnumOres.oreAluminum));
        OreDictionary.registerOre("oreAluminum", EHandler.getItem(EnumOres.oreAluminum));
        OreDictionary.registerOre("oreCopper", EHandler.getItem(EnumOres.oreCopper));
        OreDictionary.registerOre("oreLead", EHandler.getItem(EnumOres.oreLead));
        OreDictionary.registerOre("oreSilver", EHandler.getItem(EnumOres.oreSilver));
        OreDictionary.registerOre("oreSulphur", EHandler.getItem(EnumOres.oreSulfur));
        OreDictionary.registerOre("oreSulfur", EHandler.getItem(EnumOres.oreSulfur));
        OreDictionary.registerOre("oreTin", EHandler.getItem(EnumOres.oreTin));
        OreDictionary.registerOre("oreTitanium", EHandler.getItem(EnumOres.oreTitanium));
        OreDictionary.registerOre("oreTungsten", EHandler.getItem(EnumOres.oreTungsten));
    }
}