package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.utils.lib.Locations;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.block.sub.SubBlock;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

public enum EnumOresG implements IBlockEnum {
    // Make sure to keep this lower than 16 AT ALL TIMES
    oreCitrine(4),
    oreCZirconia(3),
    oreJet(4),
    oreOlivine(3),
    oreOpal(4),
    oreRuby(3),
    oreSapphire(3),
    oreSun(3),
    oreTopaz(3),
    oreWAlabaster(4);

    private EnumOresG() {
        this(1);
    }

    private EnumOresG(final float hardness) {
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