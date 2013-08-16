package ccm.hephaestus.api.recipes;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.ItemStack;
import ccm.nucleum.omnium.api.recipes.IRecipeContainer;
import ccm.nucleum.omnium.api.recipes.Recipe;

// needs ore dictionary
public final class GrinderRecipes implements IRecipeContainer {

    /** The list of grinding results. */
    private final Set<Recipe> recipes;

    private static final GrinderRecipes INSTANCE = new GrinderRecipes();

    private GrinderRecipes() {
        this.recipes = new HashSet<Recipe>();
    }

    /**
     * Used to call methods addGrinding and getGrindingResult.
     */
    public static final GrinderRecipes instance() {
        return INSTANCE;
    }

    @Override
    public void addRecipe(final Recipe recipe) {
        this.recipes.add(recipe);
    }

    @Override
    public void addRecipe(final ItemStack input, final ItemStack output) {
        this.recipes.add(new Recipe(input, output));
    }

    @Override
    public void addRecipe(final ItemStack input, final ItemStack output, final ItemStack output2) {
        this.recipes.add(new Recipe(input, output, output2));
    }

    @Override
    public Recipe getResult(final ItemStack item) {
        for (final Recipe r : this.recipes) {
            if (r.isInput(item)) {
                return r;
            }
        }
        return null;
    }

    @Override
    public Set<Recipe> getRecipes() {
        return this.recipes;
    }
}