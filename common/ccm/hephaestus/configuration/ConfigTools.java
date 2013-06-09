package ccm.hephaestus.configuration;

import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.Handler;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;

final class ConfigTools extends Config
{

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configUsable(final AdvConfiguration config)
    {
        Handler.log(Hephaestus.instance, "Loading Tools Configs");
        Properties.gsStoneID = config.getItem(config, "Grind Stone, Stone").getInt();
        Properties.gsIronID = config.getItem(config, "Grind Stone, Iron").getInt();
        Properties.gsBronzeID = config.getItem(config, "Grind Stone, Bronze").getInt();
        Properties.gsObsidianID = config.getItem(config, "Grind Stone, Obsidian").getInt();
        Properties.gsDiamondID = config.getItem(config, "Grind Stone, Diamond").getInt();
    }
}