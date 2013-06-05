package ccm.hephaestus.utils.registry;

import cpw.mods.fml.common.registry.GameRegistry;

import ccm.nucleum_omnium.handler.Handler;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.item.itemblock.ItemBlockBlock;
import ccm.hephaestus.item.itemblock.ItemBlockOre;

final class BlockRegistry
{

    /**
     * Registers all the Blocks.
     */
    protected static void registerBlocks()
    {
        Handler.log(Hephaestus.instance, "Registering Blocks");
        GameRegistry.registerBlock(ModBlocks.ores, ItemBlockOre.class, "ORES");
        GameRegistry.registerBlock(ModBlocks.blocks, ItemBlockBlock.class, "BLOCKS");

        GameRegistry.registerBlock(ModBlocks.blockGrinder, "blockGrinder");
        GameRegistry.registerBlock(ModBlocks.blockBlast, "blockBlast");
    }
}