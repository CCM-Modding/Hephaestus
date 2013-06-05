package ccm.hephaestus.block;

import net.minecraft.block.Block;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.machines.BlockBlast;
import ccm.hephaestus.block.machines.BlockGrinder;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;

public final class ModBlocks {

    public static Block tiles;

    public static Block ores;

    public static Block blocks;

    public static Block blockGrinder;
    public static Block blockGrinderRunning;

    public static Block blockBlast;
    public static Block blockBlastRunning;

    /**
     * Creates all the Block Objects in the Mod.
     */
    public static void init() {
        Handler.log(Hephaestus.instance, "Loading Blocks");

        ores = new ModOres(Properties.oreID);
        blocks = new ModStrgBlocks(Properties.blocksID);

        blockGrinder = new BlockGrinder(Properties.blockGrinderID, false).setUnlocalizedName("blockGrinder").setHardness(3.0F);
        blockGrinderRunning = new BlockGrinder(Properties.blockGrinderRunningID, true).setUnlocalizedName("blockGrinder").setHardness(3.0F);

        blockBlast = new BlockBlast(Properties.blockBlastID, false).setUnlocalizedName("blockBlast").setHardness(3.0F);
        blockBlastRunning = new BlockBlast(Properties.blockBlastRunningID, true).setUnlocalizedName("blockBlast").setHardness(3.0F).setLightValue(0.875F);

    }
}