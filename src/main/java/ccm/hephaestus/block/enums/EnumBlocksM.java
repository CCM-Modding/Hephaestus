package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.utils.lib.Locations;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.block.sub.SubBlock;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

public enum EnumBlocksM implements IBlockEnum {
    // Make sure to keep this lower than 16 AT ALL TIMES
    blockAluminum(3),
    blockBronze(3),
    blockCopper(2),
    blockHardIron(3),
    blockHeavyIron(3),
    blockLead(3),
    blockSilver(3),
    blockSteel(3),
    blockTin(2),
    blockTitanite(4),
    blockTitanium(4),
    blockTitCarbide(4),
    blockTunCarbide(4),
    blockTungsten(4);

    private EnumBlocksM() {
        this(1);
    }

    private EnumBlocksM(final float hardness) {
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