package ccm.hephaestus.item.itemblock;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.enums.blocks.EnumBlocksH;

public class ItemBlockBlock extends ItemBlock {

    private static EnumBlocksH[] blocks = EnumBlocksH.values();

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