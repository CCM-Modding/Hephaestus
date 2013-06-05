package ccm.hephaestus.configuration;

import net.minecraftforge.common.Configuration;

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
    protected static void configUsable(final Configuration config)
    {
        Handler.log(Hephaestus.instance, "Loading Tools Configs");
        Properties.gsStoneID = property.getNextUsableItemID(config, "Grind Stone, Stone").getInt();
        Properties.gsIronID = property.getNextUsableItemID(config, "Grind Stone, Iron").getInt();
        Properties.gsBronzeID = property.getNextUsableItemID(config, "Grind Stone, Bronze").getInt();
        Properties.gsObsidianID = property.getNextUsableItemID(config, "Grind Stone, Obsidian").getInt();
        Properties.gsDiamondID = property.getNextUsableItemID(config, "Grind Stone, Diamond").getInt();
    }
}