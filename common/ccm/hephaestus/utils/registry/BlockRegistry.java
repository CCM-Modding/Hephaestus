package ccm.hephaestus.utils.registry;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.item.itemblock.ItemBlockBlock;
import ccm.hephaestus.item.itemblock.ItemBlockOre;
import ccm.hephaestus.utils.lib.BlockNames;
import ccm.nucleum_omnium.handler.Handler;
import cpw.mods.fml.common.registry.GameRegistry;

final class BlockRegistry {

    /**
     * Registers all the Blocks.
     */
    protected static void registerBlocks() {
        Handler.log(Hephaestus.instance, "Registering Blocks");
        GameRegistry.registerBlock(ModBlocks.ores, ItemBlockOre.class, "ORES");
        GameRegistry.registerBlock(ModBlocks.blocks, ItemBlockBlock.class, "BLOCKS");

        GameRegistry.registerBlock(ModBlocks.blockGrinder, BlockNames.blockGrinder);
        GameRegistry.registerBlock(ModBlocks.blockBlast, BlockNames.blockBlast);
    }
}