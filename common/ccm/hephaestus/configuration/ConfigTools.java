package ccm.hephaestus.configuration;

import net.minecraftforge.common.Configuration;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.enums.EnumUsable;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigTools extends Config {

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configUsable(final Configuration config) {
        Handler.log(Hephaestus.instance, "Loading Tools Configs");
        Properties.gsStoneID = property.getNextUsableItemID(config, EnumUsable.gsStone.name()).getInt();
        Properties.gsIronID = property.getNextUsableItemID(config, EnumUsable.gsIron.name()).getInt();
        Properties.gsBronzeID = property.getNextUsableItemID(config, EnumUsable.gsBronze.name()).getInt();
        Properties.gsObsidianID = property.getNextUsableItemID(config, EnumUsable.gsObsidian.name()).getInt();
        Properties.gsDiamondID = property.getNextUsableItemID(config, EnumUsable.gsDiamond.name()).getInt();
    }
}