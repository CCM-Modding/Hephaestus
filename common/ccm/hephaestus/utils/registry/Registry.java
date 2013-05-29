package ccm.hephaestus.utils.registry;

import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.core.recipe.RecipeHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public final class Registry {

    /**
     * Registers everything that needs to be Registered.
     */
    public static void register() {
        // Registers the GUI Handler
        NetworkRegistry.instance().registerGuiHandler(Hephaestus.instance, Hephaestus.proxy);
        OreDictionaryRegistry.oreDictionary();
        TileRegistry.registerTileEntities();
        BlockRegistry.registerBlocks();
        WorldRegistry.registerWorld();
        RecipeHandler.init();
    }
}