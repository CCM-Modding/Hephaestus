package ccm.hephaestus.core.proxy;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.client.inventory.gui.GUIBlast;
import ccm.hephaestus.client.inventory.gui.GUIGrinder;
import ccm.hephaestus.inventory.container.ContainerBlast;
import ccm.hephaestus.inventory.container.ContainerGrinder;
import ccm.hephaestus.tileentity.logic.BaseLogic;
import ccm.hephaestus.utils.lib.TileConstants;
import ccm.nucleum_omnium.utils.handler.GUIHandler;
import cpw.mods.fml.client.FMLClientHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerGUIs() {

        GUIHandler.registerGuiClient(Hephaestus.instance, TileConstants.BLAST_GUID, GUIBlast.class, ContainerBlast.class);
        GUIHandler.registerGuiClient(Hephaestus.instance, TileConstants.GRINDER_GUID, GUIGrinder.class, ContainerGrinder.class);
    }

    @Override
    public void handleTileEntityPacket(final int x, final int y, final int z, final ForgeDirection orientation, final short state, final String owner, final String customName) {
        final TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getBlockTileEntity(x, y, z);
        if (tileEntity != null) {
            if (tileEntity instanceof BaseLogic) {
                ((BaseLogic) tileEntity).setOrientation(orientation);
                ((BaseLogic) tileEntity).setState(state);
                ((BaseLogic) tileEntity).setOwner(owner);
                ((BaseLogic) tileEntity).setCustomName(customName);
            }
        }
    }
}