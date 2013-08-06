package ccm.hephaestus.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.enums.items.EnumDusts;
import ccm.hephaestus.enums.items.EnumIngots;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesCrafting {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    private static void addShaped() {

        // needs proper recipe
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGrinder), new Object[] { "xxx", "x x", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngots.ingotSteel) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBlast), new Object[] { "xxx", "x x", "xxx", 'x', Block.brick }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    private static void addShapeless() {

        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumDusts.dustBronze, 4), EnumToItemStack.getItemIS(EnumDusts.dustCopper), EnumToItemStack.getItemIS(EnumDusts.dustCopper), EnumToItemStack.getItemIS(EnumDusts.dustCopper), EnumToItemStack.getItemIS(EnumDusts.dustTin)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumDusts.dustHardIron, 5), EnumToItemStack.getItemIS(EnumDusts.dustIron), EnumToItemStack.getItemIS(EnumDusts.dustIron), EnumToItemStack.getItemIS(EnumDusts.dustIron), EnumToItemStack.getItemIS(EnumDusts.dustLead), EnumToItemStack.getItemIS(EnumDusts.dustLead)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumDusts.dustTitanite, 5), EnumToItemStack.getItemIS(EnumDusts.dustTitanium), EnumToItemStack.getItemIS(EnumDusts.dustTitanium), EnumToItemStack.getItemIS(EnumDusts.dustTitanium), EnumToItemStack.getItemIS(EnumDusts.dustAluminum), EnumToItemStack.getItemIS(EnumDusts.dustAluminum)));
    }

    public RecipesCrafting() {
        RecipesCrafting.addShaped();
        RecipesCrafting.addShapeless();
    }
}
