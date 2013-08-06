package ccm.dendritis.configuration;

import ccm.dendritis.Dendritis;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.utils.handler.LogHandler;

final class ConfigArmors extends Config {

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The {@link AdvConfiguration} file that is being edited.
     */
    protected static void configArmors(final AdvConfiguration config) {
        LogHandler.finest(Dendritis.instance, "Loading Tools Configs");

        Properties.headAmethystID = config.getItem("Amethyst Head", Properties.itemID).getInt();
        Properties.chestAmethystID = config.getItem("Amethyst Chest", Properties.itemID).getInt();
        Properties.legsAmethystID = config.getItem("Amethyst Legs", Properties.itemID).getInt();
        Properties.bootsAmethystID = config.getItem("Amethyst Boots", Properties.itemID).getInt();

        Properties.headBDiamondID = config.getItem("BDiamond Head", Properties.itemID).getInt();
        Properties.chestBDiamondID = config.getItem("BDiamond Chest", Properties.itemID).getInt();
        Properties.legsBDiamondID = config.getItem("BDiamond Legs", Properties.itemID).getInt();
        Properties.bootsBDiamondID = config.getItem("BDiamond Boots", Properties.itemID).getInt();

        Properties.headCitrineID = config.getItem("Citrine Head", Properties.itemID).getInt();
        Properties.chestCitrineID = config.getItem("Citrine Chest", Properties.itemID).getInt();
        Properties.legsCitrineID = config.getItem("Citrine Legs", Properties.itemID).getInt();
        Properties.bootsCitrineID = config.getItem("Citrine Boots", Properties.itemID).getInt();

        Properties.headCZirconiaID = config.getItem("CZirconia Head", Properties.itemID).getInt();
        Properties.chestCZirconiaID = config.getItem("CZirconia Chest", Properties.itemID).getInt();
        Properties.legsCZirconiaID = config.getItem("CZirconia Legs", Properties.itemID).getInt();
        Properties.bootsCZirconiaID = config.getItem("CZirconia Boots", Properties.itemID).getInt();

        Properties.headEmeraldID = config.getItem("Emerald Head", Properties.itemID).getInt();
        Properties.chestEmeraldID = config.getItem("Emerald Chest", Properties.itemID).getInt();
        Properties.legsEmeraldID = config.getItem("Emerald Legs", Properties.itemID).getInt();
        Properties.bootsEmeraldID = config.getItem("Emerald Boots", Properties.itemID).getInt();

        Properties.headFuchsiaID = config.getItem("Fuchsia Head", Properties.itemID).getInt();
        Properties.chestFuchsiaID = config.getItem("Fuchsia Chest", Properties.itemID).getInt();
        Properties.legsFuchsiaID = config.getItem("Fuchsia Legs", Properties.itemID).getInt();
        Properties.bootsFuchsiaID = config.getItem("Fuchsia Boots", Properties.itemID).getInt();

        Properties.headJetID = config.getItem("Jet Head", Properties.itemID).getInt();
        Properties.chestJetID = config.getItem("Jet Chest", Properties.itemID).getInt();
        Properties.legsJetID = config.getItem("Jet Legs", Properties.itemID).getInt();
        Properties.bootsJetID = config.getItem("Jet Boots", Properties.itemID).getInt();

        Properties.headOlivineID = config.getItem("Olivine Head", Properties.itemID).getInt();
        Properties.chestOlivineID = config.getItem("Olivine Chest", Properties.itemID).getInt();
        Properties.legsOlivineID = config.getItem("Olivine Legs", Properties.itemID).getInt();
        Properties.bootsOlivineID = config.getItem("Olivine Boots", Properties.itemID).getInt();

        Properties.headOpalID = config.getItem("Opal Head", Properties.itemID).getInt();
        Properties.chestOpalID = config.getItem("Opal Chest", Properties.itemID).getInt();
        Properties.legsOpalID = config.getItem("Opal Legs", Properties.itemID).getInt();
        Properties.bootsOpalID = config.getItem("Opal Boots", Properties.itemID).getInt();

        Properties.headQuartzID = config.getItem("Quartz Head", Properties.itemID).getInt();
        Properties.chestQuartzID = config.getItem("Quartz Chest", Properties.itemID).getInt();
        Properties.legsQuartzID = config.getItem("Quartz Legs", Properties.itemID).getInt();
        Properties.bootsQuartzID = config.getItem("Quartz Boots", Properties.itemID).getInt();

        Properties.headRubyID = config.getItem("Ruby Head", Properties.itemID).getInt();
        Properties.chestRubyID = config.getItem("Ruby Chest", Properties.itemID).getInt();
        Properties.legsRubyID = config.getItem("Ruby Legs", Properties.itemID).getInt();
        Properties.bootsRubyID = config.getItem("Ruby Boots", Properties.itemID).getInt();

        Properties.headSapphireID = config.getItem("Sapphire Head", Properties.itemID).getInt();
        Properties.chestSapphireID = config.getItem("Sapphire Chest", Properties.itemID).getInt();
        Properties.legsSapphireID = config.getItem("Sapphire Legs", Properties.itemID).getInt();
        Properties.bootsSapphireID = config.getItem("Sapphire Boots", Properties.itemID).getInt();

        Properties.headSQuartzID = config.getItem("SQuartz Head", Properties.itemID).getInt();
        Properties.chestSQuartzID = config.getItem("SQuartz Chest", Properties.itemID).getInt();
        Properties.legsSQuartzID = config.getItem("SQuartz Legs", Properties.itemID).getInt();
        Properties.bootsSQuartzID = config.getItem("SQuartz Boots", Properties.itemID).getInt();

        Properties.headSunID = config.getItem("Sun Head", Properties.itemID).getInt();
        Properties.chestSunID = config.getItem("Sun Chest", Properties.itemID).getInt();
        Properties.legsSunID = config.getItem("Sun Legs", Properties.itemID).getInt();
        Properties.bootsSunID = config.getItem("Sun Boots", Properties.itemID).getInt();

        Properties.headTopazID = config.getItem("Topaz Head", Properties.itemID).getInt();
        Properties.chestTopazID = config.getItem("Topaz Chest", Properties.itemID).getInt();
        Properties.legsTopazID = config.getItem("Topaz Legs", Properties.itemID).getInt();
        Properties.bootsTopazID = config.getItem("Topaz Boots", Properties.itemID).getInt();

        Properties.headTurquoiseID = config.getItem("Turquoise Head", Properties.itemID).getInt();
        Properties.chestTurquoiseID = config.getItem("Turquoise Chest", Properties.itemID).getInt();
        Properties.legsTurquoiseID = config.getItem("Turquoise Legs", Properties.itemID).getInt();
        Properties.bootsTurquoiseID = config.getItem("Turquoise Boots", Properties.itemID).getInt();

        Properties.headWAlabasterID = config.getItem("WAlabaster Head", Properties.itemID).getInt();
        Properties.chestWAlabasterID = config.getItem("WAlabaster Chest", Properties.itemID).getInt();
        Properties.legsWAlabasterID = config.getItem("WAlabaster Legs", Properties.itemID).getInt();
        Properties.bootsWAlabasterID = config.getItem("WAlabaster Boots", Properties.itemID).getInt();
    }
}