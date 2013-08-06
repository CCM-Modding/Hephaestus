package ccm.hephaestus.item.itemblock;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.block.enums.EnumOresM;

public class ItemBlockOreM extends ItemBlock {

    private static EnumOresM[] ores = EnumOresM.values();

    public ItemBlockOreM(final int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack) {
        this.setUnlocalizedName(ItemBlockOreM.ores[itemStack.getItemDamage()].name());
        return super.getUnlocalizedName();
    }

    @Override
    public int getMetadata(final int meta) {
        return meta;
    }
}