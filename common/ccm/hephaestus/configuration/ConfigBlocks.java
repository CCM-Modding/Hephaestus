package ccm.hephaestus.configuration;

import net.minecraftforge.common.Configuration;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.BlockNames;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigBlocks extends Config {

    /**
     * Loads or creates the Blocks in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configBlocks(final Configuration config) {
        Handler.log(Hephaestus.instance, "Loading Blocks Configs");
        Properties.oreID = property.getNextUsableBlockID(config, "Ores").getInt();
        Properties.blocksID = property.getNextUsableBlockID(config, "Blocks").getInt();

        Properties.blockGrinderID = property.getNextUsableBlockID(config, BlockNames.blockGrinder).getInt();
        Properties.blockGrinderRunningID = property.getNextUsableBlockID(config, BlockNames.blockGrinder + "Active").getInt();
    }
}