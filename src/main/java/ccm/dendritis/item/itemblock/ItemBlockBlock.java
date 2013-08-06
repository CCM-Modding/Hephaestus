package ccm.dendritis.item.itemblock;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import ccm.dendritis.enums.EnumBlocks;

public class ItemBlockBlock extends ItemBlock {

    private static EnumBlocks[] blocks = EnumBlocks.values();

    public ItemBlockBlock(final int par1) {
        super(par1);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack) {
        this.setUnlocalizedName(ItemBlockBlock.blocks[itemStack.getItemDamage()].name());
        return super.getUnlocalizedName();
    }

    @Override
    public int getMetadata(final int i) {
        return i;
    }
}