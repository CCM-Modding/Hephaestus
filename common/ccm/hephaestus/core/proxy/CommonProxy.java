package ccm.hephaestus.core.proxy;

import net.minecraftforge.common.ForgeDirection;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.inventory.container.ContainerBlast;
import ccm.hephaestus.inventory.container.ContainerGrinder;
import ccm.hephaestus.utils.lib.TileConstants;
import ccm.nucleum.handler.GUIHandler;

public class CommonProxy {

    public void registerGUIs() {

        GUIHandler.registerGuiServer(Hephaestus.instance, TileConstants.BLAST_GUID,
                ContainerBlast.class);
        GUIHandler.registerGuiServer(Hephaestus.instance, TileConstants.GRINDER_GUID,
                ContainerGrinder.class);
    }

    public void handleTileEntityPacket(final int x, final int y, final int z,
            final ForgeDirection orientation, final short state, final String player,
            final String customName) {
    }
}