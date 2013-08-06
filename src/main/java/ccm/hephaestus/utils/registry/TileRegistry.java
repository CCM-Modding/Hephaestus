package ccm.hephaestus.utils.registry;

import net.minecraft.tileentity.TileEntity;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.tileentity.TileBlast;
import ccm.hephaestus.tileentity.TileGrinder;
import ccm.hephaestus.utils.lib.TileConstants;
import ccm.nucleum_omnium.handler.LogHandler;
import cpw.mods.fml.common.registry.GameRegistry;

final class TileRegistry {

    /**
     * Registers all the {@link TileEntity}s.
     */
    protected static void registerTileEntities() {
        LogHandler.finest(Hephaestus.instance, "Registering Tile Entities");
        GameRegistry.registerTileEntity(TileGrinder.class, "te." + TileConstants.GRINDER_UNLOCALIZED);
        GameRegistry.registerTileEntity(TileBlast.class, "te." + TileConstants.BLAST_UNLOCALIZED);
    }
}