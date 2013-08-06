package ccm.hephaestus.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.api.fuels.FuelsBlast;
import ccm.hephaestus.api.recipes.RecipesBlast;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesSetBlast {

    public RecipesSetBlast() {
        RecipesSetBlast.registerFuels();
        RecipesSetBlast.registerRecipes();
    }

    private static void registerFuels() {
        FuelsBlast.registerCoalFuel(new ItemStack(Item.coal));
        FuelsBlast.registerSulfurFuel(EnumToItemStack.getItemIS(EnumDusts.dustSulfur));
    }

    // needs ore dictionary
    private static void registerRecipes() {

        RecipesBlast.smelting().addSmelting(EnumToItemStack.getBlockIS(EnumOres.oreTitanium), EnumToItemStack.getItemIS(EnumIngots.ingotTitanium));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getBlockIS(EnumOres.oreTungsten), EnumToItemStack.getItemIS(EnumIngots.ingotTungsten));

        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumIngots.ingotHeavyIron), EnumToItemStack.getItemIS(EnumIngots.ingotHardIron));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumIngots.ingotTitanium), EnumToItemStack.getItemIS(EnumIngots.ingotTitCarbide));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumIngots.ingotTungsten), EnumToItemStack.getItemIS(EnumIngots.ingotTunCarbide));

        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDusts.dustHardIron), EnumToItemStack.getItemIS(EnumIngots.ingotHardIron));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDusts.dustTitanite), EnumToItemStack.getItemIS(EnumIngots.ingotTitanite));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDusts.dustTitanium), EnumToItemStack.getItemIS(EnumIngots.ingotTitanium));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDusts.dustTitCarbide), EnumToItemStack.getItemIS(EnumIngots.ingotTitCarbide));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDusts.dustTunCarbide), EnumToItemStack.getItemIS(EnumIngots.ingotTunCarbide));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDusts.dustTungsten), EnumToItemStack.getItemIS(EnumIngots.ingotTungsten));

    }
}