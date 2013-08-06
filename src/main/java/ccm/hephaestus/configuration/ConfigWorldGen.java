package ccm.hephaestus.configuration;

import net.minecraftforge.common.Configuration;
import ccm.hephaestus.utils.lib.Properties;

final class ConfigWorldGen extends HephaestusConfig {

    final static String gen = "World Generation";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configWorldGen(final Configuration config) {
        Properties.enableWorldGenAluminum = config.get(ConfigWorldGen.gen, "EnableAluminum", true).getBoolean(true);
    }
}