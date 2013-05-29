package ccm.hephaestus.core.handlers;

import net.minecraft.item.ItemStack;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.enums.EnumBlocks;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumHandle;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.hephaestus.item.ModItems;

public final class EHandler {
    /**
     * @param enumBaseItem
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumHandle enumHandle) {
        return new ItemStack(ModItems.itemHandle, 1, enumHandle.ordinal());
    }

    /**
     * @param enumBaseItem
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumHandle enumHandle, final int amount) {
        return new ItemStack(ModItems.itemHandle, amount, enumHandle.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumIngots enumIngots) {
        return new ItemStack(ModItems.itemIngot, 1, enumIngots.ordinal());
    }

    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumIngots enumIngots, final int amount) {
        return new ItemStack(ModItems.itemIngot, amount, enumIngots.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumDusts enumDusts) {
        return new ItemStack(ModItems.itemDust, 1, enumDusts.ordinal());
    }

    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumDusts enumDusts, final int amount) {
        return new ItemStack(ModItems.itemDust, amount, enumDusts.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumOres enumOres) {
        return new ItemStack(ModBlocks.ores, 1, enumOres.ordinal());
    }

    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumOres enumOres, final int amount) {
        return new ItemStack(ModBlocks.ores, amount, enumOres.ordinal());
    }

    /**
     * @param enumNonStack
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumBlocks enumBlocks) {
        return new ItemStack(ModBlocks.blocks, 1, enumBlocks.ordinal());
    }

    /**
     * @param enumNonStack
     * @param amount
     * @return new ItemStack
     */
    public static ItemStack getItem(final EnumBlocks enumBlocks, final int amount) {
        return new ItemStack(ModBlocks.blocks, amount, enumBlocks.ordinal());
    }
}