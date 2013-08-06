package ccm.hephaestus.enums.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.handler.TextureHandler;
import ccm.nucleum_omnium.helper.enums.IBlockEnum;

public enum EnumBlocks implements IBlockEnum {

    blockAluminum,
    blockBronze,
    blockCopper,
    blockHardIron,
    blockHeavyIron,
    blockLead,
    blockSilver,
    blockSteel,
    blockSulfur,
    blockTin,
    blockTitanite,
    blockTitanium,
    blockTitCarbide,
    blockTunCarbide,
    blockTungsten;

    private Icon icon;

    public final String texture;

    public static void registerIcons(final IconRegister register) {
        for (final EnumBlocks block : EnumBlocks.values()) {
            block.icon = register.registerIcon(block.texture);
        }
    }

    private EnumBlocks() {
        this.texture = TextureHandler.getTextureFromName(this.name(), Locations.TEXTURE + "block/");
    }

    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Block getBaseBlock() {
        return ModBlocks.blocks;
    }

    @Override
    public void setBaseBlock(final Block base) {
        // TODO Auto-generated method stub

    }
}