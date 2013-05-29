package ccm.hephaestus.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import ccm.hephaestus.tileentity.TileBase;
import cpw.mods.fml.client.FMLClientHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void handleTileEntityPacket(final int x, final int y, final int z, final ForgeDirection orientation, final short state, final String owner, final String customName) {
        final TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getBlockTileEntity(x, y, z);
        if (tileEntity != null) {
            if (tileEntity instanceof TileBase) {
                ((TileBase) tileEntity).setOrientation(orientation);
                ((TileBase) tileEntity).setState(state);
                ((TileBase) tileEntity).setOwner(owner);
                ((TileBase) tileEntity).setCustomName(customName);
            }
        }
    }

    @Override
    public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        switch (ID) {
            default:
                return null;
        }
    }
}