package ccm.hephaestus.configuration;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.utils.handler.LogHandler;

final class ConfigItems extends HephaestusConfig {

    /**
     * Loads or creates the Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configItems(final AdvConfiguration config) {
        LogHandler.finest(Hephaestus.instance, "Loading Item Configs");
        int id = Properties.itemID;
        Properties.mainItemID = config.getItem("All the Items that Stack up to 64", id++).getInt();
        Properties.gemItemID = config.getItem("All the Gems", id++).getInt();
        Properties.ingotItemID = config.getItem("All the Ingots", id++).getInt();
        Properties.dustItemID = config.getItem("All the Dusts", id++).getInt();
    }
}
