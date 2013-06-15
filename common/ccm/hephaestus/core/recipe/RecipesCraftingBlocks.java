package ccm.hephaestus.core.recipe;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.hephaestus.enums.EnumBlocks;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesCraftingBlocks {

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped() {

        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotAluminum) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockBronze),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotBronze) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockCopper),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotCopper) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockHardIron),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotHardIron) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockHeavyIron),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotHeavyIron) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockLead), new Object[] {
                        "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngots.ingotLead) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockSilver),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotSilver) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockSteel),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotSteel) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockSulfur),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumDusts.dustSulfur) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockTin), new Object[] {
                        "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngots.ingotTin) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockTitanite),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotTitanite) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockTitanium),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotTitanium) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockTitCarbide),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotTitCarbide) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockTunCarbide),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotTunCarbide) }));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocks.blockTungsten),
                        new Object[] { "xxx", "xxx", "xxx", 'x',
                                EnumToItemStack.getItemIS(EnumIngots.ingotTungsten) }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShapeless() {

        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotAluminum, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockAluminum)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotBronze, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockBronze)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotCopper, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockCopper)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotHardIron, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockHardIron)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotHeavyIron, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockHeavyIron)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotLead, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockLead)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotSilver, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockSilver)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotSteel, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockSteel)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumDusts.dustSulfur, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockSulfur)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotTin, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockTin)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotTitanite, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockTitanite)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotTitanium, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockTitanium)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotTitCarbide, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockTitCarbide)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotTunCarbide, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockTunCarbide)));
        CraftingManager
                .getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngots.ingotTungsten, 9),
                        EnumToItemStack.getBlockIS(EnumBlocks.blockTungsten)));
    }

    public RecipesCraftingBlocks() {
        RecipesCraftingBlocks.addShaped();
        RecipesCraftingBlocks.addShapeless();
    }
}
