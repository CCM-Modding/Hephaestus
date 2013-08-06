package ccm.dendritis.configuration;

import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;

final class ConfigWorldGen extends Config {

    final static String gen = "World Generation ";

    final static String ame = "of Amethyst (End)";

    final static String bdi = "of BlackDiamond (Neather)";

    final static String cit = "of Citrine (Surface)";

    final static String czi = "of CubicZirconia (Neather)";

    final static String fuc = "of Fuchsia (Surface)";

    final static String jet = "of Jet (End)";

    final static String oli = "of Olivine (Surface)";

    final static String opal = "of Opal (Surface)";

    final static String ruby = "of Ruby (Surface)";

    final static String sap = "of Sapphire (Surface)";

    final static String squ = " of SmokyQuartz (Neather)";

    final static String sun = " of Sun (Surface)";

    final static String top = " of Topaz (Surface)";

    final static String tur = " of Turquoise (Surface)";

    final static String wal = " of WhiteAlibaster (End)";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The {@link AdvConfiguration} file that is being edited.
     */
    protected static void configWorldGen(final AdvConfiguration config) {

        Properties.enableWorldGenAmethyst = config.get(ConfigWorldGen.gen + ConfigWorldGen.ame, "EnableAmethyst", true).getBoolean(true);
        Properties.enableWorldGenBDiamond = config.get(ConfigWorldGen.gen + ConfigWorldGen.bdi, "EnableBlackDiamond", true).getBoolean(true);
        Properties.enableWorldGenCitrine = config.get(ConfigWorldGen.gen + ConfigWorldGen.cit, "EnableCitrine", true).getBoolean(true);
        Properties.enableWorldGenCZirconia = config.get(ConfigWorldGen.gen + ConfigWorldGen.czi, "EnableCubicZirconia", true).getBoolean(true);
        Properties.enableWorldGenFuchsia = config.get(ConfigWorldGen.gen + ConfigWorldGen.fuc, "EnableFuchsia", true).getBoolean(true);
        Properties.enableWorldGenJet = config.get(ConfigWorldGen.gen + ConfigWorldGen.jet, "EnableJet", true).getBoolean(true);
        Properties.enableWorldGenOlivine = config.get(ConfigWorldGen.gen + ConfigWorldGen.oli, "EnableOlivine", true).getBoolean(true);
        Properties.enableWorldGenOpal = config.get(ConfigWorldGen.gen + ConfigWorldGen.opal, "EnableOpal", true).getBoolean(true);
        Properties.enableWorldGenRuby = config.get(ConfigWorldGen.gen + ConfigWorldGen.ruby, "EnableRuby", true).getBoolean(true);
        Properties.enableWorldGenSapphire = config.get(ConfigWorldGen.gen + ConfigWorldGen.sap, "EnableSapphire", true).getBoolean(true);
        Properties.enableWorldGenSQuartz = config.get(ConfigWorldGen.gen + ConfigWorldGen.squ, "EnableSmokyQuartz", true).getBoolean(true);
        Properties.enableWorldGenSun = config.get(ConfigWorldGen.gen + ConfigWorldGen.sun, "EnableSunJewl", true).getBoolean(true);
        Properties.enableWorldGenTopaz = config.get(ConfigWorldGen.gen + ConfigWorldGen.top, "EnableTopaz", true).getBoolean(true);
        Properties.enableWorldGenTurquoise = config.get(ConfigWorldGen.gen + ConfigWorldGen.tur, "EnableTurquoise", true).getBoolean(true);
        Properties.enableWorldGenWAlabaster = config.get(ConfigWorldGen.gen + ConfigWorldGen.wal, "EnableWhiteAlabaster", true).getBoolean(true);
    }
}