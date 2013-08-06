package ccm.dendritis.core.proxy;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.client.FMLClientHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerGUIs() {
        // GUIHandler.registerGuiClient(Harvestry.instance,
        // TileConstants.GRINDER_GUID,
        // GUIGrinder.class, GrinderContainer.class);
    }

    @Override
    public void handleTileEntityPacket(final int x, final int y, final int z, final ForgeDirection orientation, final short state, final String owner, final String customName) {
        final TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getBlockTileEntity(x, y, z);
        if (tileEntity != null) {
            /*
             * if (tileEntity instanceof TileBase){ ((TileBase)
             * tileEntity).setOrientation(orientation); ((TileBase)
             * tileEntity).setState(state); ((TileBase)
             * tileEntity).setOwner(owner); ((TileBase)
             * tileEntity).setCustomName(customName); }
             */
        }
    }
}