package ccm.dendritis.configuration;

import ccm.dendritis.Dendritis;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.utils.handler.LogHandler;

final class ConfigTools extends Config {

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The {@link AdvConfiguration} file that is being edited.
     */
    protected static void configTools(final AdvConfiguration config) {
        LogHandler.finest(Dendritis.instance, ", Properties.itemIDLoading Tools Configs");

        Properties.axeAmethystID = config.getItem("Amethyst Axe", Properties.itemID).getInt();
        Properties.hoeAmethystID = config.getItem("Amethyst Hoe", Properties.itemID).getInt();
        Properties.spadeAmethystID = config.getItem("Amethyst Spade", Properties.itemID).getInt();
        Properties.pickAmethystID = config.getItem("Amethyst Pick", Properties.itemID).getInt();
        Properties.swordAmethystID = config.getItem("Amethyst Sword", Properties.itemID).getInt();

        Properties.axeBDiamondID = config.getItem("BDiamond Axe", Properties.itemID).getInt();
        Properties.hoeBDiamondID = config.getItem("BDiamond Hoe", Properties.itemID).getInt();
        Properties.spadeBDiamondID = config.getItem("BDiamond Spade", Properties.itemID).getInt();
        Properties.pickBDiamondID = config.getItem("BDiamond Pick", Properties.itemID).getInt();
        Properties.swordBDiamondID = config.getItem("BDiamond Sword", Properties.itemID).getInt();

        Properties.axeCitrineID = config.getItem("Citrine Axe", Properties.itemID).getInt();
        Properties.hoeCitrineID = config.getItem("Citrine Hoe", Properties.itemID).getInt();
        Properties.spadeCitrineID = config.getItem("Citrine Spade", Properties.itemID).getInt();
        Properties.pickCitrineID = config.getItem("Citrine Pick", Properties.itemID).getInt();
        Properties.swordCitrineID = config.getItem("Citrine Sword", Properties.itemID).getInt();

        Properties.axeCZirconiaID = config.getItem("CZirconia Axe", Properties.itemID).getInt();
        Properties.hoeCZirconiaID = config.getItem("CZirconia Hoe", Properties.itemID).getInt();
        Properties.spadeCZirconiaID = config.getItem("CZirconia Spade", Properties.itemID).getInt();
        Properties.pickCZirconiaID = config.getItem("CZirconia Pick", Properties.itemID).getInt();
        Properties.swordCZirconiaID = config.getItem("CZirconia Sword", Properties.itemID).getInt();

        Properties.axeEmeraldID = config.getItem("Emerald Axe", Properties.itemID).getInt();
        Properties.hoeEmeraldID = config.getItem("Emerald Hoe", Properties.itemID).getInt();
        Properties.spadeEmeraldID = config.getItem("Emerald Spade", Properties.itemID).getInt();
        Properties.pickEmeraldID = config.getItem("Emerald Pick", Properties.itemID).getInt();
        Properties.swordEmeraldID = config.getItem("Emerald Sword", Properties.itemID).getInt();

        Properties.axeFuchsiaID = config.getItem("Fuchsia Axe", Properties.itemID).getInt();
        Properties.hoeFuchsiaID = config.getItem("Fuchsia Hoe", Properties.itemID).getInt();
        Properties.spadeFuchsiaID = config.getItem("Fuchsia Spade", Properties.itemID).getInt();
        Properties.pickFuchsiaID = config.getItem("Fuchsia Pick", Properties.itemID).getInt();
        Properties.swordFuchsiaID = config.getItem("Fuchsia Sword", Properties.itemID).getInt();

        Properties.axeJetID = config.getItem("Jet Axe", Properties.itemID).getInt();
        Properties.hoeJetID = config.getItem("Jet Hoe", Properties.itemID).getInt();
        Properties.spadeJetID = config.getItem("Jet Spade", Properties.itemID).getInt();
        Properties.pickJetID = config.getItem("Jet Pick", Properties.itemID).getInt();
        Properties.swordJetID = config.getItem("Jet Sword", Properties.itemID).getInt();

        Properties.axeOlivineID = config.getItem("Olivine Axe", Properties.itemID).getInt();
        Properties.hoeOlivineID = config.getItem("Olivine Hoe", Properties.itemID).getInt();
        Properties.spadeOlivineID = config.getItem("Olivine Spade", Properties.itemID).getInt();
        Properties.pickOlivineID = config.getItem("Olivine Pick", Properties.itemID).getInt();
        Properties.swordOlivineID = config.getItem("Olivine Sword", Properties.itemID).getInt();

        Properties.axeOpalID = config.getItem("Opal Axe", Properties.itemID).getInt();
        Properties.hoeOpalID = config.getItem("Opal Hoe", Properties.itemID).getInt();
        Properties.spadeOpalID = config.getItem("Opal Spade", Properties.itemID).getInt();
        Properties.pickOpalID = config.getItem("Opal Pick", Properties.itemID).getInt();
        Properties.swordOpalID = config.getItem("Opal Sword", Properties.itemID).getInt();

        Properties.axeQuartzID = config.getItem("Quartz Axe", Properties.itemID).getInt();
        Properties.hoeQuartzID = config.getItem("Quartz Hoe", Properties.itemID).getInt();
        Properties.spadeQuartzID = config.getItem("Quartz Spade", Properties.itemID).getInt();
        Properties.pickQuartzID = config.getItem("Quartz Pick", Properties.itemID).getInt();
        Properties.swordQuartzID = config.getItem("Quartz Sword", Properties.itemID).getInt();

        Properties.axeRubyID = config.getItem("Ruby Axe", Properties.itemID).getInt();
        Properties.hoeRubyID = config.getItem("Ruby Hoe", Properties.itemID).getInt();
        Properties.spadeRubyID = config.getItem("Ruby Spade", Properties.itemID).getInt();
        Properties.pickRubyID = config.getItem("Ruby Pick", Properties.itemID).getInt();
        Properties.swordRubyID = config.getItem("Ruby Sword", Properties.itemID).getInt();

        Properties.axeSapphireID = config.getItem("Sapphire Axe", Properties.itemID).getInt();
        Properties.hoeSapphireID = config.getItem("Sapphire Hoe", Properties.itemID).getInt();
        Properties.spadeSapphireID = config.getItem("Sapphire Spade", Properties.itemID).getInt();
        Properties.pickSapphireID = config.getItem("Sapphire Pick", Properties.itemID).getInt();
        Properties.swordSapphireID = config.getItem("Sapphire Sword", Properties.itemID).getInt();

        Properties.axeSQuartzID = config.getItem("SQuartz Axe", Properties.itemID).getInt();
        Properties.hoeSQuartzID = config.getItem("SQuartz Hoe", Properties.itemID).getInt();
        Properties.spadeSQuartzID = config.getItem("SQuartz Spade", Properties.itemID).getInt();
        Properties.pickSQuartzID = config.getItem("SQuartz Pick", Properties.itemID).getInt();
        Properties.swordSQuartzID = config.getItem("SQuartz Sword", Properties.itemID).getInt();

        Properties.axeSunID = config.getItem("Sun Axe", Properties.itemID).getInt();
        Properties.hoeSunID = config.getItem("Sun Hoe", Properties.itemID).getInt();
        Properties.spadeSunID = config.getItem("Sun Spade", Properties.itemID).getInt();
        Properties.pickSunID = config.getItem("Sun Pick", Properties.itemID).getInt();
        Properties.swordSunID = config.getItem("Sun Sword", Properties.itemID).getInt();

        Properties.axeTopazID = config.getItem("Topaz Axe", Properties.itemID).getInt();
        Properties.hoeTopazID = config.getItem("Topaz Hoe", Properties.itemID).getInt();
        Properties.spadeTopazID = config.getItem("Topaz Spade", Properties.itemID).getInt();
        Properties.pickTopazID = config.getItem("Topaz Pick", Properties.itemID).getInt();
        Properties.swordTopazID = config.getItem("Topaz Sword", Properties.itemID).getInt();

        Properties.axeTurquoiseID = config.getItem("Turquoise Axe", Properties.itemID).getInt();
        Properties.hoeTurquoiseID = config.getItem("Turquoise Hoe", Properties.itemID).getInt();
        Properties.spadeTurquoiseID = config.getItem("Turquoise Spade", Properties.itemID).getInt();
        Properties.pickTurquoiseID = config.getItem("Turquoise Pick", Properties.itemID).getInt();
        Properties.swordTurquoiseID = config.getItem("Turquoise Sword", Properties.itemID).getInt();

        Properties.axeWAlabasterID = config.getItem("WAlabaster Axe", Properties.itemID).getInt();
        Properties.hoeWAlabasterID = config.getItem("WAlabaster Hoe", Properties.itemID).getInt();
        Properties.spadeWAlabasterID = config.getItem("WAlabaster Spade", Properties.itemID).getInt();
        Properties.pickWAlabasterID = config.getItem("WAlabaster Pick", Properties.itemID).getInt();
        Properties.swordWAlabasterID = config.getItem("WAlabaster Sword", Properties.itemID).getInt();
    }
}