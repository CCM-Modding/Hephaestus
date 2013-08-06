package ccm.dendritis.utils.registry;

import ccm.dendritis.Dendritis;
import ccm.dendritis.core.recipe.RecipeHandler;
import ccm.nucleum_omnium.handler.GUIHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public final class Registry {

    /**
     * Registers everything that needs to be Registered.
     */
    public static void register() {
        // Registers the GUI Handler
        NetworkRegistry.instance().registerGuiHandler(Dendritis.instance, GUIHandler.instance());

        OreDictionaryRegistry.oreDictionary();
        BlockRegistry.registerBlocks();
        WorldRegistry.registerWorld();
        RecipeHandler.init();
    }
}