package ccm.hephaestus.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.api.fuels.FuelsBlast;
import ccm.hephaestus.api.recipes.RecipesBlast;
import ccm.hephaestus.core.handlers.EHandler;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;


final class RecipesSetBlast {

    public RecipesSetBlast() {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels() {
        FuelsBlast.registerCoalFuel(new ItemStack(Item.coal));
        FuelsBlast.registerSulfurFuel(EHandler.getItem(EnumDusts.dustSulfur));
    }

    // needs ore dictionary
    private static void registerRecipes() {

        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumOres.oreTitanium), EHandler.getItem(EnumIngots.ingotTitanium));
        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumOres.oreTungsten), EHandler.getItem(EnumIngots.ingotTungsten));

        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumIngots.ingotHeavyIron), EHandler.getItem(EnumIngots.ingotHardIron));
        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumIngots.ingotTitanium), EHandler.getItem(EnumIngots.ingotTitCarbide));
        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumIngots.ingotTungsten), EHandler.getItem(EnumIngots.ingotTunCarbide));

        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumDusts.dustHardIron), EHandler.getItem(EnumIngots.ingotHardIron));
        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumDusts.dustTitanite), EHandler.getItem(EnumIngots.ingotTitanite));
        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumDusts.dustTitanium), EHandler.getItem(EnumIngots.ingotTitanium));
        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumDusts.dustTitCarbide), EHandler.getItem(EnumIngots.ingotTitCarbide));
        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumDusts.dustTunCarbide), EHandler.getItem(EnumIngots.ingotTunCarbide));
        RecipesBlast.smelting().addSmelting(EHandler.getItem(EnumDusts.dustTungsten), EHandler.getItem(EnumIngots.ingotTungsten));

    }
}