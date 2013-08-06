package ccm.dendritis.core.recipe;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.dendritis.enums.blocks.EnumBlocks;
import ccm.dendritis.enums.items.EnumGems;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesCraftingBlocks {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    private static void addShaped() {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockAmethyst), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemAmethyst) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockBDiamond), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemBDiamond) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockCitrine), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemCitrine) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockCZirconia), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemCZirconia) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockFuchsia), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemFuchsia) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockJet), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemJet) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockOlivine), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemOlivine) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockOpal), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemOpal) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockRuby), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemRuby) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockSapphire), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemSapphire) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockSQuartz), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemSQuartz) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockSun), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemSun) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockTopaz), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemTopaz) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockTurquoise), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemTurquoise) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockWAlabaster), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGems.gemWAlabaster) }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    private static void addShapeless() {

        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemAmethyst, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockAmethyst)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemBDiamond, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockBDiamond)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemCitrine, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockCitrine)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemCZirconia, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockCZirconia)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemFuchsia, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockFuchsia)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemJet, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockJet)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemOlivine, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockOlivine)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemOpal, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockOpal)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemRuby, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockRuby)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemSapphire, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockSapphire)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemSQuartz, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockSQuartz)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemSun, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockSun)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemTopaz, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockTopaz)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemTurquoise, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockTurquoise)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGems.gemWAlabaster, 9), EnumToItemStack.getBlockIS(EnumBlocks.blockWAlabaster)));
    }

    public RecipesCraftingBlocks() {
        RecipesCraftingBlocks.addShaped();
        RecipesCraftingBlocks.addShapeless();
    }
}
