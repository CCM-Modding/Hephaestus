package ccm.hephaestus.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.api.fuels.GrinderFuels;
import ccm.hephaestus.api.recipes.GrinderRecipes;
import ccm.hephaestus.block.enums.EnumOresD;
import ccm.hephaestus.block.enums.EnumOresM;
import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.item.enums.EnumDust;
import ccm.hephaestus.item.enums.EnumIngot;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class RecipesGrinder extends RecipeRegistry {

    public RecipesGrinder() {
        this.fuels = GrinderFuels.instance();
        this.recipes = GrinderRecipes.instance();
        this.register();
    }

    @Override
    void registerFuels() {
        this.fuels.registerFuel(new ItemStack(ModItems.gsStone));
        this.fuels.registerFuel(new ItemStack(ModItems.gsIron));
        this.fuels.registerFuel(new ItemStack(ModItems.gsBronze));
        this.fuels.registerFuel(new ItemStack(ModItems.gsObsidian));
        this.fuels.registerFuel(new ItemStack(ModItems.gsDiamond));
    }

    // needs ore dictionary
    @Override
    void registerRecipes() {

        this.recipes.addRecipe(new ItemStack(Block.oreGold), EnumToItemStack.getItemIS(EnumDust.dustGold, 2));
        this.recipes.addRecipe(new ItemStack(Block.oreIron), EnumToItemStack.getItemIS(EnumDust.dustIron, 2));

        this.recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreAluminum), EnumToItemStack.getItemIS(EnumDust.dustAluminum, 2));
        this.recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreCopper), EnumToItemStack.getItemIS(EnumDust.dustCopper, 2));
        this.recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreLead), EnumToItemStack.getItemIS(EnumDust.dustLead, 2));
        this.recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreSilver), EnumToItemStack.getItemIS(EnumDust.dustSilver, 2));
        this.recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreTin), EnumToItemStack.getItemIS(EnumDust.dustTin, 2));
        this.recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreTitanium), EnumToItemStack.getItemIS(EnumDust.dustTitanium, 2));
        this.recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresM.oreTungsten), EnumToItemStack.getItemIS(EnumDust.dustTungsten, 2));

        this.recipes.addRecipe(EnumToItemStack.getBlockIS(EnumOresD.oreSulfur), EnumToItemStack.getItemIS(EnumDust.dustSulfur, 8));

        this.recipes.addRecipe(new ItemStack(Item.ingotIron), EnumToItemStack.getItemIS(EnumDust.dustGold));
        this.recipes.addRecipe(new ItemStack(Item.ingotGold), EnumToItemStack.getItemIS(EnumDust.dustIron));

        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotAluminum), EnumToItemStack.getItemIS(EnumDust.dustAluminum));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotBronze), EnumToItemStack.getItemIS(EnumDust.dustBronze));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotCopper), EnumToItemStack.getItemIS(EnumDust.dustCopper));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotHardIron), EnumToItemStack.getItemIS(EnumDust.dustHardIron));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotHeavyIron), EnumToItemStack.getItemIS(EnumDust.dustHeavyIron));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotLead), EnumToItemStack.getItemIS(EnumDust.dustLead));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotSilver), EnumToItemStack.getItemIS(EnumDust.dustSilver));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotSteel), EnumToItemStack.getItemIS(EnumDust.dustSteel));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTin), EnumToItemStack.getItemIS(EnumDust.dustTin));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTitanium), EnumToItemStack.getItemIS(EnumDust.dustTitanium));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTitCarbide), EnumToItemStack.getItemIS(EnumDust.dustTitCarbide));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTunCarbide), EnumToItemStack.getItemIS(EnumDust.dustTunCarbide));
        this.recipes.addRecipe(EnumToItemStack.getItemIS(EnumIngot.ingotTungsten), EnumToItemStack.getItemIS(EnumDust.dustTungsten));
    }
}