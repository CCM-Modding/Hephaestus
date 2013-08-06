package ccm.hephaestus.configuration;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.utils.handler.LogHandler;

final class ConfigBlocks extends Config {

    /**
     * Loads or creates the Blocks in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configBlocks(final AdvConfiguration config) {
        LogHandler.finest(Hephaestus.instance, "Loading Blocks Configs");
        Properties.oreHID = config.getBlock("Ores", Properties.oreHID).getInt();
        Properties.blocksHID = config.getBlock("Blocks", Properties.blocksHID).getInt();

        Properties.blockGrinderID = config.getBlock("Grinder", Properties.blockGrinderID).getInt();
        Properties.blockGrinderRunningID = config.getBlock("Grinder_Active", Properties.blockGrinderRunningID).getInt();

        Properties.blockBlastID = config.getBlock("BlastFurnace", Properties.blockBlastID).getInt();
        Properties.blockBlastRunningID = config.getBlock("BlastFurnace_Active", Properties.blockBlastRunningID).getInt();
    }
}