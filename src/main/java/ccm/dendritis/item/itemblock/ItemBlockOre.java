package ccm.dendritis.item.itemblock;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import ccm.dendritis.enums.blocks.EnumOresD;

public class ItemBlockOre extends ItemBlock {

    private static EnumOresD[] ores = EnumOresD.values();

    public ItemBlockOre(final int par1) {
        super(par1);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack) {
        this.setUnlocalizedName(ItemBlockOre.ores[itemStack.getItemDamage()].name());
        return super.getUnlocalizedName();
    }

    @Override
    public int getMetadata(final int i) {
        return i;
    }
}