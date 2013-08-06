package ccm.dendritis.utils.registry;

import net.minecraft.item.ItemStack;
import ccm.dendritis.Dendritis;
import ccm.dendritis.block.ModBlocks;
import ccm.dendritis.enums.EnumOres;
import ccm.dendritis.utils.lib.Archive;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.LogHandler;
import ccm.nucleum_world.WorldGenerator;

final class WorldRegistry {

    /*
     * Registers all the World Generation.
     */
    protected static void registerWorld() {

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

    private static void registerAmethyst() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Amethyst");
        WorldGenerator.addEndGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreAmethyst.ordinal()), EnumOres.oreAmethyst.name(), Properties.ameSize, Properties.ameDensity, Properties.ameMinHeight, Properties.ameMaxHeight, Properties.enableWorldGenAmethyst);
    }

    private static void registerBDiamond() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for BlackDiamond");
        WorldGenerator.addNetherGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreBDiamond.ordinal()), EnumOres.oreBDiamond.name(), Properties.bdiSize, Properties.bdiDensity, Properties.bdiMinHeight, Properties.bdiMaxHeight, Properties.enableWorldGenBDiamond);
    }

    private static void registerCitrine() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Citrine");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreCitrine.ordinal()), EnumOres.oreCitrine.name(), Properties.citSize, Properties.citDensity, Properties.citMinHeight, Properties.citMaxHeight, Properties.enableWorldGenCitrine);
    }

    private static void registerCZirconia() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for CubicZirconia");
        WorldGenerator.addNetherGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreCZirconia.ordinal()), EnumOres.oreCZirconia.name(), Properties.cziSize, Properties.cziDensity, Properties.cziMinHeight, Properties.cziMaxHeight, Properties.enableWorldGenCZirconia);
    }

    private static void registerFuchsia() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Fuchsia");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreFuchsia.ordinal()), EnumOres.oreFuchsia.name(), Properties.fucSize, Properties.fucDensity, Properties.fucMinHeight, Properties.fucMaxHeight, Properties.enableWorldGenFuchsia);
    }

    private static void registerJet() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Jet");
        WorldGenerator.addEndGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreJet.ordinal()), EnumOres.oreJet.name(), Properties.jetSize, Properties.jetDensity, Properties.jetMinHeight, Properties.jetMaxHeight, Properties.enableWorldGenJet);
    }

    private static void registerOlivine() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Olivine");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreOlivine.ordinal()), EnumOres.oreOlivine.name(), Properties.oliSize, Properties.oliDensity, Properties.oliMinHeight, Properties.oliMaxHeight, Properties.enableWorldGenOlivine);
    }

    private static void registerOpal() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Opal");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreOpal.ordinal()), EnumOres.oreOpal.name(), Properties.opalSize, Properties.opalDensity, Properties.opalMinHeight, Properties.opalMaxHeight, Properties.enableWorldGenOpal);
    }

    private static void registerRuby() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Ruby");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreRuby.ordinal()), EnumOres.oreRuby.name(), Properties.rubySize, Properties.rubyDensity, Properties.rubyMinHeight, Properties.rubyMaxHeight, Properties.enableWorldGenRuby);
    }

    private static void registerSapphire() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Sapphire");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSapphire.ordinal()), EnumOres.oreSapphire.name(), Properties.sapSize, Properties.sapDensity, Properties.sapMinHeight, Properties.sapMaxHeight, Properties.enableWorldGenSapphire);
    }

    private static void registerSQuartz() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for SmokyQuartz");
        WorldGenerator.addNetherGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSQuartz.ordinal()), EnumOres.oreSQuartz.name(), Properties.squSize, Properties.squDensity, Properties.squMinHeight, Properties.squMaxHeight, Properties.enableWorldGenSQuartz);
    }

    private static void registerSun() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Sun");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreSun.ordinal()), EnumOres.oreSun.name(), Properties.sunSize, Properties.sunDensity, Properties.sunMinHeight, Properties.sunMaxHeight, Properties.enableWorldGenSun);
    }

    private static void registerTopaz() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Topaz");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreTopaz.ordinal()), EnumOres.oreTopaz.name(), Properties.topSize, Properties.topDensity, Properties.topMinHeight, Properties.topMaxHeight, Properties.enableWorldGenTopaz);
    }

    private static void registerTurquoise() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for Turquoise");
        WorldGenerator.addOverworldGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreTurquoise.ordinal()), EnumOres.oreTurquoise.name(), Properties.turSize, Properties.turDensity, Properties.turMinHeight, Properties.turMaxHeight, Properties.enableWorldGenTurquoise);
    }

    private static void registerWAlabaster() {
        LogHandler.finest(Dendritis.instance, "Registering World Generation for WhiteAlabaster");
        WorldGenerator.addEndGen(Archive.MOD_NAME, new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreWAlabaster.ordinal()), EnumOres.oreWAlabaster.name(), Properties.walSize, Properties.walDensity, Properties.walMinHeight, Properties.walMaxHeight, Properties.enableWorldGenWAlabaster);
    }

}