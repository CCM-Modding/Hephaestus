package ccm.hephaestus.utils.registry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.enums.EnumBlocksM;
import ccm.hephaestus.block.enums.EnumOresM;
import ccm.hephaestus.item.enums.EnumDust;
import ccm.hephaestus.item.enums.EnumGem;
import ccm.hephaestus.item.enums.EnumIngot;
import ccm.nucleum.omnium.utils.handler.LogHandler;
import ccm.nucleum.omnium.utils.helper.enums.EnumToItemStack;

final class OreDictionaryRegistry
{

    /**
     * Registers all the Entries to the Ore Dictionary.
     */
    protected static void oreDictionary()
    {
        LogHandler.finest(Hephaestus.instance, "Adding Ore Dictionary Entries");

        register("naturalAluminum", EnumToItemStack.getItemIS(EnumIngot.ingotAluminum));
        register("ingotAluminium", EnumToItemStack.getItemIS(EnumIngot.ingotAluminum));
        register("ingotAluminum", EnumToItemStack.getItemIS(EnumIngot.ingotAluminum));
        register("ingotCopper", EnumToItemStack.getItemIS(EnumIngot.ingotCopper));
        register("ingotSilver", EnumToItemStack.getItemIS(EnumIngot.ingotSilver));
        register("ingotTin", EnumToItemStack.getItemIS(EnumIngot.ingotTin));
        register("ingotTitanium", EnumToItemStack.getItemIS(EnumIngot.ingotTitanium));

        register("dustAluminium", EnumToItemStack.getItemIS(EnumDust.dustAluminum));
        register("dustAluminum", EnumToItemStack.getItemIS(EnumDust.dustAluminum));
        register("dustCopper", EnumToItemStack.getItemIS(EnumDust.dustCopper));
        register("dustGold", EnumToItemStack.getItemIS(EnumDust.dustGold));
        register("dustIron", EnumToItemStack.getItemIS(EnumDust.dustIron));
        register("dustSilver", EnumToItemStack.getItemIS(EnumDust.dustSilver));
        register("dustSulphur", EnumToItemStack.getItemIS(EnumDust.dustSulfur));
        register("dustSulfur", EnumToItemStack.getItemIS(EnumDust.dustSulfur));
        register("dustTin", EnumToItemStack.getItemIS(EnumDust.dustTin));
        register("dustTitanium", EnumToItemStack.getItemIS(EnumDust.dustTitanium));

        register("blockNaturalAluminum", EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum));
        register("blockAluminum", EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum));
        register("blockAluminum", EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum));
        register("blockCopper", EnumToItemStack.getBlockIS(EnumBlocksM.blockCopper));
        register("blockSilver", EnumToItemStack.getBlockIS(EnumBlocksM.blockSilver));
        register("blockSulphur", EnumToItemStack.getBlockIS(EnumBlocksM.blockSulfur));
        register("blockSulfur", EnumToItemStack.getBlockIS(EnumBlocksM.blockSulfur));
        register("blockTin", EnumToItemStack.getBlockIS(EnumBlocksM.blockTin));
        register("blockTitanium", EnumToItemStack.getBlockIS(EnumBlocksM.blockTitanium));

        register("oreNaturalAluminium", EnumToItemStack.getBlockIS(EnumOresM.oreAluminum));
        register("oreAluminium", EnumToItemStack.getBlockIS(EnumOresM.oreAluminum));
        register("oreAluminum", EnumToItemStack.getBlockIS(EnumOresM.oreAluminum));
        register("oreCopper", EnumToItemStack.getBlockIS(EnumOresM.oreCopper));
        register("oreSilver", EnumToItemStack.getBlockIS(EnumOresM.oreSilver));
        register("oreSulphur", EnumToItemStack.getBlockIS(EnumOresM.oreSulfur));
        register("oreSulfur", EnumToItemStack.getBlockIS(EnumOresM.oreSulfur));
        register("oreTin", EnumToItemStack.getBlockIS(EnumOresM.oreTin));
        register("oreTitanium", EnumToItemStack.getBlockIS(EnumOresM.oreTitanium));

        register("gemCitrine", EnumToItemStack.getItemIS(EnumGem.gemCitrine));
        register("gemCZirconia", EnumToItemStack.getItemIS(EnumGem.gemCZirconia));
        register("gemOlivine", EnumToItemStack.getItemIS(EnumGem.gemOlivine));
        register("gemRuby", EnumToItemStack.getItemIS(EnumGem.gemRuby));
        register("gemSapphire", EnumToItemStack.getItemIS(EnumGem.gemSapphire));
        register("gemTopaz", EnumToItemStack.getItemIS(EnumGem.gemTopaz));

        register("blockCitrine", EnumToItemStack.getBlockIS(EnumBlocksM.blockCitrine));
        register("blockCZirconia", EnumToItemStack.getBlockIS(EnumBlocksM.blockCZirconia));
        register("blockOlivine", EnumToItemStack.getBlockIS(EnumBlocksM.blockOlivine));
        register("blockRuby", EnumToItemStack.getBlockIS(EnumBlocksM.blockRuby));
        register("blockSapphire", EnumToItemStack.getBlockIS(EnumBlocksM.blockSapphire));
        register("blockTopaz", EnumToItemStack.getBlockIS(EnumBlocksM.blockTopaz));

        register("oreCitrine", EnumToItemStack.getBlockIS(EnumOresM.oreCitrine));
        register("oreCZirconia", EnumToItemStack.getBlockIS(EnumOresM.oreCZirconia));
        register("oreOlivine", EnumToItemStack.getBlockIS(EnumOresM.oreOlivine));
        register("oreRuby", EnumToItemStack.getBlockIS(EnumOresM.oreRuby));
        register("oreSapphire", EnumToItemStack.getBlockIS(EnumOresM.oreSapphire));
        register("oreTopaz", EnumToItemStack.getBlockIS(EnumOresM.oreTopaz));
    }

    private static void register(final String name, final ItemStack ore)
    {
        OreDictionary.registerOre(name, ore);
    }
}