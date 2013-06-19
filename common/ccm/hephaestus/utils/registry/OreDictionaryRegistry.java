package ccm.hephaestus.utils.registry;

import net.minecraftforge.oredict.OreDictionary;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.enums.EnumBlocks;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class OreDictionaryRegistry {
    
    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary() {
        Handler.log(Hephaestus.instance, "Adding Ore Dictionary Entries");
        
        OreDictionary.registerOre("naturalAluminum", EnumToItemStack.getItemIS(EnumIngots.ingotAluminum));
        OreDictionary.registerOre("ingotAluminium", EnumToItemStack.getItemIS(EnumIngots.ingotAluminum));
        OreDictionary.registerOre("ingotAluminum", EnumToItemStack.getItemIS(EnumIngots.ingotAluminum));
        OreDictionary.registerOre("ingotCopper", EnumToItemStack.getItemIS(EnumIngots.ingotCopper));
        OreDictionary.registerOre("ingotLead", EnumToItemStack.getItemIS(EnumIngots.ingotLead));
        OreDictionary.registerOre("ingotSilver", EnumToItemStack.getItemIS(EnumIngots.ingotSilver));
        OreDictionary.registerOre("ingotTin", EnumToItemStack.getItemIS(EnumIngots.ingotTin));
        OreDictionary.registerOre("ingotTitanium", EnumToItemStack.getItemIS(EnumIngots.ingotTitanium));
        OreDictionary.registerOre("ingotTungsten", EnumToItemStack.getItemIS(EnumIngots.ingotTungsten));
        
        OreDictionary.registerOre("dustAluminium", EnumToItemStack.getItemIS(EnumDusts.dustAluminum));
        OreDictionary.registerOre("dustAluminum", EnumToItemStack.getItemIS(EnumDusts.dustAluminum));
        OreDictionary.registerOre("dustCopper", EnumToItemStack.getItemIS(EnumDusts.dustCopper));
        OreDictionary.registerOre("dustGold", EnumToItemStack.getItemIS(EnumDusts.dustGold));
        OreDictionary.registerOre("dustIron", EnumToItemStack.getItemIS(EnumDusts.dustIron));
        OreDictionary.registerOre("dustLead", EnumToItemStack.getItemIS(EnumDusts.dustLead));
        OreDictionary.registerOre("dustSilver", EnumToItemStack.getItemIS(EnumDusts.dustSilver));
        OreDictionary.registerOre("dustSulphur", EnumToItemStack.getItemIS(EnumDusts.dustSulfur));
        OreDictionary.registerOre("dustSulfur", EnumToItemStack.getItemIS(EnumDusts.dustSulfur));
        OreDictionary.registerOre("dustTin", EnumToItemStack.getItemIS(EnumDusts.dustTin));
        OreDictionary.registerOre("dustTitanium", EnumToItemStack.getItemIS(EnumDusts.dustTitanium));
        OreDictionary.registerOre("dustTungsten", EnumToItemStack.getItemIS(EnumDusts.dustTungsten));
        
        OreDictionary.registerOre("blockNaturalAluminum", EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum));
        OreDictionary.registerOre("blockAluminum", EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum));
        OreDictionary.registerOre("blockAluminum", EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum));
        OreDictionary.registerOre("blockCopper", EnumToItemStack.getBlockIS(EnumBlocks.blockCopper));
        OreDictionary.registerOre("blockLead", EnumToItemStack.getBlockIS(EnumBlocks.blockLead));
        OreDictionary.registerOre("blockSilver", EnumToItemStack.getBlockIS(EnumBlocks.blockSilver));
        OreDictionary.registerOre("blockSulphur", EnumToItemStack.getBlockIS(EnumBlocks.blockSulfur));
        OreDictionary.registerOre("blockSulfur", EnumToItemStack.getBlockIS(EnumBlocks.blockSulfur));
        OreDictionary.registerOre("blockTin", EnumToItemStack.getBlockIS(EnumBlocks.blockTin));
        OreDictionary.registerOre("blockTitanium", EnumToItemStack.getBlockIS(EnumBlocks.blockTitanium));
        OreDictionary.registerOre("blockTungsten", EnumToItemStack.getBlockIS(EnumBlocks.blockTungsten));
        
        OreDictionary.registerOre("oreNaturalAluminium", EnumToItemStack.getBlockIS(EnumOres.oreAluminum));
        OreDictionary.registerOre("oreAluminium", EnumToItemStack.getBlockIS(EnumOres.oreAluminum));
        OreDictionary.registerOre("oreAluminum", EnumToItemStack.getBlockIS(EnumOres.oreAluminum));
        OreDictionary.registerOre("oreCopper", EnumToItemStack.getBlockIS(EnumOres.oreCopper));
        OreDictionary.registerOre("oreLead", EnumToItemStack.getBlockIS(EnumOres.oreLead));
        OreDictionary.registerOre("oreSilver", EnumToItemStack.getBlockIS(EnumOres.oreSilver));
        OreDictionary.registerOre("oreSulphur", EnumToItemStack.getBlockIS(EnumOres.oreSulfur));
        OreDictionary.registerOre("oreSulfur", EnumToItemStack.getBlockIS(EnumOres.oreSulfur));
        OreDictionary.registerOre("oreTin", EnumToItemStack.getBlockIS(EnumOres.oreTin));
        OreDictionary.registerOre("oreTitanium", EnumToItemStack.getBlockIS(EnumOres.oreTitanium));
        OreDictionary.registerOre("oreTungsten", EnumToItemStack.getBlockIS(EnumOres.oreTungsten));
    }
}