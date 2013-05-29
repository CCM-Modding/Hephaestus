package ccm.hephaestus.block;

import net.minecraft.block.Block;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

public final class ModBlocks {

    public static Block tiles;

    public static Block ores;

    public static Block blocks;

    /**
     * Creates all the Block Objects in the Mod.
     */
    public static void init() {
        Handler.log(Hephaestus.instance, "Loading Blocks");

        ores = new ModOres(Properties.oreID);
        blocks = new ModStrgBlocks(Properties.blocksID);

    }
}