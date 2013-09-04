package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;

import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.utils.lib.Locations;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum.omnium.block.sub.SubBlock;
import ccm.nucleum.omnium.utils.helper.enums.IBlockEnum;

public enum EnumBlocksA implements IBlockEnum
{
    // Make sure to keep this lower than 16 AT ALL TIMES
    blockSoldarium(3), blockElectrum(3), blockBronze(3), blockSteel(3), blockTitanite(4);

    private EnumBlocksA()
    {
        this(1);
    }

    private EnumBlocksA(final float hardness)
    {
        SubBlock.createAndSetUp(this, Properties.stgBlockID, Locations.TEXTURE).setCreativeTab(HephaestusTabs.tabHephaestusBlocks).setHardness(hardness);
    }

    private static Block mainBlock;

    @Override
    public void setBaseBlock(final Block base)
    {
        mainBlock = base;
    }

    @Override
    public Block getBaseBlock()
    {
        return mainBlock;
    }
}