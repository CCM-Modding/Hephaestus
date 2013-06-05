package ccm.hephaestus.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

import cpw.mods.fml.client.FMLClientHandler;

import ccm.hephaestus.client.inventory.gui.GUIBlast;
import ccm.hephaestus.client.inventory.gui.GUIGrinder;
import ccm.hephaestus.tileentity.TileBase;
import ccm.hephaestus.tileentity.TileBlast;
import ccm.hephaestus.tileentity.TileGrinder;
import ccm.hephaestus.utils.lib.TileConstants;

public class ClientProxy extends CommonProxy
{

    @Override
    public void handleTileEntityPacket(final int x, final int y, final int z, final ForgeDirection orientation, final short state, final String owner, final String customName)
    {
        final TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getBlockTileEntity(x, y, z);
        if (tileEntity != null){
            if (tileEntity instanceof TileBase){
                ((TileBase) tileEntity).setOrientation(orientation);
                ((TileBase) tileEntity).setState(state);
                ((TileBase) tileEntity).setOwner(owner);
                ((TileBase) tileEntity).setCustomName(customName);
            }
        }
    }

    @Override
    public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z)
    {
        switch (ID) {
            case TileConstants.GRINDER_GUID:
                final TileGrinder grinder = (TileGrinder) world.getBlockTileEntity(x, y, z);
                return new GUIGrinder(player.inventory, grinder);
            case TileConstants.BLAST_GUID:
                final TileBlast blast = (TileBlast) world.getBlockTileEntity(x, y, z);
                return new GUIBlast(player.inventory, blast);
            default:
                return null;
        }
    }
}