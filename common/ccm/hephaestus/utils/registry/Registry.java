package ccm.hephaestus.utils.registry;

import cpw.mods.fml.common.network.NetworkRegistry;


import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.core.recipe.RecipeHandler;
import ccm.nucleum.handler.GUIHandler;

public final class Registry
{

    /**
     * Registers everything that needs to be Registered.
     */
    public static void register()
    {
        // Registers the GUI Handler
        NetworkRegistry.instance().registerGuiHandler(Hephaestus.instance, GUIHandler.instance());

        OreDictionaryRegistry.oreDictionary();
        TileRegistry.registerTileEntities();
        BlockRegistry.registerBlocks();
        WorldRegistry.registerWorld();
        RecipeHandler.init();
    }
}