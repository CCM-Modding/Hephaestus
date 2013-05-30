package ccm.hephaestus.core.recipe;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.hephaestus.core.handlers.EHandler;
import ccm.hephaestus.enums.EnumBlocks;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;

final class RecipesCraftingBlocks {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped() {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockAluminum), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockBronze), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotBronze) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockCopper), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotCopper) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockHardIron), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotHardIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockHeavyIron), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotHeavyIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockLead), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotLead) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockSilver), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotSilver) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockSteel), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotSteel) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockSulfur), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumDusts.dustSulfur) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockTin), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockTitanium), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotTitanium) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockTitCarbide), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotTitCarbide) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockTunCarbide), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotTunCarbide) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EHandler.getItem(EnumBlocks.blockTungsten), new Object[] { "xxx", "xxx", "xxx", 'x', EHandler.getItem(EnumIngots.ingotTungsten) }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShapeless() {

        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotAluminum, 9), EHandler.getItem(EnumBlocks.blockAluminum)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotBronze, 9), EHandler.getItem(EnumBlocks.blockBronze)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotCopper, 9), EHandler.getItem(EnumBlocks.blockCopper)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotHardIron, 9), EHandler.getItem(EnumBlocks.blockHardIron)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotHeavyIron, 9), EHandler.getItem(EnumBlocks.blockHeavyIron)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotLead, 9), EHandler.getItem(EnumBlocks.blockLead)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotSilver, 9), EHandler.getItem(EnumBlocks.blockSilver)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotSteel, 9), EHandler.getItem(EnumBlocks.blockSteel)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumDusts.dustSulfur, 9), EHandler.getItem(EnumBlocks.blockSulfur)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotTin, 9), EHandler.getItem(EnumBlocks.blockTin)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotTitanium, 9), EHandler.getItem(EnumBlocks.blockTitanium)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotTitCarbide, 9), EHandler.getItem(EnumBlocks.blockTitCarbide)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotTunCarbide, 9), EHandler.getItem(EnumBlocks.blockTunCarbide)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EHandler.getItem(EnumIngots.ingotTungsten, 9), EHandler.getItem(EnumBlocks.blockTungsten)));
    }

    public static void init() {
        addShaped();
        addShapeless();
    }
}
