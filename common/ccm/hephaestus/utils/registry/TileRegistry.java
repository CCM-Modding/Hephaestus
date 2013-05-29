package ccm.hephaestus.utils.registry;

import net.minecraft.tileentity.TileEntity;
import ccm.hephaestus.Hephaestus;
import ccm.nucleum_omnium.handler.Handler;

final class TileRegistry {

    /**
     * Registers all the {@link TileEntity}s.
     */
    protected static void registerTileEntities() {
        Handler.log(Hephaestus.instance, "Registering Tile Entities");
    }
}