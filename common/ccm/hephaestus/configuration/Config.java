package ccm.hephaestus.configuration;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Archive;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.PropertyHandler;
import ccm.nucleum_omnium.handler.Handler;

public class Config {

    public static PropertyHandler property = new PropertyHandler(Properties.getItemID(), Properties.getBlockID());

    /**
     * Initializes the Configuration file.
     * 
     * @param event
     *            The FMLPreInitializationEvent that is used to get the
     *            ModConfigurationDirectory.
     */
    public static void init(final Configuration config) {
        try {
            Handler.log(Hephaestus.instance, "Loading configuration");
            // Loads a pre-existing Configuration file.
            config.load();
            ConfigItems.configItems(config);
            ConfigTools.configUsable(config);
            ConfigWorldGen.configWorldGen(config);
            ConfigBlocks.configBlocks(config);
        } catch (final Exception e) {
            Handler.log(Hephaestus.instance, Level.SEVERE, Archive.MOD_NAME + " has had a problem loading its configuration");
            e.printStackTrace();
        } finally {
            if (config.hasChanged()) {
                /*
                 * If a pre-existing Configuration file didn't exist it creates
                 * a new one. If there were changes to the existing
                 * Configuration file, It saves them.
                 */
                config.save();
            }
        }
    }
}