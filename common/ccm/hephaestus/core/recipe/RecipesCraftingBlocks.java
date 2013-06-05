package ccm.hephaestus.core.recipe;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import ccm.nucleum_omnium.helper.enums.EnumHelper;

import ccm.hephaestus.enums.EnumBlocks;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;

final class RecipesCraftingBlocks
{

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShaped()
    {

        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockAluminum), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotAluminum) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockBronze), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotBronze) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockCopper), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotCopper) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockHardIron), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotHardIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockHeavyIron), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotHeavyIron) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockLead), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotLead) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockSilver), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotSilver) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockSteel), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotSteel) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockSulfur), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumDusts.dustSulfur) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockTin), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotTin) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockTitanite), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotTitanite) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockTitanium), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotTitanium) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockTitCarbide), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotTitCarbide) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockTunCarbide), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotTunCarbide) }));
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(EnumHelper.getBlockIS(EnumBlocks.blockTungsten), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumHelper.getItemIS(EnumIngots.ingotTungsten) }));
    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    @SuppressWarnings("unchecked")
    private static void addShapeless()
    {

        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotAluminum, 9), EnumHelper.getBlockIS(EnumBlocks.blockAluminum)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotBronze, 9), EnumHelper.getBlockIS(EnumBlocks.blockBronze)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotCopper, 9), EnumHelper.getBlockIS(EnumBlocks.blockCopper)));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotHardIron, 9), EnumHelper.getBlockIS(EnumBlocks.blockHardIron)));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotHeavyIron, 9), EnumHelper.getBlockIS(EnumBlocks.blockHeavyIron)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotLead, 9), EnumHelper.getBlockIS(EnumBlocks.blockLead)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotSilver, 9), EnumHelper.getBlockIS(EnumBlocks.blockSilver)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotSteel, 9), EnumHelper.getBlockIS(EnumBlocks.blockSteel)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumDusts.dustSulfur, 9), EnumHelper.getBlockIS(EnumBlocks.blockSulfur)));
        CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotTin, 9), EnumHelper.getBlockIS(EnumBlocks.blockTin)));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotTitanite, 9), EnumHelper.getBlockIS(EnumBlocks.blockTitanite)));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotTitanium, 9), EnumHelper.getBlockIS(EnumBlocks.blockTitanium)));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotTitCarbide, 9), EnumHelper.getBlockIS(EnumBlocks.blockTitCarbide)));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotTunCarbide, 9), EnumHelper.getBlockIS(EnumBlocks.blockTunCarbide)));
        CraftingManager.getInstance()
                .getRecipeList()
                .add(new ShapelessOreRecipe(EnumHelper.getItemIS(EnumIngots.ingotTungsten, 9), EnumHelper.getBlockIS(EnumBlocks.blockTungsten)));
    }

    public RecipesCraftingBlocks()
    {
        addShaped();
        addShapeless();
    }
}
