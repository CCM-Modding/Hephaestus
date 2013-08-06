package ccm.hephaestus.api.fuels;

import java.util.HashSet;

import net.minecraft.item.ItemStack;

public class FuelsBlast {

    /**
     * Blast Fuels
     */
    private static HashSet<ItemStack> coalList = new HashSet<ItemStack>();

    private static HashSet<ItemStack> sulfurList = new HashSet<ItemStack>();

    /**
     * Checks if a item is a Coal fuel.
     * 
     * @param stack
     *            The stack to check if it is a Coal fuel.
     * @return true if it is found in the Coal List.
     */
    public static boolean isCoalFuel(final ItemStack stack) {
        for (final ItemStack i : FuelsBlast.coalList) {
            if (i.itemID == stack.itemID) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a item is a Sulfur fuel.
     * 
     * @param stack
     *            The stack to check if it is a Sulfur fuel.
     * @return true if it is found in the Sulfur List.
     */
    public static boolean isSulfurFuel(final ItemStack stack) {
        for (final ItemStack i : FuelsBlast.sulfurList) {
            if (i.itemID == stack.itemID) {
                return true;
            }
        }
        return false;
    }

    /**
     * Registers a new Coal fuel.
     * 
     * @param stack
     *            The Coal fuel to add.
     */
    public static void registerCoalFuel(final ItemStack stack) {
        FuelsBlast.coalList.add(stack);
    }

    /**
     * Registers a new Sulfur fuel.
     * 
     * @param stack
     *            The Sulfur fuel to add.
     */
    public static void registerSulfurFuel(final ItemStack stack) {
        FuelsBlast.sulfurList.add(stack);
    }

    /**
     * Gets the burn time of a Coal fuel.
     * 
     * @return
     */
    public static int getCoalValue(final ItemStack stack) {
        return 1600;
    }

    /**
     * Gets the burn time of a Sulfur fuel.
     * 
     * @return
     */
    public static int getSulfurValue(final ItemStack stack) {
        return 3000;
    }
}
