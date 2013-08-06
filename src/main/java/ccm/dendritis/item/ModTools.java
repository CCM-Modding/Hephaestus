package ccm.dendritis.item;

import net.minecraft.item.Item;
import ccm.dendritis.Dendritis;
import ccm.dendritis.item.tool.DummyAxe;
import ccm.dendritis.item.tool.DummyHoe;
import ccm.dendritis.item.tool.DummyPick;
import ccm.dendritis.item.tool.DummySpade;
import ccm.dendritis.item.tool.DummySword;
import ccm.dendritis.item.tool.ToolMaterials;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.utils.handler.LogHandler;

public final class ModTools {

    public static Item axeAmethyst;

    public static Item hoeAmethyst;

    public static Item spadeAmethyst;

    public static Item pickAmethyst;

    public static Item swordAmethyst;

    public static Item axeBDiamond;

    public static Item hoeBDiamond;

    public static Item spadeBDiamond;

    public static Item pickBDiamond;

    public static Item swordBDiamond;

    public static Item axeCitrine;

    public static Item hoeCitrine;

    public static Item spadeCitrine;

    public static Item pickCitrine;

    public static Item swordCitrine;

    public static Item axeCZirconia;

    public static Item hoeCZirconia;

    public static Item spadeCZirconia;

    public static Item pickCZirconia;

    public static Item swordCZirconia;

    public static Item axeEmerald;

    public static Item hoeEmerald;

    public static Item spadeEmerald;

    public static Item pickEmerald;

    public static Item swordEmerald;

    public static Item axeFuchsia;

    public static Item hoeFuchsia;

    public static Item spadeFuchsia;

    public static Item pickFuchsia;

    public static Item swordFuchsia;

    public static Item axeJet;

    public static Item hoeJet;

    public static Item spadeJet;

    public static Item pickJet;

    public static Item swordJet;

    public static Item axeOlivine;

    public static Item hoeOlivine;

    public static Item spadeOlivine;

    public static Item pickOlivine;

    public static Item swordOlivine;

    public static Item axeOpal;

    public static Item hoeOpal;

    public static Item spadeOpal;

    public static Item pickOpal;

    public static Item swordOpal;

    public static Item axeQuartz;

    public static Item hoeQuartz;

    public static Item spadeQuartz;

    public static Item pickQuartz;

    public static Item swordQuartz;

    public static Item axeRuby;

    public static Item hoeRuby;

    public static Item spadeRuby;

    public static Item pickRuby;

    public static Item swordRuby;

    public static Item axeSapphire;

    public static Item hoeSapphire;

    public static Item spadeSapphire;

    public static Item pickSapphire;

    public static Item swordSapphire;

    public static Item axeSQuartz;

    public static Item hoeSQuartz;

    public static Item spadeSQuartz;

    public static Item pickSQuartz;

    public static Item swordSQuartz;

    public static Item axeSun;

    public static Item hoeSun;

    public static Item spadeSun;

    public static Item pickSun;

    public static Item swordSun;

    public static Item axeTopaz;

    public static Item hoeTopaz;

    public static Item spadeTopaz;

    public static Item pickTopaz;

    public static Item swordTopaz;

    public static Item axeTurquoise;

    public static Item hoeTurquoise;

    public static Item spadeTurquoise;

    public static Item pickTurquoise;

    public static Item swordTurquoise;

    public static Item axeWAlabaster;

    public static Item hoeWAlabaster;

    public static Item spadeWAlabaster;

    public static Item pickWAlabaster;

    public static Item swordWAlabaster;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init() {
        LogHandler.finest(Dendritis.instance, "Loading Items");

        ModTools.axeAmethyst = new DummyAxe(Properties.axeAmethystID, ToolMaterials.toolAMETHYST).setUnlocalizedName("axeAmethyst");
        ModTools.hoeAmethyst = new DummyHoe(Properties.hoeAmethystID, ToolMaterials.toolAMETHYST).setUnlocalizedName("hoeAmethyst");
        ModTools.spadeAmethyst = new DummySpade(Properties.spadeAmethystID, ToolMaterials.toolAMETHYST).setUnlocalizedName("spadeAmethyst");
        ModTools.pickAmethyst = new DummyPick(Properties.pickAmethystID, ToolMaterials.toolAMETHYST).setUnlocalizedName("pickAmethyst");
        ModTools.swordAmethyst = new DummySword(Properties.swordAmethystID, ToolMaterials.toolAMETHYST).setUnlocalizedName("swordAmethyst");

        ModTools.axeBDiamond = new DummyAxe(Properties.axeBDiamondID, ToolMaterials.toolBDIAMOND).setUnlocalizedName("axeBDiamond");
        ModTools.hoeBDiamond = new DummyHoe(Properties.hoeBDiamondID, ToolMaterials.toolBDIAMOND).setUnlocalizedName("hoeBDiamond");
        ModTools.spadeBDiamond = new DummySpade(Properties.spadeBDiamondID, ToolMaterials.toolBDIAMOND).setUnlocalizedName("spadeBDiamond");
        ModTools.pickBDiamond = new DummyPick(Properties.pickBDiamondID, ToolMaterials.toolBDIAMOND).setUnlocalizedName("pickBDiamond");
        ModTools.swordBDiamond = new DummySword(Properties.swordBDiamondID, ToolMaterials.toolBDIAMOND).setUnlocalizedName("swordBDiamond");

        ModTools.axeCitrine = new DummyAxe(Properties.axeCitrineID, ToolMaterials.toolCITRINE).setUnlocalizedName("axeCitrine");
        ModTools.hoeCitrine = new DummyHoe(Properties.hoeCitrineID, ToolMaterials.toolCITRINE).setUnlocalizedName("hoeCitrine");
        ModTools.spadeCitrine = new DummySpade(Properties.spadeCitrineID, ToolMaterials.toolCITRINE).setUnlocalizedName("spadeCitrine");
        ModTools.pickCitrine = new DummyPick(Properties.pickCitrineID, ToolMaterials.toolCITRINE).setUnlocalizedName("pickCitrine");
        ModTools.swordCitrine = new DummySword(Properties.swordCitrineID, ToolMaterials.toolCITRINE).setUnlocalizedName("swordCitrine");

        ModTools.axeCZirconia = new DummyAxe(Properties.axeCZirconiaID, ToolMaterials.toolCZIRCONIA).setUnlocalizedName("axeCZirconia");
        ModTools.hoeCZirconia = new DummyHoe(Properties.hoeCZirconiaID, ToolMaterials.toolCZIRCONIA).setUnlocalizedName("hoeCZirconia");
        ModTools.spadeCZirconia = new DummySpade(Properties.spadeCZirconiaID, ToolMaterials.toolCZIRCONIA).setUnlocalizedName("spadeCZirconia");
        ModTools.pickCZirconia = new DummyPick(Properties.pickCZirconiaID, ToolMaterials.toolCZIRCONIA).setUnlocalizedName("pickCZirconia");
        ModTools.swordCZirconia = new DummySword(Properties.swordCZirconiaID, ToolMaterials.toolCZIRCONIA).setUnlocalizedName("swordCZirconia");

        ModTools.axeEmerald = new DummyAxe(Properties.axeEmeraldID, ToolMaterials.toolEMERALD).setUnlocalizedName("axeEmerald");
        ModTools.hoeEmerald = new DummyHoe(Properties.hoeEmeraldID, ToolMaterials.toolEMERALD).setUnlocalizedName("hoeEmerald");
        ModTools.spadeEmerald = new DummySpade(Properties.spadeEmeraldID, ToolMaterials.toolEMERALD).setUnlocalizedName("spadeEmerald");
        ModTools.pickEmerald = new DummyPick(Properties.pickEmeraldID, ToolMaterials.toolEMERALD).setUnlocalizedName("pickEmerald");
        ModTools.swordEmerald = new DummySword(Properties.swordEmeraldID, ToolMaterials.toolEMERALD).setUnlocalizedName("swordEmerald");

        ModTools.axeFuchsia = new DummyAxe(Properties.axeFuchsiaID, ToolMaterials.toolFUCHSIA).setUnlocalizedName("axeFuchsia");
        ModTools.hoeFuchsia = new DummyHoe(Properties.hoeFuchsiaID, ToolMaterials.toolFUCHSIA).setUnlocalizedName("hoeFuchsia");
        ModTools.spadeFuchsia = new DummySpade(Properties.spadeFuchsiaID, ToolMaterials.toolFUCHSIA).setUnlocalizedName("spadeFuchsia");
        ModTools.pickFuchsia = new DummyPick(Properties.pickFuchsiaID, ToolMaterials.toolFUCHSIA).setUnlocalizedName("pickFuchsia");
        ModTools.swordFuchsia = new DummySword(Properties.swordFuchsiaID, ToolMaterials.toolFUCHSIA).setUnlocalizedName("swordFuchsia");

        ModTools.axeJet = new DummyAxe(Properties.axeJetID, ToolMaterials.toolJET).setUnlocalizedName("axeJet");
        ModTools.hoeJet = new DummyHoe(Properties.hoeJetID, ToolMaterials.toolJET).setUnlocalizedName("hoeJet");
        ModTools.spadeJet = new DummySpade(Properties.spadeJetID, ToolMaterials.toolJET).setUnlocalizedName("spadeJet");
        ModTools.pickJet = new DummyPick(Properties.pickJetID, ToolMaterials.toolJET).setUnlocalizedName("pickJet");
        ModTools.swordJet = new DummySword(Properties.swordJetID, ToolMaterials.toolJET).setUnlocalizedName("swordJet");

        ModTools.axeOlivine = new DummyAxe(Properties.axeOlivineID, ToolMaterials.toolOLIVINE).setUnlocalizedName("axeOlivine");
        ModTools.hoeOlivine = new DummyHoe(Properties.hoeOlivineID, ToolMaterials.toolOLIVINE).setUnlocalizedName("hoeOlivine");
        ModTools.spadeOlivine = new DummySpade(Properties.spadeOlivineID, ToolMaterials.toolOLIVINE).setUnlocalizedName("spadeOlivine");
        ModTools.pickOlivine = new DummyPick(Properties.pickOlivineID, ToolMaterials.toolOLIVINE).setUnlocalizedName("pickOlivine");
        ModTools.swordOlivine = new DummySword(Properties.swordOlivineID, ToolMaterials.toolOLIVINE).setUnlocalizedName("swordOlivine");

        ModTools.axeOpal = new DummyAxe(Properties.axeOpalID, ToolMaterials.toolOPAL).setUnlocalizedName("axeOpal");
        ModTools.hoeOpal = new DummyHoe(Properties.hoeOpalID, ToolMaterials.toolOPAL).setUnlocalizedName("hoeOpal");
        ModTools.spadeOpal = new DummySpade(Properties.spadeOpalID, ToolMaterials.toolOPAL).setUnlocalizedName("spadeOpal");
        ModTools.pickOpal = new DummyPick(Properties.pickOpalID, ToolMaterials.toolOPAL).setUnlocalizedName("pickOpal");
        ModTools.swordOpal = new DummySword(Properties.swordOpalID, ToolMaterials.toolOPAL).setUnlocalizedName("swordOpal");

        ModTools.axeQuartz = new DummyAxe(Properties.axeQuartzID, ToolMaterials.toolQUARTZ).setUnlocalizedName("axeQuartz");
        ModTools.hoeQuartz = new DummyHoe(Properties.hoeQuartzID, ToolMaterials.toolQUARTZ).setUnlocalizedName("hoeQuartz");
        ModTools.spadeQuartz = new DummySpade(Properties.spadeQuartzID, ToolMaterials.toolQUARTZ).setUnlocalizedName("spadeQuartz");
        ModTools.pickQuartz = new DummyPick(Properties.pickQuartzID, ToolMaterials.toolQUARTZ).setUnlocalizedName("pickQuartz");
        ModTools.swordQuartz = new DummySword(Properties.swordQuartzID, ToolMaterials.toolQUARTZ).setUnlocalizedName("swordQuartz");

        ModTools.axeRuby = new DummyAxe(Properties.axeRubyID, ToolMaterials.toolRUBY).setUnlocalizedName("axeRuby");
        ModTools.hoeRuby = new DummyHoe(Properties.hoeRubyID, ToolMaterials.toolRUBY).setUnlocalizedName("hoeRuby");
        ModTools.spadeRuby = new DummySpade(Properties.spadeRubyID, ToolMaterials.toolRUBY).setUnlocalizedName("spadeRuby");
        ModTools.pickRuby = new DummyPick(Properties.pickRubyID, ToolMaterials.toolRUBY).setUnlocalizedName("pickRuby");
        ModTools.swordRuby = new DummySword(Properties.swordRubyID, ToolMaterials.toolRUBY).setUnlocalizedName("swordRuby");

        ModTools.axeSapphire = new DummyAxe(Properties.axeSapphireID, ToolMaterials.toolSAPPHIRE).setUnlocalizedName("axeSapphire");
        ModTools.hoeSapphire = new DummyHoe(Properties.hoeSapphireID, ToolMaterials.toolSAPPHIRE).setUnlocalizedName("hoeSapphire");
        ModTools.spadeSapphire = new DummySpade(Properties.spadeSapphireID, ToolMaterials.toolSAPPHIRE).setUnlocalizedName("spadeSapphire");
        ModTools.pickSapphire = new DummyPick(Properties.pickSapphireID, ToolMaterials.toolSAPPHIRE).setUnlocalizedName("pickSapphire");
        ModTools.swordSapphire = new DummySword(Properties.swordSapphireID, ToolMaterials.toolSAPPHIRE).setUnlocalizedName("swordSapphire");

        ModTools.axeSQuartz = new DummyAxe(Properties.axeSQuartzID, ToolMaterials.toolSQUARTZ).setUnlocalizedName("axeSQuartz");
        ModTools.hoeSQuartz = new DummyHoe(Properties.hoeSQuartzID, ToolMaterials.toolSQUARTZ).setUnlocalizedName("hoeSQuartz");
        ModTools.spadeSQuartz = new DummySpade(Properties.spadeSQuartzID, ToolMaterials.toolSQUARTZ).setUnlocalizedName("spadeSQuartz");
        ModTools.pickSQuartz = new DummyPick(Properties.pickSQuartzID, ToolMaterials.toolSQUARTZ).setUnlocalizedName("pickSQuartz");
        ModTools.swordSQuartz = new DummySword(Properties.swordSQuartzID, ToolMaterials.toolSQUARTZ).setUnlocalizedName("swordSQuartz");

        ModTools.axeSun = new DummyAxe(Properties.axeSunID, ToolMaterials.toolSUN).setUnlocalizedName("axeSun");
        ModTools.hoeSun = new DummyHoe(Properties.hoeSunID, ToolMaterials.toolSUN).setUnlocalizedName("hoeSun");
        ModTools.spadeSun = new DummySpade(Properties.spadeSunID, ToolMaterials.toolSUN).setUnlocalizedName("spadeSun");
        ModTools.pickSun = new DummyPick(Properties.pickSunID, ToolMaterials.toolSUN).setUnlocalizedName("pickSun");
        ModTools.swordSun = new DummySword(Properties.swordSunID, ToolMaterials.toolSUN).setUnlocalizedName("swordSun");

        ModTools.axeTopaz = new DummyAxe(Properties.axeTopazID, ToolMaterials.toolTOPAZ).setUnlocalizedName("axeTopaz");
        ModTools.hoeTopaz = new DummyHoe(Properties.hoeTopazID, ToolMaterials.toolTOPAZ).setUnlocalizedName("hoeTopaz");
        ModTools.spadeTopaz = new DummySpade(Properties.spadeTopazID, ToolMaterials.toolTOPAZ).setUnlocalizedName("spadeTopaz");
        ModTools.pickTopaz = new DummyPick(Properties.pickTopazID, ToolMaterials.toolTOPAZ).setUnlocalizedName("pickTopaz");
        ModTools.swordTopaz = new DummySword(Properties.swordTopazID, ToolMaterials.toolTOPAZ).setUnlocalizedName("swordTopaz");

        ModTools.axeTurquoise = new DummyAxe(Properties.axeTurquoiseID, ToolMaterials.toolTURQUOISE).setUnlocalizedName("axeTurquoise");
        ModTools.hoeTurquoise = new DummyHoe(Properties.hoeTurquoiseID, ToolMaterials.toolTURQUOISE).setUnlocalizedName("hoeTurquoise");
        ModTools.spadeTurquoise = new DummySpade(Properties.spadeTurquoiseID, ToolMaterials.toolTURQUOISE).setUnlocalizedName("spadeTurquoise");
        ModTools.pickTurquoise = new DummyPick(Properties.pickTurquoiseID, ToolMaterials.toolTURQUOISE).setUnlocalizedName("pickTurquoise");
        ModTools.swordTurquoise = new DummySword(Properties.swordTurquoiseID, ToolMaterials.toolTURQUOISE).setUnlocalizedName("swordTurquoise");

        ModTools.axeWAlabaster = new DummyAxe(Properties.axeWAlabasterID, ToolMaterials.toolWALABASTER).setUnlocalizedName("axeWAlabaster");
        ModTools.hoeWAlabaster = new DummyHoe(Properties.hoeWAlabasterID, ToolMaterials.toolWALABASTER).setUnlocalizedName("hoeWAlabaster");
        ModTools.spadeWAlabaster = new DummySpade(Properties.spadeWAlabasterID, ToolMaterials.toolWALABASTER).setUnlocalizedName("spadeWAlabaster");
        ModTools.pickWAlabaster = new DummyPick(Properties.pickWAlabasterID, ToolMaterials.toolWALABASTER).setUnlocalizedName("pickWAlabaster");
        ModTools.swordWAlabaster = new DummySword(Properties.swordWAlabasterID, ToolMaterials.toolWALABASTER).setUnlocalizedName("swordWAlabaster");

    }
}