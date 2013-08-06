package ccm.hephaestus.utils.registry;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.item.itemblock.ItemBlockBlock;
import ccm.hephaestus.item.itemblock.ItemBlockOre;
import ccm.nucleum_omnium.utils.handler.LogHandler;
import cpw.mods.fml.common.registry.GameRegistry;

final class BlockRegistry {

    /**
     * Registers all the Blocks.
     */
    protected static void registerBlocks() {
        LogHandler.finest(Hephaestus.instance, "Registering Blocks");
        GameRegistry.registerBlock(ModBlocks.ores, ItemBlockOre.class, "ORES");
        GameRegistry.registerBlock(ModBlocks.blocks, ItemBlockBlock.class, "BLOCKS");

        GameRegistry.registerBlock(ModBlocks.blockGrinder, "blockGrinder");
        GameRegistry.registerBlock(ModBlocks.blockBlast, "blockBlast");
    }
}