package ccm.dendritis.configuration;

import ccm.dendritis.Dendritis;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.utils.handler.LogHandler;

final class ConfigItems extends Config {

    /**
     * Loads or creates the Items in the Configuration file.
     * 
     * @param config
     *            The {@link AdvConfiguration} file that is being edited.
     */
    protected static void configItems(final AdvConfiguration config) {
        LogHandler.finest(Dendritis.instance, "Loading Items Configs");
        Properties.itemMainID = config.getItem("All the Other Items", Properties.itemID).getInt();
        Properties.itemGemsID = config.getItem("All the Gems", Properties.itemID).getInt();
    }
}
