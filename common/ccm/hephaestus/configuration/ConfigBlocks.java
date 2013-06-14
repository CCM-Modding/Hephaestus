package ccm.hephaestus.configuration;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigBlocks extends Config {

    /**
     * Loads or creates the Blocks in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configBlocks(final AdvConfiguration config) {
        Handler.log(Hephaestus.instance, "Loading Blocks Configs");
        Properties.oreID = config.getBlock("Ores", Properties.blocksID).getInt();
        Properties.blocksID = config.getBlock("Blocks", Properties.blocksID).getInt();

        Properties.blockGrinderID = config.getBlock("Grinder", Properties.blocksID).getInt();
        Properties.blockGrinderRunningID = config.getBlock("Grinder_Active", Properties.blocksID)
                .getInt();

        Properties.blockBlastID = config.getBlock("BlastFurnace", Properties.blocksID).getInt();
        Properties.blockBlastRunningID = config
                .getBlock("BlastFurnace_Active", Properties.blocksID).getInt();
    }
}