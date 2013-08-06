package ccm.dendritis.configuration;

import ccm.dendritis.Dendritis;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.utils.handler.LogHandler;

final class ConfigBlocks extends Config {

    /**
     * Loads or creates the Blocks in the Configuration file.
     * 
     * @param config
     *            The {@link AdvConfiguration} file that is being edited.
     */
    protected static void configBlocks(final AdvConfiguration config) {
        LogHandler.finest(Dendritis.instance, "Loading Blocks Configs");
        Properties.oreDID = config.getBlock("Ores", Properties.blockID).getInt();
        Properties.blocksDID = config.getBlock("Blocks", Properties.blockID).getInt();
    }
}