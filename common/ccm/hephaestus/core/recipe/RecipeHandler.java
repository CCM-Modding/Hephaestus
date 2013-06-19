package ccm.hephaestus.core.recipe;

import java.util.Arrays;
import java.util.List;

public final class RecipeHandler {
    
    private static List<String> toDelete = Arrays.asList(new String[] {});
    
    /**
     * Initializes all the methods that handle Recipes.
     */
    public static void init() {
        RecipesRemover.delete(RecipeHandler.toDelete);
        new RecipesSetGrinder();
        new RecipesSetBlast();
        new RecipesCrafting();
        new RecipesCraftingArmor();
        new RecipesCraftingBlocks();
        new RecipesCraftingTools();
        new RecipesSmelting();
    }
}