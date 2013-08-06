package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.utils.lib.Locations;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.block.sub.SubBlock;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

public enum EnumOresM implements IBlockEnum {
    // Make sure to keep this lower than 16 AT ALL TIMES
    oreAluminum(3),
    oreCopper(2),
    oreLead(3),
    oreSilver(3),
    oreTin(2),
    oreTitanium(4),
    oreTungsten(4);

    private EnumOresM() {
        this(1);
    }

    private EnumOresM(final float hardness) {
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