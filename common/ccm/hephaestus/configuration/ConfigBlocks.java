package ccm.hephaestus.configuration;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum.omnium.configuration.ConfigurationWrapper;

final class ConfigBlocks extends HephaestusConfig
{

    /**
     * Loads or creates the Blocks in the AdvConfiguration file.
     * 
     * @param config
     *            The AdvConfiguration file that is being edited.
     */
    protected static void configBlocks(final ConfigurationWrapper config)
    {
        Hephaestus.instance.getLogger().finest("Loading Block Configs");
        int id = Properties.blockID;

        Properties.oreID = config.getBlock("Ores", id++).getInt();

        Properties.stgBlockID = config.getBlock("StorageBlocks", id++).getInt();

        Properties.machineBlockID = config.getBlock("Machines", id++).getInt();
    }
}