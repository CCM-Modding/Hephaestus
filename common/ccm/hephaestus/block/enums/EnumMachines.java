package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;

import ccm.nucleum.omnium.utils.helper.enums.IBlockEnum;

public enum EnumMachines implements IBlockEnum
{
    // Make sure to keep this lower than 16 AT ALL TIMES
    nul;

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