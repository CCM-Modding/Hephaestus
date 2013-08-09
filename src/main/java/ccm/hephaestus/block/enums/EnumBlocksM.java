package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.utils.lib.Locations;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.block.sub.SubBlock;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

public enum EnumBlocksM implements IBlockEnum {
    // Make sure to keep this lower than 16 AT ALL TIMES
    blockTin(2),
    blockAluminum(3),
    blockSilver(3),
    blockCopper(2),
    blockTitanium(4),
    blockSulfur(3),
    blockDarkObsidian(3),
    blockGravitas(3),
    blockChildarium(2),
    blockCitrine(3),
    blockCZirconia(3),
    blockOlivine(3),
    blockRuby(3),
    blockSapphire(3),
    blockTopaz(3);


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