package ccm.hephaestus.configuration;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.item.enums.EnumModTool;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.utils.handler.LogHandler;

final class ConfigUsable extends HarvestryConfig {

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configUsable(final AdvConfiguration config) {
        LogHandler.finest(Hephaestus.instance, "Loading Usable Configs");
        int id = Properties.itemID;
        Properties.gsStoneID = config.getItem(EnumModTool.gsStone.name(), id++).getInt();
        Properties.gsIronID = config.getItem(EnumModTool.gsIron.name(), id++).getInt();
        Properties.gsBronzeID = config.getItem(EnumModTool.gsBronze.name(), id++).getInt();
        Properties.gsObsidianID = config.getItem(EnumModTool.gsObsidian.name(), id++).getInt();
        Properties.gsDiamondID = config.getItem(EnumModTool.gsDiamond.name(), id++).getInt();
    }
}