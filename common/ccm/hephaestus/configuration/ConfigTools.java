package ccm.hephaestus.configuration;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigTools extends Config {

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configUsable(final AdvConfiguration config) {
        final String stone = "GrindStone";
        Handler.log(Hephaestus.instance, "Loading Tools Configs");
        Properties.gsStoneID = config.getItem("Stone" + stone, Properties.itemID).getInt();
        Properties.gsIronID = config.getItem("Iron" + stone, Properties.itemID).getInt();
        Properties.gsBronzeID = config.getItem("Bronze" + stone, Properties.itemID).getInt();
        Properties.gsObsidianID = config.getItem("Obsidian" + stone, Properties.itemID).getInt();
        Properties.gsDiamondID = config.getItem("Diamond" + stone, Properties.itemID).getInt();
    }
}