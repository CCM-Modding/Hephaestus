package ccm.hephaestus.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.enums.items.EnumDustsH;
import ccm.hephaestus.enums.items.EnumIngotsH;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class RecipesCrafting {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    private static void addShaped() {

        // needs proper recipe
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGrinder), new Object[] { "xxx", "x x", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotSteel) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBlast), new Object[] { "xxx", "x x", "xxx", 'x', Block.brick }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    private static void addShapeless() {

        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumDustsH.dustBronze, 4), EnumToItemStack.getItemIS(EnumDustsH.dustCopper), EnumToItemStack.getItemIS(EnumDustsH.dustCopper), EnumToItemStack.getItemIS(EnumDustsH.dustCopper), EnumToItemStack.getItemIS(EnumDustsH.dustTin)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumDustsH.dustHardIron, 5), EnumToItemStack.getItemIS(EnumDustsH.dustIron), EnumToItemStack.getItemIS(EnumDustsH.dustIron), EnumToItemStack.getItemIS(EnumDustsH.dustIron), EnumToItemStack.getItemIS(EnumDustsH.dustLead), EnumToItemStack.getItemIS(EnumDustsH.dustLead)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumDustsH.dustTitanite, 5), EnumToItemStack.getItemIS(EnumDustsH.dustTitanium), EnumToItemStack.getItemIS(EnumDustsH.dustTitanium), EnumToItemStack.getItemIS(EnumDustsH.dustTitanium), EnumToItemStack.getItemIS(EnumDustsH.dustAluminum), EnumToItemStack.getItemIS(EnumDustsH.dustAluminum)));
    }

    public RecipesCrafting() {
        RecipesCrafting.addShaped();
        RecipesCrafting.addShapeless();
    }
}
