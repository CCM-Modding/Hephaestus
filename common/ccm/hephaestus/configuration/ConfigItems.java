package ccm.hephaestus.configuration;

import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.Handler;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;

final class ConfigItems extends Config
{

    /**
     * Loads or creates the Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configItems(final AdvConfiguration config)
    {
        Handler.log(Hephaestus.instance, "Loading Items Configs");
        Properties.itemHandleID = config.getItem(config, "All the Other Items").getInt();
        Properties.itemIngotID = config.getItem(config, "All the Ingots").getInt();
        Properties.itemDustID = config.getItem(config, "All the Dusts").getInt();
    }
}
