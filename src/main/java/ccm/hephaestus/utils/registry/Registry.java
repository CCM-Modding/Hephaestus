package ccm.hephaestus.utils.registry;

import ccm.hephaestus.core.recipe.RecipeHandler;

public final class Registry {

    /**
     * Registers everything that needs to be Registered.
     */
    public static void register() {

        BlockRegistry.registerBlocks();

        OreDictionaryRegistry.oreDictionary();

        WorldRegistry.registerWorld();

        RecipeHandler.init();
    }
}