package ccm.hephaestus.core.recipe;

import java.util.List;

import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ccm.hephaestus.block.enums.EnumBlocksD;
import ccm.hephaestus.block.enums.EnumBlocksG;
import ccm.hephaestus.block.enums.EnumBlocksM;
import ccm.hephaestus.item.enums.EnumDust;
import ccm.hephaestus.item.enums.EnumGem;
import ccm.hephaestus.item.enums.EnumIngot;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class RecipesCrafting {

    List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

    public RecipesCrafting() {
        this.addShaped();
        this.addShapeless();
    }

    /**
     * Adds all the Shaped recipes in the Mod.
     */
    void addShaped() {

        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotAluminum) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockBronze), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotBronze) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockCopper), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotCopper) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockHardIron), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotHardIron) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockHeavyIron), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotHeavyIron) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockLead), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotLead) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockSilver), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotSilver) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockSteel), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotSteel) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksD.blockSulfur), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumDust.dustSulfur) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockTin), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotTin) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockTitanite), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotTitanite) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockTitanium), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotTitanium) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockTitCarbide), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotTitCarbide) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockTunCarbide), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotTunCarbide) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksM.blockTungsten), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumIngot.ingotTungsten) }));

        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksG.blockCitrine), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemCitrine) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksG.blockCZirconia), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemCZirconia) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksG.blockJet), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemJet) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksG.blockOlivine), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemOlivine) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksG.blockOpal), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemOpal) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksG.blockRuby), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemRuby) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksG.blockSapphire), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemSapphire) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksG.blockSun), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemSun) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksG.blockTopaz), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemTopaz) }));
        recipes.add(new ShapedOreRecipe(EnumToItemStack.getBlockIS(EnumBlocksG.blockWAlabaster), new Object[] { "xxx", "xxx", "xxx", 'x', EnumToItemStack.getItemIS(EnumGem.gemWAlabaster) }));

    }

    /**
     * Adds all the Shapeless recipes in the Mod.
     */
    void addShapeless() {

        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotAluminum, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockAluminum)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotBronze, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockBronze)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotCopper, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockCopper)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotHardIron, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockHardIron)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotHeavyIron, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockHeavyIron)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotLead, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockLead)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotSilver, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockSilver)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotSteel, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockSteel)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumDust.dustSulfur, 9), EnumToItemStack.getBlockIS(EnumBlocksD.blockSulfur)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTin, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockTin)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTitanite, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockTitanite)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTitanium, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockTitanium)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTitCarbide, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockTitCarbide)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTunCarbide, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockTunCarbide)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTungsten, 9), EnumToItemStack.getBlockIS(EnumBlocksM.blockTungsten)));

        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemCitrine, 9), EnumToItemStack.getBlockIS(EnumBlocksG.blockCitrine)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemCZirconia, 9), EnumToItemStack.getBlockIS(EnumBlocksG.blockCZirconia)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemJet, 9), EnumToItemStack.getBlockIS(EnumBlocksG.blockJet)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemOlivine, 9), EnumToItemStack.getBlockIS(EnumBlocksG.blockOlivine)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemOpal, 9), EnumToItemStack.getBlockIS(EnumBlocksG.blockOpal)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemRuby, 9), EnumToItemStack.getBlockIS(EnumBlocksG.blockRuby)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemSapphire, 9), EnumToItemStack.getBlockIS(EnumBlocksG.blockSapphire)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemSun, 9), EnumToItemStack.getBlockIS(EnumBlocksG.blockSun)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemTopaz, 9), EnumToItemStack.getBlockIS(EnumBlocksG.blockTopaz)));
        recipes.add(new ShapelessOreRecipe(EnumToItemStack.getItemIS(EnumGem.gemWAlabaster, 9), EnumToItemStack.getBlockIS(EnumBlocksG.blockWAlabaster)));

    }
}