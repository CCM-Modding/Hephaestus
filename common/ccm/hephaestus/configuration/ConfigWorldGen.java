package ccm.hephaestus.configuration;

import ccm.nucleum_omnium.configuration.AdvConfiguration;

import ccm.hephaestus.utils.lib.Properties;

final class ConfigWorldGen extends Config
{

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
    protected static void configWorldGen(final AdvConfiguration config)
    {

        Properties.enableWorldGenWhiteAlabaster = config.get(gen + whiteA, "EnableWhiteAlabaster", true).getBoolean(true);
        Properties.enableWorldGenCopper = config.get(gen + cop, ena + cop, true).getBoolean(true);
        Properties.enableWorldGenLead = config.get(gen + lead, ena + lead, true).getBoolean(true);
        Properties.enableWorldGenSilver = config.get(gen + sil, ena + sil, true).getBoolean(true);
        Properties.enableWorldGenSulfur = config.get(gen + sul, ena + sul, true).getBoolean(true);
        Properties.enableWorldGenTin = config.get(gen + tin, ena + tin, true).getBoolean(true);
        Properties.enableWorldGenTitanium = config.get(gen + tit, ena + tit, true).getBoolean(true);
        Properties.enableWorldGenTungsten = config.get(gen + tun, ena + tun, true).getBoolean(true);
    }
}