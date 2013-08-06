package ccm.dendritis.core.recipe;

import java.util.Arrays;
import java.util.List;

public final class RecipeHandler {

    private static List<String> toDelete = Arrays.asList(new String[] {});

    /**
     * Initializes all the methods that handle Recipes.
     */
    public static void init() {
        RecipesRemover.delete(RecipeHandler.toDelete);
        new RecipesCrafting();
        new RecipesCraftingTools();
        new RecipesCraftingArmor();
        new RecipesCraftingBlocks();
        new RecipesSmelting();
    }
}