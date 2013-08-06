package ccm.dendritis.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import ccm.dendritis.creativetab.DendritisTabs;
import ccm.dendritis.utils.lib.Locations;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseBlock extends Block {

    /**
     * Creates a new Block Instance.
     * 
     * @param id
     *            The Block ID
     */
    public BaseBlock(final int id) {
        super(id, Material.ground);
        this.setCreativeTab(DendritisTabs.tabDendritisBlocks);
    }

    /**
     * Creates a new Block Instance.
     * 
     * @param id
     *            The Block ID
     * @param material
     *            The Material
     */
    public BaseBlock(final int id, final Material material) {
        super(id, material);
        this.setCreativeTab(DendritisTabs.tabDendritisBlocks);
    }

    /**
     * Registers the Icon for the Block
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Locations.TEXTURE + getUnlocalizedName());
    }
}