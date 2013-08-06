package ccm.hephaestus.utils.registry;

import net.minecraft.item.ItemStack;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.enums.EnumOresD;
import ccm.hephaestus.block.enums.EnumOresG;
import ccm.hephaestus.block.enums.EnumOresM;
import ccm.hephaestus.utils.lib.Archive;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.utils.handler.LogHandler;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;
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
        if (Properties.enableWorldGenCitrine) {
            WorldRegistry.registerCitrine();
        }
        if (Properties.enableWorldGenCZirconia) {
            WorldRegistry.registerCZirconia();
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
        if (Properties.enableWorldGenSun) {
            WorldRegistry.registerSun();
        }
        if (Properties.enableWorldGenTopaz) {
            WorldRegistry.registerTopaz();
        }
        if (Properties.enableWorldGenWAlabaster) {
            WorldRegistry.registerWAlabaster();
        }
    }

    private static void registerAluminum() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Aluminum");
        register(Archive.MOD_NAME, EnumOresM.oreAluminum, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenAluminum);
    }

    private static void registerCopper() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Copper");
        register(Archive.MOD_NAME, EnumOresM.oreCopper, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenCopper);
    }

    private static void registerLead() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Lead");
        register(Archive.MOD_NAME, EnumOresM.oreLead, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenLead);
    }

    private static void registerSilver() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Silver");
        register(Archive.MOD_NAME, EnumOresM.oreSilver, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenSilver);
    }

    private static void registerSulfur() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Sulfur");
        register(Archive.MOD_NAME, EnumOresD.oreSulfur, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenSulfur);
    }

    private static void registerTin() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Tin");
        register(Archive.MOD_NAME, EnumOresM.oreTin, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenTin);
    }

    private static void registerTitanium() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Titanium");
        register(Archive.MOD_NAME, EnumOresM.oreTitanium, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenTitanium);
    }

    private static void registerTungsten() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Tungsten");
        register(Archive.MOD_NAME, EnumOresM.oreTungsten, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenTungsten);
    }

    private static void registerCitrine() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Citrine");
        register(Archive.MOD_NAME, EnumOresG.oreCitrine, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenCitrine);
    }

    private static void registerCZirconia() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for CubicZirconia");
        register(Archive.MOD_NAME, EnumOresG.oreCZirconia, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenCZirconia);
    }

    private static void registerJet() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Jet");
        register(Archive.MOD_NAME, EnumOresG.oreJet, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenJet);
    }

    private static void registerOlivine() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Olivine");
        register(Archive.MOD_NAME, EnumOresG.oreOlivine, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenOlivine);
    }

    private static void registerOpal() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Opal");
        register(Archive.MOD_NAME, EnumOresG.oreOpal, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenOpal);
    }

    private static void registerRuby() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Ruby");
        register(Archive.MOD_NAME, EnumOresG.oreRuby, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenRuby);
    }

    private static void registerSapphire() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Sapphire");
        register(Archive.MOD_NAME, EnumOresG.oreSapphire, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenSapphire);
    }

    private static void registerSun() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Sun");
        register(Archive.MOD_NAME, EnumOresG.oreSun, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenSun);
    }

    private static void registerTopaz() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Topaz");
        register(Archive.MOD_NAME, EnumOresG.oreTopaz, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenTopaz);
    }

    private static void registerWAlabaster() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for WhiteAlabaster");
        register(Archive.MOD_NAME, EnumOresG.oreWAlabaster, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenWAlabaster);
    }

    private static void register(final String modName, final Enum<? extends IBlockEnum> enu, final int oreID, final int clusterSize, final int numClusters, final int minY, final int maxY, final boolean enable) {

        WorldGenerator.addOverworldGen(modName, new ItemStack(oreID, 1, enu.ordinal()), enu.name(), clusterSize, numClusters, minY, maxY, enable);
    }
}