package ccm.hephaestus.configuration;

import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;

final class ConfigWorldGen extends Config {

    final static String gen    = "World Generation  of ";

    final static String ena    = "Enable";

    final static String whiteA = "White Alabaster";

    final static String cop    = "Copper";

    final static String lead   = "Lead";

    final static String sil    = "Silver";

    final static String sul    = "Sulfur";

    final static String tin    = "Tin";

    final static String tit    = "Titanium";

    final static String tun    = "Tungsten";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configWorldGen(final AdvConfiguration config) {

        Properties.enableWorldGenWhiteAlabaster = config.get(
                ConfigWorldGen.gen + ConfigWorldGen.whiteA, "EnableWhiteAlabaster", true)
                .getBoolean(true);
        Properties.enableWorldGenCopper = config.get(ConfigWorldGen.gen + ConfigWorldGen.cop,
                ConfigWorldGen.ena + ConfigWorldGen.cop, true).getBoolean(true);
        Properties.enableWorldGenLead = config.get(ConfigWorldGen.gen + ConfigWorldGen.lead,
                ConfigWorldGen.ena + ConfigWorldGen.lead, true).getBoolean(true);
        Properties.enableWorldGenSilver = config.get(ConfigWorldGen.gen + ConfigWorldGen.sil,
                ConfigWorldGen.ena + ConfigWorldGen.sil, true).getBoolean(true);
        Properties.enableWorldGenSulfur = config.get(ConfigWorldGen.gen + ConfigWorldGen.sul,
                ConfigWorldGen.ena + ConfigWorldGen.sul, true).getBoolean(true);
        Properties.enableWorldGenTin = config.get(ConfigWorldGen.gen + ConfigWorldGen.tin,
                ConfigWorldGen.ena + ConfigWorldGen.tin, true).getBoolean(true);
        Properties.enableWorldGenTitanium = config.get(ConfigWorldGen.gen + ConfigWorldGen.tit,
                ConfigWorldGen.ena + ConfigWorldGen.tit, true).getBoolean(true);
        Properties.enableWorldGenTungsten = config.get(ConfigWorldGen.gen + ConfigWorldGen.tun,
                ConfigWorldGen.ena + ConfigWorldGen.tun, true).getBoolean(true);
    }
}