package ccm.hephaestus.utils.registry;

import java.util.Arrays;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.enums.EnumMachines;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.utils.lib.Locations;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.block.sub.SubBlock;
import ccm.nucleum_omnium.block.texture.ActiveTexture;
import ccm.nucleum_omnium.block.tile.TileLogic;
import ccm.nucleum_omnium.utils.handler.LogHandler;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.handler.TileHandler;
import ccm.nucleum_omnium.utils.lib.BlockFacings;

final class BlockRegistry {

    protected static void registerBlocks() {
        LogHandler.finest(Hephaestus.instance, "Making Sub Blocks");

        registerCustomBlocks();

        registerCustomRenderBlocks();
    }

    static void registerCustomBlocks() {
        LogHandler.finest(Hephaestus.instance, "Making Sub Blocks, Stage 2");

        final String texture = TextureHandler.getTextureFromName(EnumMachines.machineGrinder, Locations.TEXTURE + "machine/");
        SubBlock.setUp(EnumMachines.machineGrinder, new SubBlock(Properties.machineBlockID, EnumMachines.machineGrinder.ordinal(), new ActiveTexture(texture, BlockFacings.Sides, Arrays.asList(BlockFacings.Bottom, BlockFacings.Top, BlockFacings.Sides)), new TileLogic()).setTileEntity(TileHandler.getEnumTE(EnumMachines.machineGrinder)).setCreativeTab(HephaestusTabs.tabHephaestusBlocks).setUnlocalizedName(EnumMachines.machineGrinder).setHardness(3.0F));

    }

    static void registerCustomRenderBlocks() {
        LogHandler.finest(Hephaestus.instance, "Making Sub Blocks, Stage 3");

    }
}