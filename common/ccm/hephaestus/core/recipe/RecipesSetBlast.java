package ccm.hephaestus.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.api.fuels.FuelsBlast;
import ccm.hephaestus.api.recipes.RecipesBlast;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.nucleum_omnium.helper.enums.EnumHelper;

final class RecipesSetBlast {

    public RecipesSetBlast() {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels() {
        FuelsBlast.registerCoalFuel(new ItemStack(Item.coal));
        FuelsBlast.registerSulfurFuel(EnumHelper.getItemIS(EnumDusts.dustSulfur));
    }

    // needs ore dictionary
    private static void registerRecipes() {

        RecipesBlast.smelting().addSmelting(EnumHelper.getBlockIS(EnumOres.oreTitanium), EnumHelper.getItemIS(EnumIngots.ingotTitanium));
        RecipesBlast.smelting().addSmelting(EnumHelper.getBlockIS(EnumOres.oreTungsten), EnumHelper.getItemIS(EnumIngots.ingotTungsten));

        RecipesBlast.smelting().addSmelting(EnumHelper.getItemIS(EnumIngots.ingotHeavyIron), EnumHelper.getItemIS(EnumIngots.ingotHardIron));
        RecipesBlast.smelting().addSmelting(EnumHelper.getItemIS(EnumIngots.ingotTitanium), EnumHelper.getItemIS(EnumIngots.ingotTitCarbide));
        RecipesBlast.smelting().addSmelting(EnumHelper.getItemIS(EnumIngots.ingotTungsten), EnumHelper.getItemIS(EnumIngots.ingotTunCarbide));

        RecipesBlast.smelting().addSmelting(EnumHelper.getItemIS(EnumDusts.dustHardIron), EnumHelper.getItemIS(EnumIngots.ingotHardIron));
        RecipesBlast.smelting().addSmelting(EnumHelper.getItemIS(EnumDusts.dustTitanite), EnumHelper.getItemIS(EnumIngots.ingotTitanite));
        RecipesBlast.smelting().addSmelting(EnumHelper.getItemIS(EnumDusts.dustTitanium), EnumHelper.getItemIS(EnumIngots.ingotTitanium));
        RecipesBlast.smelting().addSmelting(EnumHelper.getItemIS(EnumDusts.dustTitCarbide), EnumHelper.getItemIS(EnumIngots.ingotTitCarbide));
        RecipesBlast.smelting().addSmelting(EnumHelper.getItemIS(EnumDusts.dustTunCarbide), EnumHelper.getItemIS(EnumIngots.ingotTunCarbide));
        RecipesBlast.smelting().addSmelting(EnumHelper.getItemIS(EnumDusts.dustTungsten), EnumHelper.getItemIS(EnumIngots.ingotTungsten));

    }
}