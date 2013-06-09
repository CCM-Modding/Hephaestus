package ccm.hephaestus.configuration;

import ccm.nucleum_omnium.configuration.AdvConfiguration;

import ccm.hephaestus.utils.lib.Properties;

final class ConfigWorldGen extends Config
{

    final static String gen    = "World Generation";

    final static String whiteA = " of White Alabaster";

    final static String cop    = " of Copper";

    final static String lead   = " of Lead";

    final static String sil    = " of Silver";

    final static String sul    = " of Sulfur";

    final static String tin    = " of Tin";

    final static String tit    = " of Titanium";

    final static String tun    = " of Tungsten";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configWorldGen(final AdvConfiguration config)
    {

        Properties.enableWorldGenWhiteAlabaster = config.get(gen + whiteA, "EnableWhiteAlabaster", true).getBoolean(true);
        Properties.enableWorldGenCopper = config.get(gen + cop, "EnableCopper", true).getBoolean(true);
        Properties.enableWorldGenLead = config.get(gen + lead, "EnableLead", true).getBoolean(true);
        Properties.enableWorldGenSilver = config.get(gen + sil, "EnableSilver", true).getBoolean(true);
        Properties.enableWorldGenSulfur = config.get(gen + sul, "EnableSulfur", true).getBoolean(true);
        Properties.enableWorldGenTin = config.get(gen + tin, "EnableTin", true).getBoolean(true);
        Properties.enableWorldGenTitanium = config.get(gen + tit, "EnableTitanium", true).getBoolean(true);
        Properties.enableWorldGenTungsten = config.get(gen + tun, "EnableTungsten", true).getBoolean(true);
    }
}