package ccm.dendritis.block;

import net.minecraft.block.Block;
import ccm.dendritis.Dendritis;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.utils.handler.LogHandler;

public final class ModBlocks {

    public static Block tiles;

    public static Block ores;

    public static Block blocks;

    /**
     * Creates all the Block Objects in the Mod.
     */
    public static void init() {
        LogHandler.finest(Dendritis.instance, "Loading Blocks");

        ModBlocks.ores = new ModOres(Properties.oreDID);
        ModBlocks.blocks = new ModStrgBlocks(Properties.blocksDID);

    }
}