package ccm.hephaestus.configuration;

import net.minecraftforge.common.Configuration;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigWorldGen extends Config {

    final static String gen = "World Generation";

    final static String alu = " of Aluminum";

    final static String cop = " of Copper";

    final static String lead = " of Lead";

    final static String sil = " of Silver";

    final static String sul = " of Sulfur";

    final static String tin = " of Tin";

    final static String tit = " of Titanium";

    final static String tun = " of Tungsten";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configWorldGen(final Configuration config) {

        genAluminum(config);
        genCopper(config);
        genLead(config);
        genSilver(config);
        genSulfur(config);
        genTin(config);
        genTitanium(config);
        genTungsten(config);
    }

    /**
     * Loads or creates the Aluminum World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genAluminum(final Configuration config) {
        if (Properties.enableWorldGenAluminum = config.get(gen + alu, "Enable Generation of WhiteAlabaster", true).getBoolean(true)) {
            Handler.log(Hephaestus.instance, "Loading WhiteAlabaster Configs");

            Properties.aluMaxHeight = config.get(gen + alu, "Maximum Height", 60).getInt();
            Properties.aluMinHeight = config.get(gen + alu, "Minimum Height", 25).getInt();
            Properties.aluSize = config.get(gen + alu, "Max size of the Vein", 6).getInt();
            Properties.aluDensity = config.get(gen + alu, "Max veins per chunk", 10).getInt();
        }
    }

    /**
     * Loads or creates the Copper World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genCopper(final Configuration config) {
        if (Properties.enableWorldGenCopper = config.get(gen + cop, "Enable Generation of WhiteAlabaster", true).getBoolean(true)) {
            Handler.log(Hephaestus.instance, "Loading WhiteAlabaster Configs");

            Properties.copMaxHeight = config.get(gen + cop, "Maximum Height", 70).getInt();
            Properties.copMinHeight = config.get(gen + cop, "Minimum Height", 30).getInt();
            Properties.copSize = config.get(gen + cop, "Max size of the Vein", 8).getInt();
            Properties.copDensity = config.get(gen + cop, "Max veins per chunk", 15).getInt();
        }
    }

    /**
     * Loads or creates the Lead World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genLead(final Configuration config) {
        if (Properties.enableWorldGenLead = config.get(gen + lead, "Enable Generation of WhiteAlabaster", true).getBoolean(true)) {
            Handler.log(Hephaestus.instance, "Loading WhiteAlabaster Configs");

            Properties.leadMaxHeight = config.get(gen + lead, "Maximum Height", 40).getInt();
            Properties.leadMinHeight = config.get(gen + lead, "Minimum Height", 25).getInt();
            Properties.leadSize = config.get(gen + lead, "Max size of the Vein", 5).getInt();
            Properties.leadDensity = config.get(gen + lead, "Max veins per chunk", 8).getInt();
        }
    }

    /**
     * Loads or creates the Silver World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genSilver(final Configuration config) {
        if (Properties.enableWorldGenSilver = config.get(gen + sil, "Enable Generation of WhiteAlabaster", true).getBoolean(true)) {
            Handler.log(Hephaestus.instance, "Loading WhiteAlabaster Configs");

            Properties.silMaxHeight = config.get(gen + sil, "Maximum Height", 30).getInt();
            Properties.silMinHeight = config.get(gen + sil, "Minimum Height", 15).getInt();
            Properties.silSize = config.get(gen + sil, "Max size of the Vein", 4).getInt();
            Properties.silDensity = config.get(gen + sil, "Max veins per chunk", 6).getInt();
        }
    }

    /**
     * Loads or creates the Sulfur World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genSulfur(final Configuration config) {
        if (Properties.enableWorldGenSulfur = config.get(gen + sul, "Enable Generation of WhiteAlabaster", true).getBoolean(true)) {
            Handler.log(Hephaestus.instance, "Loading WhiteAlabaster Configs");

            Properties.sulMaxHeight = config.get(gen + sul, "Maximum Height", 20).getInt();
            Properties.sulMinHeight = config.get(gen + sul, "Minimum Height", 10).getInt();
            Properties.sulSize = config.get(gen + sul, "Max size of the Vein", 8).getInt();
            Properties.sulDensity = config.get(gen + sul, "Max veins per chunk", 5).getInt();
        }
    }

    /**
     * Loads or creates the Tin World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genTin(final Configuration config) {
        if (Properties.enableWorldGenTin = config.get(gen + tin, "Enable Generation of WhiteAlabaster", true).getBoolean(true)) {
            Handler.log(Hephaestus.instance, "Loading WhiteAlabaster Configs");

            Properties.tinMaxHeight = config.get(gen + tin, "Maximum Height", 30).getInt();
            Properties.tinMinHeight = config.get(gen + tin, "Minimum Height", 10).getInt();
            Properties.tinSize = config.get(gen + tin, "Max size of the Vein", 6).getInt();
            Properties.tinDensity = config.get(gen + tin, "Max veins per chunk", 12).getInt();
        }
    }

    /**
     * Loads or creates the Titanium World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genTitanium(final Configuration config) {
        if (Properties.enableWorldGenTitanium = config.get(gen + tit, "Enable Generation of WhiteAlabaster", true).getBoolean(true)) {
            Handler.log(Hephaestus.instance, "Loading WhiteAlabaster Configs");

            Properties.titMaxHeight = config.get(gen + tit, "Maximum Height", 20).getInt();
            Properties.titMinHeight = config.get(gen + tit, "Minimum Height", 5).getInt();
            Properties.titSize = config.get(gen + tit, "Max size of the Vein", 3).getInt();
            Properties.titDensity = config.get(gen + tit, "Max veins per chunk", 2).getInt();
        }
    }

    /**
     * Loads or creates the Tungsten World Generation in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genTungsten(final Configuration config) {
        if (Properties.enableWorldGenTungsten = config.get(gen + tun, "Enable Generation of WhiteAlabaster", true).getBoolean(true)) {
            Handler.log(Hephaestus.instance, "Loading WhiteAlabaster Configs");

            Properties.tunMaxHeight = config.get(gen + tun, "Maximum Height", 15).getInt();
            Properties.tunMinHeight = config.get(gen + tun, "Minimum Height", 5).getInt();
            Properties.tunSize = config.get(gen + tun, "Max size of the Vein", 3).getInt();
            Properties.tunDensity = config.get(gen + tun, "Max veins per chunk", 2).getInt();
        }
    }
}