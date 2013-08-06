package ccm.hephaestus.item.itemblock;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.block.enums.EnumOresG;

public class ItemBlockOreG extends ItemBlock {

    private static EnumOresG[] ores = EnumOresG.values();

    public ItemBlockOreG(final int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack) {
        this.setUnlocalizedName(ItemBlockOreG.ores[itemStack.getItemDamage()].name());
        return super.getUnlocalizedName();
    }

    @Override
    public int getMetadata(final int meta) {
        return meta;
    }
}