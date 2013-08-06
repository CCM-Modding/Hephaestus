package ccm.dendritis.core.recipe;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.dendritis.enums.blocks.EnumBlocksD;
import ccm.dendritis.enums.items.EnumGemsD;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class RecipesCraftingBlocks {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    private static void addShaped() {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockAmethyst), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemAmethyst) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockBDiamond), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemBDiamond) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockCitrine), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemCitrine) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockCZirconia), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemCZirconia) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockFuchsia), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemFuchsia) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockJet), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemJet) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockOlivine), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemOlivine) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockOpal), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemOpal) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockRuby), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemRuby) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockSapphire), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemSapphire) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockSQuartz), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemSQuartz) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockSun), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemSun) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockTopaz), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemTopaz) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockTurquoise), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemTurquoise) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockWAlabaster), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGemsD.gemWAlabaster) }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    private static void addShapeless() {

        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemAmethyst, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockAmethyst)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemBDiamond, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockBDiamond)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemCitrine, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockCitrine)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemCZirconia, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockCZirconia)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemFuchsia, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockFuchsia)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemJet, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockJet)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemOlivine, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockOlivine)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemOpal, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockOpal)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemRuby, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockRuby)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemSapphire, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockSapphire)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemSQuartz, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockSQuartz)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemSun, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockSun)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemTopaz, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockTopaz)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemTurquoise, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockTurquoise)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGemsD.gemWAlabaster, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockWAlabaster)));
    }

    public RecipesCraftingBlocks() {
        RecipesCraftingBlocks.addShaped();
        RecipesCraftingBlocks.addShapeless();
    }
}
