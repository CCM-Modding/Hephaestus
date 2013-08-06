package ccm.hephaestus.block.machines;

import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.tileentity.TileBlast;
import ccm.hephaestus.utils.lib.Locations;
import ccm.hephaestus.utils.lib.Properties;
import ccm.hephaestus.utils.lib.TileConstants;
import ccm.nucleum_omnium.handler.GUIHandler;
import ccm.nucleum_omnium.handler.TextureHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBlast extends BaseContainerBlock {

    public static void updateBlockState(final boolean working, final World world, final int x, final int y, final int z) {
        final int blockID = world.getBlockMetadata(x, y, z);
        final TileEntity tileentity = world.getBlockTileEntity(x, y, z);
        BaseContainerBlock.keepInventory = true;
        if (working) {
            world.setBlock(x, y, z, ModBlocks.blockBlastRunning.blockID);
        } else {
            world.setBlock(x, y, z, ModBlocks.blockBlast.blockID);
        }
        BaseContainerBlock.keepInventory = false;
        world.setBlockMetadataWithNotify(x, y, z, blockID, 3);
        world.markBlockForRenderUpdate(x, y, z);
        if (tileentity != null) {
            tileentity.validate();
            world.setBlockTileEntity(x, y, z, tileentity);
        }
    }

    /**
     * @param id
     */
    public BlockBlast(final int id, final boolean active) {
        super(id, active);
    }

    @Override
    public TileEntity createNewTileEntity(final World world) {
        return new TileBlast();
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture.
     * Args: side, metadata
     */
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(final int side, final int metadata) {
        if (side == ForgeDirection.UP.ordinal()) {
            return this.topIcon;
        } else if (side == ForgeDirection.DOWN.ordinal()) {
            return this.bottomIcon;
        } else {
            return this.blockIcon;
        }
    }

    @Override
    public ItemStack getPickBlock(final MovingObjectPosition target, final World world, final int x, final int y, final int z) {
        return new ItemStack(Properties.blockBlastID, 1, 0);
    }

    @Override
    public int idDropped(final int meta, final Random random, final int fortune) {
        return Properties.blockBlastID;
    }

    @Override
    public boolean onBlockActivated(final World world, final int x, final int y, final int z, final EntityPlayer player, final int wut, final float clickX, final float clickY, final float clockZ) {
        super.onBlockActivated(world, x, y, z, player, wut, clockZ, clockZ, clockZ);
        final TileBlast grinder = (TileBlast) world.getBlockTileEntity(x, y, z);
        if (grinder != null) {
            GUIHandler.openGui(Hephaestus.instance, TileConstants.BLAST_GUID, player, world, x, y, z);
            return true;
        } else {
            return false;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister) {
        this.topIcon = iconRegister.registerIcon(TextureHandler.getTextureFromName(getUnlocalizedName() + "Top", Locations.TEXTURE + "machine/"));
        this.bottomIcon = iconRegister.registerIcon(TextureHandler.getTextureFromName(getUnlocalizedName() + "Bottom", Locations.TEXTURE + "machine/"));
        this.blockIcon = iconRegister.registerIcon(this.isActive ? TextureHandler.getTextureFromName(getUnlocalizedName() + "SideOn", Locations.TEXTURE + "machine/") : TextureHandler.getTextureFromName(getUnlocalizedName() + "SideOff", Locations.TEXTURE + "machine/"));
    }
}