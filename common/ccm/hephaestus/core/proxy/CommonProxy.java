package ccm.hephaestus.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import ccm.hephaestus.inventory.container.ContainerGrinder;
import ccm.hephaestus.tileentity.TileGrinder;
import ccm.hephaestus.utils.lib.TileConstants;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler {

    @Override
    public Object getServerGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        switch (ID) {
            case TileConstants.GRINDER_GUID:
                final TileGrinder grinder = (TileGrinder) world.getBlockTileEntity(x, y, z);
                return new ContainerGrinder(player.inventory, grinder);
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        return null;
    }

    public void handleTileEntityPacket(final int x, final int y, final int z, final ForgeDirection orientation, final short state, final String player, final String customName) {}
}