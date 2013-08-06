package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

public enum EnumBlocksG implements IBlockEnum {
    // Make sure to keep this lower than 16 AT ALL TIMES
    blockCitrine,
    blockCZirconia,
    blockJet,
    blockOlivine,
    blockOpal,
    blockRuby,
    blockSapphire,
    blockSun,
    blockTopaz,
    blockWAlabaster;

    private static Block mainBlock;

    @Override
    public void setBaseBlock(final Block base) {
        mainBlock = base;
    }

    @Override
    public Block getBaseBlock() {
        return mainBlock;
    }
}