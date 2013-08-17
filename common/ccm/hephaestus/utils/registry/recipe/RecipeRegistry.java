package ccm.hephaestus.utils.registry.recipe;

import ccm.nucleum.omnium.api.fuels.IFuelRegistry;
import ccm.nucleum.omnium.api.recipes.IRecipeContainer;

/**
 * RecipeRegistry.java
 * 
 * @author Captain_Shadows
 */
abstract class RecipeRegistry {

    protected IFuelRegistry fuels;
    protected IRecipeContainer recipes;

    public void register() {
        this.registerFuels();
        this.registerRecipes();
    }

    abstract void registerFuels();

    abstract void registerRecipes();
}