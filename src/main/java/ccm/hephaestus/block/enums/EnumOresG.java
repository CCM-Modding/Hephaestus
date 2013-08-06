package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

public enum EnumOresG implements IBlockEnum {
    // Make sure to keep this lower than 16 AT ALL TIMES
    oreCitrine,
    oreCZirconia,
    oreJet,
    oreOlivine,
    oreOpal,
    oreRuby,
    oreSapphire,
    oreSun,
    oreTopaz,
    oreWAlabaster;

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