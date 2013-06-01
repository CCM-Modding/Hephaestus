package ccm.hephaestus.api.recipes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class RecipesGrinder {

    // needs ore dictionary
    private static final RecipesGrinder grindingBase = new RecipesGrinder();

    /**
     * Used to call methods addGrinding and getGrindingResult.
     */
    public static final RecipesGrinder grinding() {
        return grindingBase;
    }

    /** The list of grinding results. */
    private final HashSet<Recipes> recipes = new HashSet<Recipes>();

    private RecipesGrinder() {}

    /**
     * Adds a Grinding recipe. It natively supports meta data. And passing Items
     * as the first parameter :D
     */
    public void addGrinding(final Item input, final ItemStack output) {
        final ItemStack in = new ItemStack(input);
        this.recipes.add(new Recipes(in, output));
    }

    /**
     * Adds a Grinding recipe. It natively supports meta data.
     */
    public void addGrinding(final ItemStack input, final ItemStack output) {
        this.recipes.add(new Recipes(input, output));
    }

    public Set<Recipes> getGrindingList() {
        return this.recipes;
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * 
     * @param item
     *            The Source ItemStack
     * @return The result ItemStack
     */
    public Recipes getGrindingResult(final ItemStack item) {
        for (final Recipes r : this.recipes) {
            if (r.isInput(item)) {
                return r;
            }
        }
        return null;
    }
}