package ccm.dendritis.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.MinecraftForge;
import ccm.dendritis.enums.blocks.EnumOresD;
import ccm.hephaestus.utils.lib.Properties;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModOres extends BaseBlock {

    private static EnumOresD[] ores = EnumOresD.values();

    /**
     * Creates a new Block instance capable of being a Ore
     * 
     * @param id
     *            Block Id
     */
    public ModOres(final int id) {
        super(id, Material.rock);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(Block.soundStoneFootstep);

        // Sets the required harvest level and tool
        // 0 is wood
        // 1 is stone
        // 2 is iron
        // 3 is diamond

        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreAmethyst.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreBDiamond.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreCitrine.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreCZirconia.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreFuchsia.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreJet.ordinal(), "pickaxe", 4);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreOlivine.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreOpal.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreRuby.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreSapphire.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreSQuartz.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreSun.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreTopaz.ordinal(), "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreTurquoise.ordinal(), "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(this, EnumOresD.oreWAlabaster.ordinal(), "pickaxe", 4);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(final int side, final int meta) {
        this.blockIcon = ModOres.ores[meta].getIcon();
        return this.blockIcon;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public int idDropped(final int par1, final Random par2Random, final int par3) {
        return Properties.itemGemsID;
    }

    // Makes sure pick block works right
    @Override
    public int damageDropped(final int metadata) {
        return metadata;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IconRegister iconRegister) {
        EnumOresD.registerIcons(iconRegister);
    }

    @Override
    public void getSubBlocks(final int itemId, final CreativeTabs tab, final List list) {
        for (int i = 0; i < EnumOresD.values().length; i++) {
            list.add(new ItemStack(itemId, 1, i));
        }
    }
}