package ccm.hephaestus.block;

import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import ccm.hephaestus.creativetab.HephaestusTabs;

/**
 * TODO Implement in the new system
 */
public class BaseSlab extends BlockHalfSlab
{

    public BaseSlab(final int id, final boolean par2, final Material material)
    {
        super(id, par2, material);
        setCreativeTab(HephaestusTabs.tabHephaestusBlocks);
    }

    public BaseSlab(final int id, final boolean par2)
    {
        super(id, par2, Material.ground);
        setCreativeTab(HephaestusTabs.tabHephaestusBlocks);
    }

    /**
     * Registers the Icon for the Block
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister)
    {
        // blockIcon = iconRegister.registerIcon(Locations.TEXTURE +
        // getUnlocalizedName2());
    }

    @Override
    public String getFullSlabName(final int i)
    {
        // TODO Auto-generated method stub
        return null;
    }

}
