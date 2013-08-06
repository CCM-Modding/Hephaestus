package ccm.dendritis.item;

import net.minecraft.item.Item;
import ccm.dendritis.Dendritis;
import ccm.dendritis.item.armor.ArmorMaterials;
import ccm.dendritis.item.armor.DummyArmor;
import ccm.dendritis.utils.lib.Properties;
import ccm.nucleum_omnium.handler.LogHandler;

public final class ModArmors {

    public static Item headAmethyst;

    public static Item chestAmethyst;

    public static Item legsAmethyst;

    public static Item bootsAmethyst;

    public static Item headBDiamond;

    public static Item chestBDiamond;

    public static Item legsBDiamond;

    public static Item bootsBDiamond;

    public static Item headCitrine;

    public static Item chestCitrine;

    public static Item legsCitrine;

    public static Item bootsCitrine;

    public static Item headCZirconia;

    public static Item chestCZirconia;

    public static Item legsCZirconia;

    public static Item bootsCZirconia;

    public static Item headEmerald;

    public static Item chestEmerald;

    public static Item legsEmerald;

    public static Item bootsEmerald;

    public static Item headFuchsia;

    public static Item chestFuchsia;

    public static Item legsFuchsia;

    public static Item bootsFuchsia;

    public static Item headJet;

    public static Item chestJet;

    public static Item legsJet;

    public static Item bootsJet;

    public static Item headOlivine;

    public static Item chestOlivine;

    public static Item legsOlivine;

    public static Item bootsOlivine;

    public static Item headOpal;

    public static Item chestOpal;

    public static Item legsOpal;

    public static Item bootsOpal;

    public static Item headQuartz;

    public static Item chestQuartz;

    public static Item legsQuartz;

    public static Item bootsQuartz;

    public static Item headRuby;

    public static Item chestRuby;

    public static Item legsRuby;

    public static Item bootsRuby;

    public static Item headSapphire;

    public static Item chestSapphire;

    public static Item legsSapphire;

    public static Item bootsSapphire;

    public static Item headSQuartz;

    public static Item chestSQuartz;

    public static Item legsSQuartz;

    public static Item bootsSQuartz;

    public static Item headSun;

    public static Item chestSun;

    public static Item legsSun;

    public static Item bootsSun;

    public static Item headTopaz;

    public static Item chestTopaz;

    public static Item legsTopaz;

    public static Item bootsTopaz;

    public static Item headTurquoise;

    public static Item chestTurquoise;

    public static Item legsTurquoise;

    public static Item bootsTurquoise;

    public static Item headWAlabaster;

    public static Item chestWAlabaster;

    public static Item legsWAlabaster;

    public static Item bootsWAlabaster;

    /**
     * Creates all the Item Objects in the Mod.
     */
    public static void init() {
        LogHandler.finest(Dendritis.instance, "Loading Items");

        ModArmors.headAmethyst = new DummyArmor(Properties.headAmethystID, ArmorMaterials.armorAMETHYST, 0, 0).setUnlocalizedName("headAmethyst");
        ModArmors.chestAmethyst = new DummyArmor(Properties.chestAmethystID, ArmorMaterials.armorAMETHYST, 0, 1).setUnlocalizedName("chestAmethyst");
        ModArmors.legsAmethyst = new DummyArmor(Properties.legsAmethystID, ArmorMaterials.armorAMETHYST, 0, 2).setUnlocalizedName("legsAmethyst");
        ModArmors.bootsAmethyst = new DummyArmor(Properties.bootsAmethystID, ArmorMaterials.armorAMETHYST, 0, 3).setUnlocalizedName("bootsAmethyst");

        ModArmors.headBDiamond = new DummyArmor(Properties.headBDiamondID, ArmorMaterials.armorBDIAMOND, 0, 0).setUnlocalizedName("headBDiamond");
        ModArmors.chestBDiamond = new DummyArmor(Properties.chestBDiamondID, ArmorMaterials.armorBDIAMOND, 0, 1).setUnlocalizedName("chestBDiamond");
        ModArmors.legsBDiamond = new DummyArmor(Properties.legsBDiamondID, ArmorMaterials.armorBDIAMOND, 0, 2).setUnlocalizedName("legsBDiamond");
        ModArmors.bootsBDiamond = new DummyArmor(Properties.bootsBDiamondID, ArmorMaterials.armorBDIAMOND, 0, 3).setUnlocalizedName("bootsBDiamond");

        ModArmors.headCitrine = new DummyArmor(Properties.headCitrineID, ArmorMaterials.armorCITRINE, 0, 0).setUnlocalizedName("headCitrine");
        ModArmors.chestCitrine = new DummyArmor(Properties.chestCitrineID, ArmorMaterials.armorCITRINE, 0, 1).setUnlocalizedName("chestCitrine");
        ModArmors.legsCitrine = new DummyArmor(Properties.legsCitrineID, ArmorMaterials.armorCITRINE, 0, 2).setUnlocalizedName("legsCitrine");
        ModArmors.bootsCitrine = new DummyArmor(Properties.bootsCitrineID, ArmorMaterials.armorCITRINE, 0, 3).setUnlocalizedName("bootsCitrine");

        ModArmors.headCZirconia = new DummyArmor(Properties.headCZirconiaID, ArmorMaterials.armorCZIRCONIA, 0, 0).setUnlocalizedName("headCZirconia");
        ModArmors.chestCZirconia = new DummyArmor(Properties.chestCZirconiaID, ArmorMaterials.armorCZIRCONIA, 0, 1).setUnlocalizedName("chestCZirconia");
        ModArmors.legsCZirconia = new DummyArmor(Properties.legsCZirconiaID, ArmorMaterials.armorCZIRCONIA, 0, 2).setUnlocalizedName("legsCZirconia");
        ModArmors.bootsCZirconia = new DummyArmor(Properties.bootsCZirconiaID, ArmorMaterials.armorCZIRCONIA, 0, 3).setUnlocalizedName("bootsCZirconia");

        ModArmors.headEmerald = new DummyArmor(Properties.headEmeraldID, ArmorMaterials.armorEMERALD, 0, 0).setUnlocalizedName("headEmerald");
        ModArmors.chestEmerald = new DummyArmor(Properties.chestEmeraldID, ArmorMaterials.armorEMERALD, 0, 1).setUnlocalizedName("chestEmerald");
        ModArmors.legsEmerald = new DummyArmor(Properties.legsEmeraldID, ArmorMaterials.armorEMERALD, 0, 2).setUnlocalizedName("legsEmerald");
        ModArmors.bootsEmerald = new DummyArmor(Properties.bootsEmeraldID, ArmorMaterials.armorEMERALD, 0, 3).setUnlocalizedName("bootsEmerald");

        ModArmors.headFuchsia = new DummyArmor(Properties.headFuchsiaID, ArmorMaterials.armorFUCHSIA, 0, 0).setUnlocalizedName("headFuchsia");
        ModArmors.chestFuchsia = new DummyArmor(Properties.chestFuchsiaID, ArmorMaterials.armorFUCHSIA, 0, 1).setUnlocalizedName("chestFuchsia");
        ModArmors.legsFuchsia = new DummyArmor(Properties.legsFuchsiaID, ArmorMaterials.armorFUCHSIA, 0, 2).setUnlocalizedName("legsFuchsia");
        ModArmors.bootsFuchsia = new DummyArmor(Properties.bootsFuchsiaID, ArmorMaterials.armorFUCHSIA, 0, 3).setUnlocalizedName("bootsFuchsia");

        ModArmors.headJet = new DummyArmor(Properties.headJetID, ArmorMaterials.armorJET, 0, 0).setUnlocalizedName("headJet");
        ModArmors.chestJet = new DummyArmor(Properties.chestJetID, ArmorMaterials.armorJET, 0, 1).setUnlocalizedName("chestJet");
        ModArmors.legsJet = new DummyArmor(Properties.legsJetID, ArmorMaterials.armorJET, 0, 2).setUnlocalizedName("legsJet");
        ModArmors.bootsJet = new DummyArmor(Properties.bootsJetID, ArmorMaterials.armorJET, 0, 3).setUnlocalizedName("bootsJet");

        ModArmors.headOlivine = new DummyArmor(Properties.headOlivineID, ArmorMaterials.armorOLIVINE, 0, 0).setUnlocalizedName("headOlivine");
        ModArmors.chestOlivine = new DummyArmor(Properties.chestOlivineID, ArmorMaterials.armorOLIVINE, 0, 1).setUnlocalizedName("chestOlivine");
        ModArmors.legsOlivine = new DummyArmor(Properties.legsOlivineID, ArmorMaterials.armorOLIVINE, 0, 2).setUnlocalizedName("legsOlivine");
        ModArmors.bootsOlivine = new DummyArmor(Properties.bootsOlivineID, ArmorMaterials.armorOLIVINE, 0, 3).setUnlocalizedName("bootsOlivine");

        ModArmors.headOpal = new DummyArmor(Properties.headOpalID, ArmorMaterials.armorOPAL, 0, 0).setUnlocalizedName("headOpal");
        ModArmors.chestOpal = new DummyArmor(Properties.chestOpalID, ArmorMaterials.armorOPAL, 0, 1).setUnlocalizedName("chestOpal");
        ModArmors.legsOpal = new DummyArmor(Properties.legsOpalID, ArmorMaterials.armorOPAL, 0, 2).setUnlocalizedName("legsOpal");
        ModArmors.bootsOpal = new DummyArmor(Properties.bootsOpalID, ArmorMaterials.armorOPAL, 0, 3).setUnlocalizedName("bootsOpal");

        ModArmors.headQuartz = new DummyArmor(Properties.headQuartzID, ArmorMaterials.armorQUARTZ, 0, 0).setUnlocalizedName("headQuartz");
        ModArmors.chestQuartz = new DummyArmor(Properties.chestQuartzID, ArmorMaterials.armorQUARTZ, 0, 1).setUnlocalizedName("chestQuartz");
        ModArmors.legsQuartz = new DummyArmor(Properties.legsQuartzID, ArmorMaterials.armorQUARTZ, 0, 2).setUnlocalizedName("legsQuartz");
        ModArmors.bootsQuartz = new DummyArmor(Properties.bootsQuartzID, ArmorMaterials.armorQUARTZ, 0, 3).setUnlocalizedName("bootsQuartz");

        ModArmors.headRuby = new DummyArmor(Properties.headRubyID, ArmorMaterials.armorRUBY, 0, 0).setUnlocalizedName("headRuby");
        ModArmors.chestRuby = new DummyArmor(Properties.chestRubyID, ArmorMaterials.armorRUBY, 0, 1).setUnlocalizedName("chestRuby");
        ModArmors.legsRuby = new DummyArmor(Properties.legsRubyID, ArmorMaterials.armorRUBY, 0, 2).setUnlocalizedName("legsRuby");
        ModArmors.bootsRuby = new DummyArmor(Properties.bootsRubyID, ArmorMaterials.armorRUBY, 0, 3).setUnlocalizedName("bootsRuby");

        ModArmors.headSapphire = new DummyArmor(Properties.headSapphireID, ArmorMaterials.armorSAPPHIRE, 0, 0).setUnlocalizedName("headSapphire");
        ModArmors.chestSapphire = new DummyArmor(Properties.chestSapphireID, ArmorMaterials.armorSAPPHIRE, 0, 1).setUnlocalizedName("chestSapphire");
        ModArmors.legsSapphire = new DummyArmor(Properties.legsSapphireID, ArmorMaterials.armorSAPPHIRE, 0, 2).setUnlocalizedName("legsSapphire");
        ModArmors.bootsSapphire = new DummyArmor(Properties.bootsSapphireID, ArmorMaterials.armorSAPPHIRE, 0, 3).setUnlocalizedName("bootsSapphire");

        ModArmors.headSQuartz = new DummyArmor(Properties.headSQuartzID, ArmorMaterials.armorSQUARTZ, 0, 0).setUnlocalizedName("headSQuartz");
        ModArmors.chestSQuartz = new DummyArmor(Properties.chestSQuartzID, ArmorMaterials.armorSQUARTZ, 0, 1).setUnlocalizedName("chestSQuartz");
        ModArmors.legsSQuartz = new DummyArmor(Properties.legsSQuartzID, ArmorMaterials.armorSQUARTZ, 0, 2).setUnlocalizedName("legsSQuartz");
        ModArmors.bootsSQuartz = new DummyArmor(Properties.bootsSQuartzID, ArmorMaterials.armorSQUARTZ, 0, 3).setUnlocalizedName("bootsSQuartz");

        ModArmors.headSun = new DummyArmor(Properties.headSunID, ArmorMaterials.armorSUN, 0, 0).setUnlocalizedName("headSun");
        ModArmors.chestSun = new DummyArmor(Properties.chestSunID, ArmorMaterials.armorSUN, 0, 1).setUnlocalizedName("chestSun");
        ModArmors.legsSun = new DummyArmor(Properties.legsSunID, ArmorMaterials.armorSUN, 0, 2).setUnlocalizedName("legsSun");
        ModArmors.bootsSun = new DummyArmor(Properties.bootsSunID, ArmorMaterials.armorSUN, 0, 3).setUnlocalizedName("bootsSun");

        ModArmors.headTopaz = new DummyArmor(Properties.headTopazID, ArmorMaterials.armorTOPAZ, 0, 0).setUnlocalizedName("headTopaz");
        ModArmors.chestTopaz = new DummyArmor(Properties.chestTopazID, ArmorMaterials.armorTOPAZ, 0, 1).setUnlocalizedName("chestTopaz");
        ModArmors.legsTopaz = new DummyArmor(Properties.legsTopazID, ArmorMaterials.armorTOPAZ, 0, 2).setUnlocalizedName("legsTopaz");
        ModArmors.bootsTopaz = new DummyArmor(Properties.bootsTopazID, ArmorMaterials.armorTOPAZ, 0, 3).setUnlocalizedName("bootsTopaz");

        ModArmors.headTurquoise = new DummyArmor(Properties.headTurquoiseID, ArmorMaterials.armorTURQUOISE, 0, 0).setUnlocalizedName("headTurquoise");
        ModArmors.chestTurquoise = new DummyArmor(Properties.chestTurquoiseID, ArmorMaterials.armorTURQUOISE, 0, 1).setUnlocalizedName("chestTurquoise");
        ModArmors.legsTurquoise = new DummyArmor(Properties.legsTurquoiseID, ArmorMaterials.armorTURQUOISE, 0, 2).setUnlocalizedName("legsTurquoise");
        ModArmors.bootsTurquoise = new DummyArmor(Properties.bootsTurquoiseID, ArmorMaterials.armorTURQUOISE, 0, 3).setUnlocalizedName("bootsTurquoise");

        ModArmors.headWAlabaster = new DummyArmor(Properties.headWAlabasterID, ArmorMaterials.armorWALABASTER, 0, 0).setUnlocalizedName("headWAlabaster");
        ModArmors.chestWAlabaster = new DummyArmor(Properties.chestWAlabasterID, ArmorMaterials.armorWALABASTER, 0, 1).setUnlocalizedName("chestWAlabaster");
        ModArmors.legsWAlabaster = new DummyArmor(Properties.legsWAlabasterID, ArmorMaterials.armorWALABASTER, 0, 2).setUnlocalizedName("legsWAlabaster");
        ModArmors.bootsWAlabaster = new DummyArmor(Properties.bootsWAlabasterID, ArmorMaterials.armorWALABASTER, 0, 3).setUnlocalizedName("bootsWAlabaster");
    }
}