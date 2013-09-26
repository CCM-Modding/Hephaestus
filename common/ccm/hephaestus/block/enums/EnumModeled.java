package ccm.hephaestus.block.enums;

import net.minecraft.block.Block;

import ccm.hephaestus.Hephaestus;
import ccm.nucleum.omnium.client.model.SimpleModel;
import ccm.nucleum.omnium.utils.handler.ResourceHandler;
import ccm.nucleum.omnium.utils.helper.enums.IBlockEnum;

/**
 * EnumModeled
 * <p>
 * 
 * @author Captain_Shadows
 */
public enum EnumModeled implements IBlockEnum
{
    machineGrinder;

    private final SimpleModel model;

    /**
     * Adds their Textures and Models
     */
    private EnumModeled()
    {
        ResourceHandler.addModel(Hephaestus.instance, name());
        model = new SimpleModel(name());
    }

    public SimpleModel getModel()
    {
        return model;
    }

    private static Block mainBlock;

    @Override
    public void setBaseBlock(final Block base)
    {
        mainBlock = base;
    }

    @Override
    public Block getBaseBlock()
    {
        return mainBlock;
    }
}
