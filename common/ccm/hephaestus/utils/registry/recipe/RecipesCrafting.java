package ccm.hephaestus.utils.registry.recipe;

import java.util.List;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import ccm.hephaestus.block.enums.EnumBlocksA;
import ccm.hephaestus.block.enums.EnumBlocksM;
import ccm.hephaestus.item.enums.EnumDust;
import ccm.hephaestus.item.enums.EnumGem;
import ccm.hephaestus.item.enums.EnumIngot;
import ccm.nucleum.omnium.utils.helper.enums.EnumToItemStack;

final class RecipesCrafting
{

    List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

    public RecipesCrafting()
    {
        addShaped();
        addShapeless();
    }

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    void addShaped()
    {

        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotAluminum) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksA.blockBronze), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotBronze) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockCopper), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotCopper) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockSilver), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotSilver) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksA.blockSteel), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotSteel) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockSulfur), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumDust.dustSulfur) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockTin), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotTin) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksA.blockTitanite), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotTitanite) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockTitanium), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotTitanium) }));

        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockCitrine), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemCitrine) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockCZirconia), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemCZirconia) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockOlivine), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemOlivine) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockRuby), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemRuby) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockSapphire), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemSapphire) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockTopaz), new Object[]
        { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemTopaz) }));

    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    void addShapeless()
    {

        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotAluminum, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotBronze, 9), EnumToItemStack.getBlockIS(EnumBlocksA.blockBronze)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotCopper, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockCopper)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotSilver, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockSilver)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotSteel, 9), EnumToItemStack.getBlockIS(EnumBlocksA.blockSteel)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumDust.dustSulfur, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockSulfur)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTin, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockTin)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTitanite, 9), EnumToItemStack.getBlockIS(EnumBlocksA.blockTitanite)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTitanium, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockTitanium)));

        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemCitrine, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockCitrine)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemCZirconia, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockCZirconia)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemOlivine, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockOlivine)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemRuby, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockRuby)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemSapphire, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockSapphire)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemTopaz, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockTopaz)));

    }
}