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
    
    /*
     * ***********************************************
     * Blocks IDs ***********************************************
     */

    public static int oreID;

    public static int blocksID;

    /*
     * ***************************************************
     * World Generation Stuff
     * ***************************************************
     */

    // Copper
    public static boolean enableWorldGenCopper;
    public static int copMaxHeight;
    public static int copMinHeight;
    public static int copSize;
    public static int copDensity;

    public static int getItemID() {
        return itemID;
    }

    public static int getBlockID() {
        return blockID;
    }
}