package ccm.hephaestus.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.core.handlers.EHandler;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;

final class RecipesCrafting {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped() {

        // needs proper recipe
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGrinder), new Object[] { "xxx", "x x", "xxx", 'x', EHandler.getItem(EnumIngots.ingotSteel) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBlast), new Object[] { "xxx", "x x", "xxx", 'x', Block.brick }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShapeless() {

        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumDusts.dustBronze, 4), EHandler.getItem(EnumDusts.dustCopper), EHandler.getItem(EnumDusts.dustCopper), EHandler.getItem(EnumDusts.dustCopper), EHandler.getItem(EnumDusts.dustTin)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumDusts.dustHardIron, 5), EHandler.getItem(EnumDusts.dustIron), EHandler.getItem(EnumDusts.dustIron), EHandler.getItem(EnumDusts.dustIron), EHandler.getItem(EnumDusts.dustLead), EHandler.getItem(EnumDusts.dustLead)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumDusts.dustTitanite, 5), EHandler.getItem(EnumDusts.dustTitanium), EHandler.getItem(EnumDusts.dustTitanium), EHandler.getItem(EnumDusts.dustTitanium), EHandler.getItem(EnumDusts.dustAluminum), EHandler.getItem(EnumDusts.dustAluminum)));
    }

    public static void init() {
        addShaped();
        addShapeless();
    }
}
