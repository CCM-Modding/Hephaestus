package ccm.hephaestus.configuration;

import java.util.logging.Level;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Archive;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.LogHandler;

public class Config {

    /**
     * Initializes the Configuration file.
     * 
     * @param event
     *            The FMLPreInitializationEvent that is used to get the
     *            ModConfigurationDirectory.
     */
    public static void init(final AdvConfiguration config) {
        try {
            LogHandler.finest(Hephaestus.instance, "Loading configuration");
            // Loads a pre-existing Configuration file.
            config.load();
            ConfigItems.configItems(config);
            ConfigTools.configUsable(config);
            ConfigWorldGen.configWorldGen(config);
            ConfigBlocks.configBlocks(config);
        } catch (final Exception e) {
            LogHandler.finest(Hephaestus.instance, Level.SEVERE, Archive.MOD_NAME + " has had a problem loading its configuration");
            e.printStackTrace();
        } finally {
            config.save();
        }
    }
}