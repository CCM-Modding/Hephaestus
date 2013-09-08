package ccm.hephaestus.api.recipes;

import ccm.nucleum.omnium.api.recipes.IRecipeContainer;

// needs ore dictionary
public final class GrinderRecipes extends IRecipeContainer
{
    private static final GrinderRecipes INSTANCE = new GrinderRecipes();

    private GrinderRecipes()
    {}

    /**
     * Used to call methods addGrinding and getGrindingResult.
     */
    public static final GrinderRecipes instance()
    {
        return INSTANCE;
    }
}