package ccm.hephaestus.enums;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.utils.lib.Locations;
import ccm.nucleum_omnium.helper.TextureHelper;
import ccm.nucleum_omnium.helper.enums.IItemEnum;

public enum EnumHandle implements IItemEnum {
    
    handleWood,
    handleBronze,
    handleHardIron,
    handleIron,
    handleSteel,
    handleTitanium;
    
    public static void registerIcons(final IconRegister register) {
        for (final EnumHandle handle : EnumHandle.values()) {
            handle.icon = register.registerIcon(handle.texture);
        }
    }
    
    private Icon        icon;
    
    public final String texture;
    
    private EnumHandle() {
        texture = TextureHelper.getTextureFromName(name(), Locations.TEXTURE);
    }
    
    @Override
    public Icon getIcon() {
        return icon;
    }
    
    @Override
    public Item getBaseItem() {
        return ModItems.itemHandle;
    }
}