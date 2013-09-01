package ccm.hephaestus.utils.registry.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import ccm.hephaestus.api.fuels.GrinderFuels;
import ccm.hephaestus.api.recipes.GrinderRecipes;
import ccm.hephaestus.block.enums.EnumOresM;
import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.item.enums.EnumDust;
import ccm.hephaestus.item.enums.EnumIngot;
import ccm.nucleum.omnium.utils.helper.enums.EnumToItemStack;

final class RecipesGrinder extends RecipeRegistry
{

    public RecipesGrinder()
    {
        fuels = GrinderFuels.instance();
        recipes = GrinderRecipes.instance();
        register();
    }

    @Override
    void registerFuels()
    {
        fuels.registerFuel(new ItemStack(ModItems.gsStone));
        fuels.registerFuel(new ItemStack(ModItems.gsIron));
        fuels.registerFuel(new ItemStack(ModItems.gsBronze));
        fuels.registerFuel(new ItemStack(ModItems.gsObsidian));
        fuels.registerFuel(new ItemStack(ModItems.gsDiamond));
    }

    // needs ore dictionary
    @Override
    void registerRecipes()
    {

        recipes.addRecipe(new ItemStack(Block.oreGold), EnumToItemStack.getItemIS(EnumDust.dustGold, 2));
        recipes.addRecipe(new ItemStack(Block.oreIron), EnumToItemStack.getItemIS(EnumDust.dustIron, 2));

        recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreAluminum), EnumToItemStack.getItemIS(EnumDust.dustAluminum, 2));
        recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreCopper), EnumToItemStack.getItemIS(EnumDust.dustCopper, 2));
        recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreSilver), EnumToItemStack.getItemIS(EnumDust.dustSilver, 2));
        recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreTin), EnumToItemStack.getItemIS(EnumDust.dustTin, 2));
        recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreTitanium), EnumToItemStack.getItemIS(EnumDust.dustTitanium, 2));

        recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreSulfur), EnumToItemStack.getItemIS(EnumDust.dustSulfur, 8));

        recipes.addRecipe(new ItemStack(Item.ingotIron), EnumToItemStack.getItemIS(EnumDust.dustGold));
        recipes.addRecipe(new ItemStack(Item.ingotGold), EnumToItemStack.getItemIS(EnumDust.dustIron));

        recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotAluminum), EnumToItemStack.getItemIS(EnumDust.dustAluminum));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotBronze), EnumToItemStack.getItemIS(EnumDust.dustBronze));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotCopper), EnumToItemStack.getItemIS(EnumDust.dustCopper));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotSilver), EnumToItemStack.getItemIS(EnumDust.dustSilver));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotSteel), EnumToItemStack.getItemIS(EnumDust.dustSteel));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTin), EnumToItemStack.getItemIS(EnumDust.dustTin));
        recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTitanium), EnumToItemStack.getItemIS(EnumDust.dustTitanium));
    }
}