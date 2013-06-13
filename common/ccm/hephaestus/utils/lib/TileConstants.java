package ccm.hephaestus.utils.lib;

public final class TileConstants {

    /*
     * ******************************** Base Stuff
     * **********************************
     */
    public static final String CONTAINER           = "container.";

    public static final String INVENTORY           = TileConstants.CONTAINER + "inventory";

    /*
     * ******************************* Grinder Stuff
     * *********************************
     */
    public static final String GRINDER_GUID        = "oregrinder";

    public static final String GRINDER_UNLOCALIZED = TileConstants.CONTAINER
                                                           + TileConstants.GRINDER_GUID;

    public static final String GRINDER_GUI         = Locations.GUI + "guiGrinder.png";

    /*
     * ****************************** Grinder Stuff
     * ********************************
     */
    public static final String BLAST_GUID          = "blast";

    public static final String BLAST_UNLOCALIZED   = TileConstants.CONTAINER
                                                           + TileConstants.BLAST_GUID;

    public static final String BLAST_GUI           = Locations.GUI + "guiBlast.png";

    /*
     * ********************************* NBT Stuff
     * *********************************
     */
    public static final String NBT_TE_Direction    = "direction";

    public static final String NBT_TE_State        = "state";

    public static final String NBT_TE_Custom_Name  = "name";

    public static final String NBT_TE_Owner        = "owner";
}