package ccm.dendritis.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import ccm.dendritis.item.ModTools;

final class RecipesCraftingTools {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    private static void addShaped() {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeAmethyst), new Object[] { "xx", "xy", " y", 'x', "gemAmethyst", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeAmethyst), new Object[] { "xx", " y", " y", 'x', "gemAmethyst", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeAmethyst), new Object[] { "x", "y", "y", 'x', "gemAmethyst", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickAmethyst), new Object[] { "xxx", " y ", " y ", 'x', "gemAmethyst", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordAmethyst), new Object[] { "x", "x", "y", 'x', "gemAmethyst", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeBDiamond), new Object[] { "xx", "xy", " y", 'x', "gemBDiamond", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeBDiamond), new Object[] { "xx", " y", " y", 'x', "gemBDiamond", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeBDiamond), new Object[] { "x", "y", "y", 'x', "gemBDiamond", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickBDiamond), new Object[] { "xxx", " y ", " y ", 'x', "gemBDiamond", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordBDiamond), new Object[] { "x", "x", "y", 'x', "gemBDiamond", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeCitrine), new Object[] { "xx", "xy", " y", 'x', "gemCitrine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeCitrine), new Object[] { "xx", " y", " y", 'x', "gemCitrine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeCitrine), new Object[] { "x", "y", "y", 'x', "gemCitrine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickCitrine), new Object[] { "xxx", " y ", " y ", 'x', "gemCitrine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordCitrine), new Object[] { "x", "x", "y", 'x', "gemCitrine", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeCZirconia), new Object[] { "xx", "xy", " y", 'x', "gemCZirconia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeCZirconia), new Object[] { "xx", " y", " y", 'x', "gemCZirconia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeCZirconia), new Object[] { "x", "y", "y", 'x', "gemCZirconia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickCZirconia), new Object[] { "xxx", " y ", " y ", 'x', "gemCZirconia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordCZirconia), new Object[] { "x", "x", "y", 'x', "gemCZirconia", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeEmerald), new Object[] { "xx", "xy", " y", 'x', Item.emerald, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeEmerald), new Object[] { "xx", " y", " y", 'x', Item.emerald, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeEmerald), new Object[] { "x", "y", "y", 'x', Item.emerald, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickEmerald), new Object[] { "xxx", " y ", " y ", 'x', Item.emerald, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordEmerald), new Object[] { "x", "x", "y", 'x', Item.emerald, 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeFuchsia), new Object[] { "xx", "xy", " y", 'x', "gemFuchsia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeFuchsia), new Object[] { "xx", " y", " y", 'x', "gemFuchsia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeFuchsia), new Object[] { "x", "y", "y", 'x', "gemFuchsia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickFuchsia), new Object[] { "xxx", " y ", " y ", 'x', "gemFuchsia", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordFuchsia), new Object[] { "x", "x", "y", 'x', "gemFuchsia", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeJet), new Object[] { "xx", "xy", " y", 'x', "gemJet", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeJet), new Object[] { "xx", " y", " y", 'x', "gemJet", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeJet), new Object[] { "x", "y", "y", 'x', "gemJet", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickJet), new Object[] { "xxx", " y ", " y ", 'x', "gemJet", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordJet), new Object[] { "x", "x", "y", 'x', "gemJet", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeOlivine), new Object[] { "xx", "xy", " y", 'x', "gemOlivine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeOlivine), new Object[] { "xx", " y", " y", 'x', "gemOlivine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeOlivine), new Object[] { "x", "y", "y", 'x', "gemOlivine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickOlivine), new Object[] { "xxx", " y ", " y ", 'x', "gemOlivine", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordOlivine), new Object[] { "x", "x", "y", 'x', "gemOlivine", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeOpal), new Object[] { "xx", "xy", " y", 'x', "gemOpal", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeOpal), new Object[] { "xx", " y", " y", 'x', "gemOpal", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeOpal), new Object[] { "x", "y", "y", 'x', "gemOpal", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickOpal), new Object[] { "xxx", " y ", " y ", 'x', "gemOpal", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordOpal), new Object[] { "x", "x", "y", 'x', "gemOpal", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeQuartz), new Object[] { "xx", "xy", " y", 'x', Item.netherQuartz, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeQuartz), new Object[] { "xx", " y", " y", 'x', Item.netherQuartz, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeQuartz), new Object[] { "x", "y", "y", 'x', Item.netherQuartz, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickQuartz), new Object[] { "xxx", " y ", " y ", 'x', Item.netherQuartz, 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordQuartz), new Object[] { "x", "x", "y", 'x', Item.netherQuartz, 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeRuby), new Object[] { "xx", "xy", " y", 'x', "gemRuby", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeRuby), new Object[] { "xx", " y", " y", 'x', "gemRuby", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeRuby), new Object[] { "x", "y", "y", 'x', "gemRuby", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickRuby), new Object[] { "xxx", " y ", " y ", 'x', "gemRuby", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordRuby), new Object[] { "x", "x", "y", 'x', "gemRuby", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeSapphire), new Object[] { "xx", "xy", " y", 'x', "gemSapphire", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeSapphire), new Object[] { "xx", " y", " y", 'x', "gemSapphire", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeSapphire), new Object[] { "x", "y", "y", 'x', "gemSapphire", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickSapphire), new Object[] { "xxx", " y ", " y ", 'x', "gemSapphire", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordSapphire), new Object[] { "x", "x", "y", 'x', "gemSapphire", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeSQuartz), new Object[] { "xx", "xy", " y", 'x', "gemSQuartz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeSQuartz), new Object[] { "xx", " y", " y", 'x', "gemSQuartz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeSQuartz), new Object[] { "x", "y", "y", 'x', "gemSQuartz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickSQuartz), new Object[] { "xxx", " y ", " y ", 'x', "gemSQuartz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordSQuartz), new Object[] { "x", "x", "y", 'x', "gemSQuartz", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeSun), new Object[] { "xx", "xy", " y", 'x', "gemSun", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeSun), new Object[] { "xx", " y", " y", 'x', "gemSun", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeSun), new Object[] { "x", "y", "y", 'x', "gemSun", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickSun), new Object[] { "xxx", " y ", " y ", 'x', "gemSun", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordSun), new Object[] { "x", "x", "y", 'x', "gemSun", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeTopaz), new Object[] { "xx", "xy", " y", 'x', "gemTopaz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeTopaz), new Object[] { "xx", " y", " y", 'x', "gemTopaz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeTopaz), new Object[] { "x", "y", "y", 'x', "gemTopaz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickTopaz), new Object[] { "xxx", " y ", " y ", 'x', "gemTopaz", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordTopaz), new Object[] { "x", "x", "y", 'x', "gemTopaz", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeTurquoise), new Object[] { "xx", "xy", " y", 'x', "gemTurquoise", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeTurquoise), new Object[] { "xx", " y", " y", 'x', "gemTurquoise", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeTurquoise), new Object[] { "x", "y", "y", 'x', "gemTurquoise", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickTurquoise), new Object[] { "xxx", " y ", " y ", 'x', "gemTurquoise", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordTurquoise), new Object[] { "x", "x", "y", 'x', "gemTurquoise", 'y', "stickWood" }));

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.axeWAlabaster), new Object[] { "xx", "xy", " y", 'x', "gemWAlabaster", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.hoeWAlabaster), new Object[] { "xx", " y", " y", 'x', "gemWAlabaster", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.spadeWAlabaster), new Object[] { "x", "y", "y", 'x', "gemWAlabaster", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.pickWAlabaster), new Object[] { "xxx", " y ", " y ", 'x', "gemWAlabaster", 'y', "stickWood" }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModTools.swordWAlabaster), new Object[] { "x", "x", "y", 'x', "gemWAlabaster", 'y', "stickWood" }));
    }

    public RecipesCraftingTools() {
        RecipesCraftingTools.addShaped();
    }
}
