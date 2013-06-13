package ccm.hephaestus.api.recipes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class RecipesBlast {

    // needs ore dictionary
    private static final RecipesBlast smeltingBase = new RecipesBlast();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static final RecipesBlast smelting() {
        return RecipesBlast.smeltingBase;
    }

    /** The list of smelting results. */
    private final HashSet<Recipes> recipes = new HashSet<Recipes>();

    private RecipesBlast() {
    }

    /**
     * Adds a Smelting recipe. It natively supports meta data. And passing Items
     * as the first parameter :D
     */
    public void addSmelting(final Item input, final ItemStack output) {
        final ItemStack in = new ItemStack(input);
        this.recipes.add(new Recipes(in, output));
    }

    /**
     * Adds a Grinding recipe. It natively supports meta data.
     */
    public void addSmelting(final ItemStack input, final ItemStack output) {
        this.recipes.add(new Recipes(input, output));
    }

    public Set<Recipes> getSmeltingList() {
        return this.recipes;
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * 
     * @param item
     *            The Source ItemStack
     * @return The result ItemStack
     */
    public Recipes getSmeltingResult(final ItemStack item) {
        for (final Recipes r : this.recipes)
            if (r.isInput(item))
                return r;
        return null;
    }
}