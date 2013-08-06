package ccm.hephaestus.configuration;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.LogHandler;

final class ConfigItems extends Config {

    /**
     * Loads or creates the Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configItems(final AdvConfiguration config) {
        LogHandler.finest(Hephaestus.instance, "Loading Items Configs");
        Properties.itemHandleID = config.getItem("Items", Properties.itemID).getInt();
        Properties.itemIngotID = config.getItem("Ingots", Properties.itemID).getInt();
        Properties.itemDustID = config.getItem("Dusts", Properties.itemID).getInt();
    }
}
