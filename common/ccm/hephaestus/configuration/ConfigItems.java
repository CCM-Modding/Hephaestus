package ccm.hephaestus.configuration;

import net.minecraftforge.common.Configuration;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigItems extends Config {

    /**
     * Loads or creates the Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configItems(final Configuration config) {
        Handler.log(Hephaestus.instance, "Loading Items Configs");
        Properties.itemHandleID = property.getNextUsableItemID(config, "All the Other Items").getInt();
        Properties.itemIngotID = property.getNextUsableItemID(config, "All the Ingots").getInt();
        Properties.itemDustID = property.getNextUsableItemID(config, "All the Dusts").getInt();
    }
}
