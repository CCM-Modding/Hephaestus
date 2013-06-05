package ccm.hephaestus.utils.registry;

import net.minecraft.item.ItemStack;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.enums.EnumOres;
import ccm.hephaestus.utils.lib.Archive;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.world.WorldGenerator;

final class WorldRegistry {

    /**
     * Registers all the World Generation.
     */
    protected static void registerWorld() {
        if (Properties.enableWorldGenAluminum) {
            registerAluminum();
        }
        if (Properties.enableWorldGenCopper) {
            registerCopper();
        }
        if (Properties.enableWorldGenLead) {
            registerLead();
        }
        if (Properties.enableWorldGenSilver) {
            registerSilver();
        }
        if (Properties.enableWorldGenSulfur) {
            registerSulfur();
        }
        if (Properties.enableWorldGenTin) {
            registerTin();
        }
        if (Properties.enableWorldGenTitanium) {
            registerTitanium();
        }
        if (Properties.enableWorldGenTungsten) {
            registerTungsten();
        }
    }

    private static void registerAluminum() {
        Handler.log(Hephaestus.instance, "Registering World Generation for Aluminum");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreAluminum.ordinal()), EnumOres.oreAluminum.name(), Properties.aluSize, Properties.aluDensity, Properties.aluMinHeight, Properties.aluMaxHeight, Properties.enableWorldGenAluminum);
    }

    private static void registerCopper() {
        Handler.log(Hephaestus.instance, "Registering World Generation for Copper");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreCopper.ordinal()), EnumOres.oreCopper.name(), Properties.copSize, Properties.copDensity, Properties.copMinHeight, Properties.copMaxHeight, Properties.enableWorldGenCopper);
    }

    private static void registerLead() {
        Handler.log(Hephaestus.instance, "Registering World Generation for Lead");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreLead.ordinal()), EnumOres.oreLead.name(), Properties.leadSize, Properties.leadDensity, Properties.leadMinHeight, Properties.leadMaxHeight, Properties.enableWorldGenLead);
    }

    private static void registerSilver() {
        Handler.log(Hephaestus.instance, "Registering World Generation for Silver");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSilver.ordinal()), EnumOres.oreSilver.name(), Properties.silSize, Properties.silDensity, Properties.silMinHeight, Properties.silMaxHeight, Properties.enableWorldGenSilver);
    }

    private static void registerSulfur() {
        Handler.log(Hephaestus.instance, "Registering World Generation for Sulfur");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSulfur.ordinal()), EnumOres.oreSulfur.name(), Properties.sulSize, Properties.sulDensity, Properties.sulMinHeight, Properties.sulMaxHeight, Properties.enableWorldGenSulfur);
    }

    private static void registerTin() {
        Handler.log(Hephaestus.instance, "Registering World Generation for Tin");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreTin.ordinal()), EnumOres.oreTin.name(), Properties.tinSize, Properties.tinDensity, Properties.tinMinHeight, Properties.tinMaxHeight, Properties.enableWorldGenTin);
    }

    private static void registerTitanium() {
        Handler.log(Hephaestus.instance, "Registering World Generation for Titanium");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreTitanium.ordinal()), EnumOres.oreTitanium.name(), Properties.titSize, Properties.titDensity, Properties.titMinHeight, Properties.titMaxHeight, Properties.enableWorldGenTitanium);
    }

    private static void registerTungsten() {
        Handler.log(Hephaestus.instance, "Registering World Generation for Tungsten");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreTungsten.ordinal()), EnumOres.oreTungsten.name(), Properties.tunSize, Properties.tunDensity, Properties.tunMinHeight, Properties.tunMaxHeight, Properties.enableWorldGenTungsten);
    }
}