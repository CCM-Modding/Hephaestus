package ccm.hephaestus.item.itemblock;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.block.enums.EnumOresD;

public class ItemBlockOreD extends ItemBlock {

    private static EnumOresD[] ores = EnumOresD.values();

    public ItemBlockOreD(final int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack) {
        this.setUnlocalizedName(ItemBlockOreD.ores[itemStack.getItemDamage()].name());
        return super.getUnlocalizedName();
    }

    @Override
    public int getMetadata(final int meta) {
        return meta;
    }
}