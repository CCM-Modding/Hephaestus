package ccm.dendritis.core.proxy;

import net.minecraftforge.common.ForgeDirection;

public class CommonProxy {

    public void registerGUIs() {

        // GUIHandler.registerGuiServer(Dendritis.instance,
        // TileConstants.GRINDER_GUID,
        // GrinderContainer.class);
    }

    public void handleTileEntityPacket(final int x, final int y, final int z, final ForgeDirection orientation, final short state, final String player, final String customName) {}
}