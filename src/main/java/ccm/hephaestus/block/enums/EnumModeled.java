package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;
import ccm.hephaestus.Hephaestus;
import ccm.nucleum_omnium.client.model.AdvancedBaseModel;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.helper.enums.IBlockEnum;

/**
 * EnumModeled
 * <p>
 * 
 * @author Captain_Shadows
 */
public enum EnumModeled implements IBlockEnum {
    machineGrinder;

    private final AdvancedBaseModel model;

    /**
     * Adds their Textures and Models
     */
    private EnumModeled() {
        TextureHandler.addModel(Hephaestus.instance, this);
        TextureHandler.addModelTexture(Hephaestus.instance, this);
        this.model = new AdvancedBaseModel(this);
    }

    public AdvancedBaseModel getModel() {
        return this.model;
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
