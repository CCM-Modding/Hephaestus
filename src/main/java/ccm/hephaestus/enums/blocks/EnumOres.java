package ccm.hephaestus.enums.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.handler.TextureHandler;
import ccm.nucleum_omnium.helper.enums.IBlockEnum;

public enum EnumOres implements IBlockEnum {

    oreAluminum,
    oreCopper,
    oreLead,
    oreSilver,
    oreSulfur,
    oreTin,
    oreTitanium,
    oreTungsten;

    private Icon icon;

    public final String texture;

    public static void registerIcons(final IconRegister register) {
        for (final EnumOres ore : EnumOres.values()) {
            ore.icon = register.registerIcon(ore.texture);
        }
    }

    private EnumOres() {
        this.texture = TextureHandler.getTextureFromName(this.name(), Locations.TEXTURE + "ore/");
    }

    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Block getBaseBlock() {
        return ModBlocks.ores;
    }

    @Override
    public void setBaseBlock(final Block base) {
        // TODO Auto-generated method stub

    }
}