package ccm.hephaestus.enums;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;
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
        this.texture = TextureHelper.getTextureFromName(this.name(), Locations.TEXTURE + "ore/");
    }

    @Override
    public Icon getIcon() {
        return this.icon;
    }

    @Override
    public Block getBaseBlock() {
        return ModBlocks.ores;
    }
}