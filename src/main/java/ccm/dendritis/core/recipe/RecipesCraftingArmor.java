package ccm.dendritis.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import ccm.dendritis.item.ModArmors;

final class RecipesCraftingArmor {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    private static void addShaped() {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headAmethyst), new Object[] { "xxx", "x x", 'x', "gemAmethyst" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestAmethyst), new Object[] { "x x", "xxx", "xxx", 'x', "gemAmethyst" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsAmethyst), new Object[] { "xxx", "x x", "x x", 'x', "gemAmethyst" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsAmethyst), new Object[] { "x x", "x x", 'x', "gemAmethyst" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headBDiamond), new Object[] { "xxx", "x x", 'x', "gemBDiamond" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestBDiamond), new Object[] { "x x", "xxx", "xxx", 'x', "gemBDiamond" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsBDiamond), new Object[] { "xxx", "x x", "x x", 'x', "gemBDiamond" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsBDiamond), new Object[] { "x x", "x x", 'x', "gemBDiamond" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headCitrine), new Object[] { "xxx", "x x", 'x', "gemCitrine" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestCitrine), new Object[] { "x x", "xxx", "xxx", 'x', "gemCitrine" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsCitrine), new Object[] { "xxx", "x x", "x x", 'x', "gemCitrine" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsCitrine), new Object[] { "x x", "x x", 'x', "gemCitrine" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headCZirconia), new Object[] { "xxx", "x x", 'x', "gemCZirconia" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestCZirconia), new Object[] { "x x", "xxx", "xxx", 'x', "gemCZirconia" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsCZirconia), new Object[] { "xxx", "x x", "x x", 'x', "gemCZirconia" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsCZirconia), new Object[] { "x x", "x x", 'x', "gemCZirconia" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headEmerald), new Object[] { "xxx", "x x", 'x', Item.emerald }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestEmerald), new Object[] { "x x", "xxx", "xxx", 'x', Item.emerald }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsEmerald), new Object[] { "xxx", "x x", "x x", 'x', Item.emerald }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsEmerald), new Object[] { "x x", "x x", 'x', Item.emerald }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headFuchsia), new Object[] { "xxx", "x x", 'x', "gemFuchsia" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestFuchsia), new Object[] { "x x", "xxx", "xxx", 'x', "gemFuchsia" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsFuchsia), new Object[] { "xxx", "x x", "x x", 'x', "gemFuchsia" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsFuchsia), new Object[] { "x x", "x x", 'x', "gemFuchsia" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headJet), new Object[] { "xxx", "x x", 'x', "gemJet" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestJet), new Object[] { "x x", "xxx", "xxx", 'x', "gemJet" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsJet), new Object[] { "xxx", "x x", "x x", 'x', "gemJet" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsJet), new Object[] { "x x", "x x", 'x', "gemJet" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headOlivine), new Object[] { "xxx", "x x", 'x', "gemOlivine" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestOlivine), new Object[] { "x x", "xxx", "xxx", 'x', "gemOlivine" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsOlivine), new Object[] { "xxx", "x x", "x x", 'x', "gemOlivine" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsOlivine), new Object[] { "x x", "x x", 'x', "gemOlivine" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headOpal), new Object[] { "xxx", "x x", 'x', "gemOpal" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestOpal), new Object[] { "x x", "xxx", "xxx", 'x', "gemOpal" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsOpal), new Object[] { "xxx", "x x", "x x", 'x', "gemOpal" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsOpal), new Object[] { "x x", "x x", 'x', "gemOpal" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headQuartz), new Object[] { "xxx", "x x", 'x', Item.netherQuartz }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestQuartz), new Object[] { "x x", "xxx", "xxx", 'x', Item.netherQuartz }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsQuartz), new Object[] { "xxx", "x x", "x x", 'x', Item.netherQuartz }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsQuartz), new Object[] { "x x", "x x", 'x', Item.netherQuartz }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headRuby), new Object[] { "xxx", "x x", 'x', "gemRuby" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestRuby), new Object[] { "x x", "xxx", "xxx", 'x', "gemRuby" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsRuby), new Object[] { "xxx", "x x", "x x", 'x', "gemRuby" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsRuby), new Object[] { "x x", "x x", 'x', "gemRuby" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headSapphire), new Object[] { "xxx", "x x", 'x', "gemSapphire" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestSapphire), new Object[] { "x x", "xxx", "xxx", 'x', "gemSapphire" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsSapphire), new Object[] { "xxx", "x x", "x x", 'x', "gemSapphire" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsSapphire), new Object[] { "x x", "x x", 'x', "gemSapphire" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headSQuartz), new Object[] { "xxx", "x x", 'x', "gemSQuartz" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestSQuartz), new Object[] { "x x", "xxx", "xxx", 'x', "gemSQuartz" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsSQuartz), new Object[] { "xxx", "x x", "x x", 'x', "gemSQuartz" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsSQuartz), new Object[] { "x x", "x x", 'x', "gemSQuartz" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headSun), new Object[] { "xxx", "x x", 'x', "gemSun" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestSun), new Object[] { "x x", "xxx", "xxx", 'x', "gemSun" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsSun), new Object[] { "xxx", "x x", "x x", 'x', "gemSun" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsSun), new Object[] { "x x", "x x", 'x', "gemSun" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headTopaz), new Object[] { "xxx", "x x", 'x', "gemTopaz" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestTopaz), new Object[] { "x x", "xxx", "xxx", 'x', "gemTopaz" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsTopaz), new Object[] { "xxx", "x x", "x x", 'x', "gemTopaz" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsTopaz), new Object[] { "x x", "x x", 'x', "gemTopaz" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headTurquoise), new Object[] { "xxx", "x x", 'x', "gemTurquoise" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestTurquoise), new Object[] { "x x", "xxx", "xxx", 'x', "gemTurquoise" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsTurquoise), new Object[] { "xxx", "x x", "x x", 'x', "gemTurquoise" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsTurquoise), new Object[] { "x x", "x x", 'x', "gemTurquoise" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.headWAlabaster), new Object[] { "xxx", "x x", 'x', "gemWAlabaster" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.chestWAlabaster), new Object[] { "x x", "xxx", "xxx", 'x', "gemWAlabaster" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.legsWAlabaster), new Object[] { "xxx", "x x", "x x", 'x', "gemWAlabaster" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModArmors.bootsWAlabaster), new Object[] { "x x", "x x", 'x', "gemWAlabaster" }));
    }

    public RecipesCraftingArmor() {
        RecipesCraftingArmor.addShaped();
    }
}
