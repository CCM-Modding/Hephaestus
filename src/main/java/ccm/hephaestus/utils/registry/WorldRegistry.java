package ccm.hephaestus.utils.registry;

import net.minecraft.item.ItemStack;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.enums.EnumOresM;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.IMod;
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
        if (Properties.enableWorldGenCitrine) {
            WorldRegistry.registerCitrine();
        }
        if (Properties.enableWorldGenCZirconia) {
            WorldRegistry.registerCZirconia();
        }
        if (Properties.enableWorldGenOlivine) {
            WorldRegistry.registerOlivine();
        }
        if (Properties.enableWorldGenRuby) {
            WorldRegistry.registerRuby();
        }
        if (Properties.enableWorldGenSapphire) {
            WorldRegistry.registerSapphire();
        }
        if (Properties.enableWorldGenTopaz) {
            WorldRegistry.registerTopaz();
        }
    }

    private static void registerAluminum() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Aluminum");
        register(Hephaestus.instance, EnumOresM.oreAluminum, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenAluminum);
    }

    private static void registerCopper() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Copper");
        register(Hephaestus.instance, EnumOresM.oreCopper, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenCopper);
    }

    private static void registerSilver() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Silver");
        register(Hephaestus.instance, EnumOresM.oreSilver, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenSilver);
    }

    private static void registerSulfur() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Sulfur");
        register(Hephaestus.instance, EnumOresM.oreSulfur, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenSulfur);
    }

    private static void registerTin() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Tin");
        register(Hephaestus.instance, EnumOresM.oreTin, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenTin);
    }

    private static void registerTitanium() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Titanium");
        register(Hephaestus.instance, EnumOresM.oreTitanium, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenTitanium);
    }

    private static void registerCitrine() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Citrine");
        register(Hephaestus.instance, EnumOresM.oreCitrine, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenCitrine);
    }

    private static void registerCZirconia() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for CubicZirconia");
        register(Hephaestus.instance, EnumOresM.oreCZirconia, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenCZirconia);
    }

    private static void registerOlivine() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Olivine");
        register(Hephaestus.instance, EnumOresM.oreOlivine, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenOlivine);
    }

    private static void registerRuby() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Ruby");
        register(Hephaestus.instance, EnumOresM.oreRuby, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenRuby);
    }

    private static void registerSapphire() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Sapphire");
        register(Hephaestus.instance, EnumOresM.oreSapphire, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenSapphire);
    }

    private static void registerTopaz() {
        LogHandler.finest(Hephaestus.instance, "Registering World Generation for Topaz");
        register(Hephaestus.instance, EnumOresM.oreTopaz, Properties.oreID, 6, 5, 10, 60, Properties.enableWorldGenTopaz);
    }

    private static void register(final IMod mod, final Enum<? extends IBlockEnum> enu, final int oreID, final int clusterSize, final int numClusters, final int minY, final int maxY, final boolean enable) {

        WorldGenerator.addOverworldGen(mod, new ItemStack(oreID, 1, enu.ordinal()), enu.name(), clusterSize, numClusters, minY, maxY, enable);
    }
}