package ccm.dendritis.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.MinecraftForge;
import ccm.dendritis.enums.blocks.EnumBlocksD;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModStrgBlocks extends BaseBlock {

    private static EnumBlocksD[] blocks = EnumBlocksD.values();

    /**
     * Creates a new Block instance capable of being a Block
     * 
     * @param id
     *            Block Id
     */
    public ModStrgBlocks(final int id) {
        super(id, Material.iron);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(Block.soundMetalFootstep);

        // Sets the required harvest level and tool
        // 0 is wood
        // 1 is stone
        // 2 is iron
        // 3 is diamond

        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockAmethyst.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockBDiamond.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockCitrine.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockCZirconia.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockFuchsia.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockJet.ordinal(), "pickaxe", 4);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockOlivine.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockOpal.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockRuby.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockSapphire.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockSQuartz.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockSun.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockTopaz.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockTurquoise.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocksD.blockWAlabaster.ordinal(), "pickaxe", 4);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(final int side, final int meta) {
        this.blockIcon = ModStrgBlocks.blocks[meta].getIcon();
        return this.blockIcon;
    }

    // Makes sure pick block works right
    @Override
    public int damageDropped(final int metadata) {
        return metadata;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister) {
        EnumBlocksD.registerIcons(iconRegister);
    }

    @Override
    public void getSubBlocks(final int itemId, final CreativeTabs tab, final List list) {
        for (int i = 0; i < EnumBlocksD.values().length; i++) {
            list.add(new ItemStack(itemId, 1, i));
        }
    }
}