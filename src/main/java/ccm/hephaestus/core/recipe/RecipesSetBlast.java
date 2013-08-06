package ccm.hephaestus.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.api.fuels.FuelsBlast;
import ccm.hephaestus.api.recipes.RecipesBlast;
import ccm.hephaestus.enums.blocks.EnumOresH;
import ccm.hephaestus.enums.items.EnumDustsH;
import ccm.hephaestus.enums.items.EnumIngotsH;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class RecipesSetBlast {

    public RecipesSetBlast() {
        RecipesSetBlast.registerFuels();
        RecipesSetBlast.registerRecipes();
    }

    private static void registerFuels() {
        FuelsBlast.registerCoalFuel(new ItemStack(Item.coal));
        FuelsBlast.registerSulfurFuel(EnumToItemStack.getItemIS(EnumDustsH.dustSulfur));
    }

    // needs ore dictionary
    private static void registerRecipes() {

        RecipesBlast.smelting().addSmelting(EnumToItemStack.getBlockIS(EnumOresH.oreTitanium), EnumToItemStack.getItemIS(EnumIngotsH.ingotTitanium));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getBlockIS(EnumOresH.oreTungsten), EnumToItemStack.getItemIS(EnumIngotsH.ingotTungsten));

        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumIngotsH.ingotHeavyIron), EnumToItemStack.getItemIS(EnumIngotsH.ingotHardIron));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumIngotsH.ingotTitanium), EnumToItemStack.getItemIS(EnumIngotsH.ingotTitCarbide));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumIngotsH.ingotTungsten), EnumToItemStack.getItemIS(EnumIngotsH.ingotTunCarbide));

        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDustsH.dustHardIron), EnumToItemStack.getItemIS(EnumIngotsH.ingotHardIron));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDustsH.dustTitanite), EnumToItemStack.getItemIS(EnumIngotsH.ingotTitanite));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDustsH.dustTitanium), EnumToItemStack.getItemIS(EnumIngotsH.ingotTitanium));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDustsH.dustTitCarbide), EnumToItemStack.getItemIS(EnumIngotsH.ingotTitCarbide));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDustsH.dustTunCarbide), EnumToItemStack.getItemIS(EnumIngotsH.ingotTunCarbide));
        RecipesBlast.smelting().addSmelting(EnumToItemStack.getItemIS(EnumDustsH.dustTungsten), EnumToItemStack.getItemIS(EnumIngotsH.ingotTungsten));

    }
}