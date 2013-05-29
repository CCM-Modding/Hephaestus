package ccm.hephaestus.configuration;

import net.minecraftforge.common.Configuration;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigWorldGen extends Config {

    final static String gen = "World Generation";

    final static String cop = " of Copper";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configWorldGen(final Configuration config) {

        genCopper(config);
    }


    /**
     * Loads or creates the Copper World Generation in the Configuration
     * file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    private static void genCopper(final Configuration config) {
        if (Properties.enableWorldGenCopper = config.get(gen + cop, "Enable Generation of WhiteAlabaster", true).getBoolean(true)) {
            Handler.log(Hephaestus.instance, "Loading WhiteAlabaster Configs");

            Properties.copMaxHeight = config.get(gen + cop, "Maximum Height", 50).getInt();
            Properties.copMinHeight = config.get(gen + cop, "Minimum Height", 25).getInt();
            Properties.copSize = config.get(gen + cop, "Max size of the Vein", 4).getInt();
            Properties.copDensity = config.get(gen + cop, "Max veins per chunk", 10).getInt();
        }
    }
}