package ccm.hephaestus.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.nucleum.helper.enums.EnumHelper;

final class RecipesCrafting {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped() {

        // needs proper recipe
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGrinder), new Object[] {
                        "xxx", "x x", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotSteel) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(new ItemStack(ModBlocks.blockBlast), new Object[] { "xxx",
                        "x x", "xxx", 'x', Block.brick }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShapeless() {

        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumDusts.dustBronze, 4),
                        EnumHelper.getItemIS(EnumDusts.dustCopper), EnumHelper
                                .getItemIS(EnumDusts.dustCopper), EnumHelper
                                .getItemIS(EnumDusts.dustCopper), EnumHelper
                                .getItemIS(EnumDusts.dustTin)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumDusts.dustHardIron, 5),
                        EnumHelper.getItemIS(EnumDusts.dustIron), EnumHelper
                                .getItemIS(EnumDusts.dustIron), EnumHelper
                                .getItemIS(EnumDusts.dustIron), EnumHelper
                                .getItemIS(EnumDusts.dustLead), EnumHelper
                                .getItemIS(EnumDusts.dustLead)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumDusts.dustTitanite, 5),
                        EnumHelper.getItemIS(EnumDusts.dustTitanium), EnumHelper
                                .getItemIS(EnumDusts.dustTitanium), EnumHelper
                                .getItemIS(EnumDusts.dustTitanium), EnumHelper
                                .getItemIS(EnumDusts.dustAluminum), EnumHelper
                                .getItemIS(EnumDusts.dustAluminum)));
    }

    public RecipesCrafting() {
        RecipesCrafting.addShaped();
        RecipesCrafting.addShapeless();
    }
}
