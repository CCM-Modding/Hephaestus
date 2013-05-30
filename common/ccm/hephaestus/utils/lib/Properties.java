package ccm.hephaestus.utils.lib;

public class Properties {

    /*
     * ***********************************************
     * Defaluts ***********************************************
     */
    private static int itemID = 10000;

    private static int blockID = 1000;

    /*
     * ***********************************************
     * Item IDs ***********************************************
     */
    public static int itemHandleID;

    public static int itemIngotID;

    public static int itemDustID;

    public static int gsStoneID;
    public static int gsIronID;
    public static int gsBronzeID;
    public static int gsObsidianID;
    public static int gsDiamondID;

    /*
     * ***********************************************
     * Blocks IDs ***********************************************
     */

    public static int oreID;

    public static int blocksID;

    public static int blockGrinderID;
    public static int blockGrinderRunningID;

    /*
     * ***************************************************
     * World Generation Stuff
     * ***************************************************
     */

    // Aluminum
    public static boolean enableWorldGenAluminum;
    public static int aluMaxHeight;
    public static int aluMinHeight;
    public static int aluSize;
    public static int aluDensity;

    // Copper
    public static boolean enableWorldGenCopper;
    public static int copMaxHeight;
    public static int copMinHeight;
    public static int copSize;
    public static int copDensity;

    // Lead
    public static boolean enableWorldGenLead;
    public static int leadMaxHeight;
    public static int leadMinHeight;
    public static int leadSize;
    public static int leadDensity;

    // Silver
    public static boolean enableWorldGenSilver;
    public static int silMaxHeight;
    public static int silMinHeight;
    public static int silSize;
    public static int silDensity;

    // Sulfur
    public static boolean enableWorldGenSulfur;
    public static int sulMaxHeight;
    public static int sulMinHeight;
    public static int sulSize;
    public static int sulDensity;

    // Tin
    public static boolean enableWorldGenTin;
    public static int tinMaxHeight;
    public static int tinMinHeight;
    public static int tinSize;
    public static int tinDensity;

    // Titanium
    public static boolean enableWorldGenTitanium;
    public static int titMaxHeight;
    public static int titMinHeight;
    public static int titSize;
    public static int titDensity;

    // Tungsten
    public static boolean enableWorldGenTungsten;
    public static int tunMaxHeight;
    public static int tunMinHeight;
    public static int tunSize;
    public static int tunDensity;

    public static int getItemID() {
        return itemID;
    }

    public static int getBlockID() {
        return blockID;
    }
}