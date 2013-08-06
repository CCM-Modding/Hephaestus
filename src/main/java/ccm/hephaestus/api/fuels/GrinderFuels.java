package ccm.hephaestus.api.fuels;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.ItemStack;
import ccm.nucleum_omnium.api.fuels.IFuelRegistry;
import ccm.nucleum_omnium.utils.helper.ItemHelper;

public final class GrinderFuels implements IFuelRegistry {

    /**
     * Grinder Fuels
     */
    private final Set<ItemStack> fuels;

    private static final GrinderFuels INSTANCE = new GrinderFuels();

    private GrinderFuels() {
        this.fuels = new HashSet<ItemStack>();
    }

    public static GrinderFuels instance() {
        return INSTANCE;
    }

    /**
     * Registers a new Fuel
     * 
     * @param stack
     *            The Fuel to add.
     */
    @Override
    public void registerFuel(final ItemStack stack) {
        this.fuels.add(stack);
    }

    /**
     * @param stack
     *            The stack to check if it is a Fuel
     * @return true if it is found in the Fuel List.
     */
    @Override
    public boolean isFuel(final ItemStack stack) {
        for (final ItemStack i : this.fuels) {
            if (ItemHelper.equals(i, stack)) {
                return true;
            }
        }
        return false;
    }
}