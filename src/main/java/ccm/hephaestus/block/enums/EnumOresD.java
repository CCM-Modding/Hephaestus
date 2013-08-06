package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.utils.lib.Locations;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.block.sub.SubBlock;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

public enum EnumOresD implements IBlockEnum {
    // Make sure to keep this lower than 16 AT ALL TIMES
    oreSulfur(3);

    private EnumOresD() {
        this(1);
    }

    private EnumOresD(final float hardness) {
        SubBlock.createAndSetUp(this, Properties.stgBlockID, Locations.TEXTURE).setCreativeTab(HephaestusTabs.tabHephaestusBlocks).setHardness(hardness);
    }

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