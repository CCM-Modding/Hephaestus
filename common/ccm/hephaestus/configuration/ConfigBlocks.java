package ccm.hephaestus.configuration;

import net.minecraftforge.common.Configuration;

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
    protected static void configBlocks(final Configuration config)
    {
        Handler.log(Hephaestus.instance, "Loading Blocks Configs");
        Properties.oreID = property.getNextUsableBlockID(config, "Ores").getInt();
        Properties.blocksID = property.getNextUsableBlockID(config, "Blocks").getInt();

        Properties.blockGrinderID = property.getNextUsableBlockID(config, "Grinder").getInt();
        Properties.blockGrinderRunningID = property.getNextUsableBlockID(config, "Grinder Active").getInt();

        Properties.blockBlastID = property.getNextUsableBlockID(config, "Blast Furnace").getInt();
        Properties.blockBlastRunningID = property.getNextUsableBlockID(config, "Blast Furnace Active").getInt();
    }
}