package ccm.hephaestus.configuration;

import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.Handler;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;

final class ConfigBlocks extends Config
{

    /**
     * Loads or creates the Blocks in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configBlocks(final AdvConfiguration config)
    {
        Handler.log(Hephaestus.instance, "Loading Blocks Configs");
        Properties.oreID = config.getBlock(config, "Ores").getInt();
        Properties.blocksID = config.getBlock(config, "Blocks").getInt();

        Properties.blockGrinderID = config.getBlock(config, "Grinder").getInt();
        Properties.blockGrinderRunningID = config.getBlock(config, "Grinder Active").getInt();

        Properties.blockBlastID = config.getBlock(config, "Blast Furnace").getInt();
        Properties.blockBlastRunningID = config.getBlock(config, "Blast Furnace Active").getInt();
    }
}