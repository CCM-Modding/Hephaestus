package ccm.hephaestus.utils.registry;

import net.minecraft.item.ItemStack;
import ccm.dendritis.Dendritis;
import ccm.dendritis.enums.blocks.EnumOresD;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.enums.blocks.EnumOresH;
import ccm.hephaestus.utils.lib.Archive;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.utils.handler.LogHandler;
import ccm.nucleum_world.WorldGenerator;

final class WorldRegistry {

    /**
     * Registers all the World Generation.
     */
    protected static void registerWorld() {

        if (Properties.enableWorldGenAluminum) {
            WorldRegistry.registerAluminum();
        }
        if (Properties.enableWorldGenCopper) {
            WorldRegistry.registerCopper();
        }
        if (Properties.enableWorldGenLead) {
            WorldRegistry.registerLead();
        }
        if (Properties.enableWorldGenSilver) {
            WorldRegistry.registerSilver();
        }
        if (Properties.enableWorldGenSulfur) {
            WorldRegistry.registerSulfur();
        }
        if (Properties.enableWorldGenTin) {
            WorldRegistry.registerTin();
        }
        if (Properties.enableWorldGenTitanium) {
            WorldRegistry.registerTitanium();
        }
        if (Properties.enableWorldGenTungsten) {
            WorldRegistry.registerTungsten();
        }

        // Dendritis

        if (Properties.enableWorldGenAmethyst) {
            WorldRegistry.registerAmethyst();
        }
        if (Properties.enableWorldGenBDiamond) {
            WorldRegistry.registerBDiamond();
        }
        if (Properties.enableWorldGenCitrine) {
            WorldRegistry.registerCitrine();
        }
        if (Properties.enableWorldGenCZirconia) {
            WorldRegistry.registerCZirconia();
        }
        if (Properties.enableWorldGenFuchsia) {
            WorldRegistry.registerFuchsia();
        }
        if (Properties.enableWorldGenJet) {
            WorldRegistry.registerJet();
        }
        if (Properties.enableWorldGenOlivine) {
            WorldRegistry.registerOlivine();
        }
        if (Properties.enableWorldGenOpal) {
            WorldRegistry.registerOpal();
        }
        if (Properties.enableWorldGenRuby) {
            WorldRegistry.registerRuby();
        }
        if (Properties.enableWorldGenSapphire) {
            WorldRegistry.registerSapphire();
        }
        if (Properties.enableWorldGenSQuartz) {
            WorldRegistry.registerSQuartz();
        }
        if (Properties.enableWorldGenSun) {
            WorldRegistry.registerSun();
        }
        if (Properties.enableWorldGenTopaz) {
            WorldRegistry.registerTopaz();
        }
        if (Properties.enableWorldGenTurquoise) {
            WorldRegistry.registerTurquoise();
        }
        if (Properties.enableWorldGenWAlabaster) {
            WorldRegistry.registerWAlabaster();
        }
    }

    private static void registerAluminum() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Aluminum");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresH.oreAluminum.ordinal()), EnumOresH.oreAluminum.name(), Properties.aluSize, Properties.aluDensity, Properties.aluMinHeight, Properties.aluMaxHeight, Properties.enableWorldGenAluminum);
    }

    private static void registerCopper() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Copper");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresH.oreCopper.ordinal()), EnumOresH.oreCopper.name(), Properties.copSize, Properties.copDensity, Properties.copMinHeight, Properties.copMaxHeight, Properties.enableWorldGenCopper);
    }

    private static void registerLead() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Lead");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresH.oreLead.ordinal()), EnumOresH.oreLead.name(), Properties.leadSize, Properties.leadDensity, Properties.leadMinHeight, Properties.leadMaxHeight, Properties.enableWorldGenLead);
    }

    private static void registerSilver() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Silver");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresH.oreSilver.ordinal()), EnumOresH.oreSilver.name(), Properties.silSize, Properties.silDensity, Properties.silMinHeight, Properties.silMaxHeight, Properties.enableWorldGenSilver);
    }

    private static void registerSulfur() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Sulfur");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresH.oreSulfur.ordinal()), EnumOresH.oreSulfur.name(), Properties.sulSize, Properties.sulDensity, Properties.sulMinHeight, Properties.sulMaxHeight, Properties.enableWorldGenSulfur);
    }

    private static void registerTin() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Tin");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresH.oreTin.ordinal()), EnumOresH.oreTin.name(), Properties.tinSize, Properties.tinDensity, Properties.tinMinHeight, Properties.tinMaxHeight, Properties.enableWorldGenTin);
    }

    private static void registerTitanium() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Titanium");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresH.oreTitanium.ordinal()), EnumOresH.oreTitanium.name(), Properties.titSize, Properties.titDensity, Properties.titMinHeight, Properties.titMaxHeight, Properties.enableWorldGenTitanium);
    }

    private static void registerTungsten() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Tungsten");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresH.oreTungsten.ordinal()), EnumOresH.oreTungsten.name(), Properties.tunSize, Properties.tunDensity, Properties.tunMinHeight, Properties.tunMaxHeight, Properties.enableWorldGenTungsten);
    }

    // Dendritis

    private static void registerAmethyst() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Amethyst");
        WorldGenerator.addEndGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreAmethyst.ordinal()), EnumOresD.oreAmethyst.name(), Properties.ameSize, Properties.ameDensity, Properties.ameMinHeight, Properties.ameMaxHeight, Properties.enableWorldGenAmethyst);
    }

    private static void registerBDiamond() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for BlackDiamond");
        WorldGenerator.addNetherGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreBDiamond.ordinal()), EnumOresD.oreBDiamond.name(), Properties.bdiSize, Properties.bdiDensity, Properties.bdiMinHeight, Properties.bdiMaxHeight, Properties.enableWorldGenBDiamond);
    }

    private static void registerCitrine() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Citrine");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreCitrine.ordinal()), EnumOresD.oreCitrine.name(), Properties.citSize, Properties.citDensity, Properties.citMinHeight, Properties.citMaxHeight, Properties.enableWorldGenCitrine);
    }

    private static void registerCZirconia() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for CubicZirconia");
        WorldGenerator.addNetherGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreCZirconia.ordinal()), EnumOresD.oreCZirconia.name(), Properties.cziSize, Properties.cziDensity, Properties.cziMinHeight, Properties.cziMaxHeight, Properties.enableWorldGenCZirconia);
    }

    private static void registerFuchsia() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Fuchsia");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreFuchsia.ordinal()), EnumOresD.oreFuchsia.name(), Properties.fucSize, Properties.fucDensity, Properties.fucMinHeight, Properties.fucMaxHeight, Properties.enableWorldGenFuchsia);
    }

    private static void registerJet() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Jet");
        WorldGenerator.addEndGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreJet.ordinal()), EnumOresD.oreJet.name(), Properties.jetSize, Properties.jetDensity, Properties.jetMinHeight, Properties.jetMaxHeight, Properties.enableWorldGenJet);
    }

    private static void registerOlivine() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Olivine");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreOlivine.ordinal()), EnumOresD.oreOlivine.name(), Properties.oliSize, Properties.oliDensity, Properties.oliMinHeight, Properties.oliMaxHeight, Properties.enableWorldGenOlivine);
    }

    private static void registerOpal() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Opal");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreOpal.ordinal()), EnumOresD.oreOpal.name(), Properties.opalSize, Properties.opalDensity, Properties.opalMinHeight, Properties.opalMaxHeight, Properties.enableWorldGenOpal);
    }

    private static void registerRuby() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Ruby");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreRuby.ordinal()), EnumOresD.oreRuby.name(), Properties.rubySize, Properties.rubyDensity, Properties.rubyMinHeight, Properties.rubyMaxHeight, Properties.enableWorldGenRuby);
    }

    private static void registerSapphire() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Sapphire");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreSapphire.ordinal()), EnumOresD.oreSapphire.name(), Properties.sapSize, Properties.sapDensity, Properties.sapMinHeight, Properties.sapMaxHeight, Properties.enableWorldGenSapphire);
    }

    private static void registerSQuartz() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for SmokyQuartz");
        WorldGenerator.addNetherGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreSQuartz.ordinal()), EnumOresD.oreSQuartz.name(), Properties.squSize, Properties.squDensity, Properties.squMinHeight, Properties.squMaxHeight, Properties.enableWorldGenSQuartz);
    }

    private static void registerSun() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Sun");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreSun.ordinal()), EnumOresD.oreSun.name(), Properties.sunSize, Properties.sunDensity, Properties.sunMinHeight, Properties.sunMaxHeight, Properties.enableWorldGenSun);
    }

    private static void registerTopaz() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Topaz");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreTopaz.ordinal()), EnumOresD.oreTopaz.name(), Properties.topSize, Properties.topDensity, Properties.topMinHeight, Properties.topMaxHeight, Properties.enableWorldGenTopaz);
    }

    private static void registerTurquoise() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Turquoise");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreTurquoise.ordinal()), EnumOresD.oreTurquoise.name(), Properties.turSize, Properties.turDensity, Properties.turMinHeight, Properties.turMaxHeight, Properties.enableWorldGenTurquoise);
    }

    private static void registerWAlabaster() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for WhiteAlabaster");
        WorldGenerator.addEndGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOresD.oreWAlabaster.ordinal()), EnumOresD.oreWAlabaster.name(), Properties.walSize, Properties.walDensity, Properties.walMinHeight, Properties.walMaxHeight, Properties.enableWorldGenWAlabaster);
    }
}