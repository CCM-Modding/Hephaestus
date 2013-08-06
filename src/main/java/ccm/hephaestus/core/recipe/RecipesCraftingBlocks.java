package ccm.hephaestus.core.recipe;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.hephaestus.enums.blocks.EnumBlocksH;
import ccm.hephaestus.enums.items.EnumDustsH;
import ccm.hephaestus.enums.items.EnumIngotsH;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class RecipesCraftingBlocks {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    private static void addShaped() {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockAluminum), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockBronze), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotBronze) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockCopper), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotCopper) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockHardIron), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotHardIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockHeavyIron), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotHeavyIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockLead), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotLead) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockSilver), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotSilver) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockSteel), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotSteel) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockSulfur), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumDustsH.dustSulfur) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockTin), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockTitanite), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotTitanite) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockTitanium), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotTitanium) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockTitCarbide), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotTitCarbide) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockTunCarbide), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotTunCarbide) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksH.blockTungsten), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngotsH.ingotTungsten) }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    private static void addShapeless() {

        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotAluminum, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockAluminum)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotBronze, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockBronze)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotCopper, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockCopper)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotHardIron, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockHardIron)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotHeavyIron, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockHeavyIron)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotLead, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockLead)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotSilver, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockSilver)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotSteel, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockSteel)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumDustsH.dustSulfur, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockSulfur)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotTin, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockTin)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotTitanite, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockTitanite)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotTitanium, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockTitanium)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotTitCarbide, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockTitCarbide)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotTunCarbide, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockTunCarbide)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngotsH.ingotTungsten, 9), EnumToItemStack.getBlockIS(EnumBlocksH.blockTungsten)));
    }

    public RecipesCraftingBlocks() {
        RecipesCraftingBlocks.addShaped();
        RecipesCraftingBlocks.addShapeless();
    }
}
