package ccm.hephaestus.utils.registry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.enums.EnumBlocksD;
import ccm.hephaestus.block.enums.EnumBlocksG;
import ccm.hephaestus.block.enums.EnumBlocksM;
import ccm.hephaestus.block.enums.EnumOresD;
import ccm.hephaestus.block.enums.EnumOresG;
import ccm.hephaestus.block.enums.EnumOresM;
import ccm.hephaestus.item.enums.EnumDust;
import ccm.hephaestus.item.enums.EnumGem;
import ccm.hephaestus.item.enums.EnumIngot;
import ccm.nucleum_omnium.utils.handler.LogHandler;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class OreDictionaryRegistry {

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary() {
        LogHandler.finest(Hephaestus.instance, "Adding Ore Dictionary Entries");

        register("naturalAluminum", EnumToItemStack.getItemIS(EnumIngot.ingotAluminum));
        register("ingotAluminium", EnumToItemStack.getItemIS(EnumIngot.ingotAluminum));
        register("ingotAluminum", EnumToItemStack.getItemIS(EnumIngot.ingotAluminum));
        register("ingotCopper", EnumToItemStack.getItemIS(EnumIngot.ingotCopper));
        register("ingotLead", EnumToItemStack.getItemIS(EnumIngot.ingotLead));
        register("ingotSilver", EnumToItemStack.getItemIS(EnumIngot.ingotSilver));
        register("ingotTin", EnumToItemStack.getItemIS(EnumIngot.ingotTin));
        register("ingotTitanium", EnumToItemStack.getItemIS(EnumIngot.ingotTitanium));
        register("ingotTungsten", EnumToItemStack.getItemIS(EnumIngot.ingotTungsten));

        register("dustAluminium", EnumToItemStack.getItemIS(EnumDust.dustAluminum));
        register("dustAluminum", EnumToItemStack.getItemIS(EnumDust.dustAluminum));
        register("dustCopper", EnumToItemStack.getItemIS(EnumDust.dustCopper));
        register("dustGold", EnumToItemStack.getItemIS(EnumDust.dustGold));
        register("dustIron", EnumToItemStack.getItemIS(EnumDust.dustIron));
        register("dustLead", EnumToItemStack.getItemIS(EnumDust.dustLead));
        register("dustSilver", EnumToItemStack.getItemIS(EnumDust.dustSilver));
        register("dustSulphur", EnumToItemStack.getItemIS(EnumDust.dustSulfur));
        register("dustSulfur", EnumToItemStack.getItemIS(EnumDust.dustSulfur));
        register("dustTin", EnumToItemStack.getItemIS(EnumDust.dustTin));
        register("dustTitanium", EnumToItemStack.getItemIS(EnumDust.dustTitanium));
        register("dustTungsten", EnumToItemStack.getItemIS(EnumDust.dustTungsten));

        register("blockNaturalAluminum", EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum));
        register("blockAluminum", EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum));
        register("blockAluminum", EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum));
        register("blockCopper", EnumToItemStack.getBlockIS(EnumBlocksM.blockCopper));
        register("blockLead", EnumToItemStack.getBlockIS(EnumBlocksM.blockLead));
        register("blockSilver", EnumToItemStack.getBlockIS(EnumBlocksM.blockSilver));
        register("blockSulphur", EnumToItemStack.getBlockIS(EnumBlocksD.blockSulfur));
        register("blockSulfur", EnumToItemStack.getBlockIS(EnumBlocksD.blockSulfur));
        register("blockTin", EnumToItemStack.getBlockIS(EnumBlocksM.blockTin));
        register("blockTitanium", EnumToItemStack.getBlockIS(EnumBlocksM.blockTitanium));
        register("blockTungsten", EnumToItemStack.getBlockIS(EnumBlocksM.blockTungsten));

        register("oreNaturalAluminium", EnumToItemStack.getBlockIS(EnumOresM.oreAluminum));
        register("oreAluminium", EnumToItemStack.getBlockIS(EnumOresM.oreAluminum));
        register("oreAluminum", EnumToItemStack.getBlockIS(EnumOresM.oreAluminum));
        register("oreCopper", EnumToItemStack.getBlockIS(EnumOresM.oreCopper));
        register("oreLead", EnumToItemStack.getBlockIS(EnumOresM.oreLead));
        register("oreSilver", EnumToItemStack.getBlockIS(EnumOresM.oreSilver));
        register("oreSulphur", EnumToItemStack.getBlockIS(EnumOresD.oreSulfur));
        register("oreSulfur", EnumToItemStack.getBlockIS(EnumOresD.oreSulfur));
        register("oreTin", EnumToItemStack.getBlockIS(EnumOresM.oreTin));
        register("oreTitanium", EnumToItemStack.getBlockIS(EnumOresM.oreTitanium));
        register("oreTungsten", EnumToItemStack.getBlockIS(EnumOresM.oreTungsten));

        register("gemCitrine", EnumToItemStack.getItemIS(EnumGem.gemCitrine));
        register("gemCZirconia", EnumToItemStack.getItemIS(EnumGem.gemCZirconia));
        register("gemJet", EnumToItemStack.getItemIS(EnumGem.gemJet));
        register("gemOlivine", EnumToItemStack.getItemIS(EnumGem.gemOlivine));
        register("gemOpal", EnumToItemStack.getItemIS(EnumGem.gemOpal));
        register("gemRuby", EnumToItemStack.getItemIS(EnumGem.gemRuby));
        register("gemSapphire", EnumToItemStack.getItemIS(EnumGem.gemSapphire));
        register("gemSun", EnumToItemStack.getItemIS(EnumGem.gemSun));
        register("gemTopaz", EnumToItemStack.getItemIS(EnumGem.gemTopaz));
        register("gemWAlabaster", EnumToItemStack.getItemIS(EnumGem.gemWAlabaster));

        register("blockCitrine", EnumToItemStack.getBlockIS(EnumBlocksG.blockCitrine));
        register("blockCZirconia", EnumToItemStack.getBlockIS(EnumBlocksG.blockCZirconia));
        register("blockJet", EnumToItemStack.getBlockIS(EnumBlocksG.blockJet));
        register("blockOlivine", EnumToItemStack.getBlockIS(EnumBlocksG.blockOlivine));
        register("blockOpal", EnumToItemStack.getBlockIS(EnumBlocksG.blockOpal));
        register("blockRuby", EnumToItemStack.getBlockIS(EnumBlocksG.blockRuby));
        register("blockSapphire", EnumToItemStack.getBlockIS(EnumBlocksG.blockSapphire));
        register("blockSun", EnumToItemStack.getBlockIS(EnumBlocksG.blockSun));
        register("blockTopaz", EnumToItemStack.getBlockIS(EnumBlocksG.blockTopaz));
        register("blockWAlabaster", EnumToItemStack.getBlockIS(EnumBlocksG.blockWAlabaster));

        register("oreCitrine", EnumToItemStack.getBlockIS(EnumOresG.oreCitrine));
        register("oreCZirconia", EnumToItemStack.getBlockIS(EnumOresG.oreCZirconia));
        register("oreJet", EnumToItemStack.getBlockIS(EnumOresG.oreJet));
        register("oreOlivine", EnumToItemStack.getBlockIS(EnumOresG.oreOlivine));
        register("oreOpal", EnumToItemStack.getBlockIS(EnumOresG.oreOpal));
        register("oreRuby", EnumToItemStack.getBlockIS(EnumOresG.oreRuby));
        register("oreSapphire", EnumToItemStack.getBlockIS(EnumOresG.oreSapphire));
        register("oreSun", EnumToItemStack.getBlockIS(EnumOresG.oreSun));
        register("oreTopaz", EnumToItemStack.getBlockIS(EnumOresG.oreTopaz));
        register("oreWAlabaster", EnumToItemStack.getBlockIS(EnumOresG.oreWAlabaster));
    }

    private static void register(final String name, final ItemStack ore) {
        OreDictionary.registerOre(name, ore);
    }
}