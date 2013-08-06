package ccm.hephaestus.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.MinecraftForge;
import ccm.hephaestus.enums.blocks.EnumBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModStrgBlocks extends BaseBlock {

    private static EnumBlocks[] blocks = EnumBlocks.values();

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

        MinecraftForge.setBlockHarvestLevel(this, EnumBlocks.blockAluminum.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocks.blockCopper.ordinal(), "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocks.blockLead.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocks.blockSilver.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocks.blockSulfur.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocks.blockTin.ordinal(), "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocks.blockTitanium.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumBlocks.blockTungsten.ordinal(), "pickaxe", 3);
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
        EnumBlocks.registerIcons(iconRegister);
    }

    @Override
    public void getSubBlocks(final int itemId, final CreativeTabs tab, final List list) {
        for (int i = 0; i < EnumBlocks.values().length; i++) {
            list.add(new ItemStack(itemId, 1, i));
        }
    }
}