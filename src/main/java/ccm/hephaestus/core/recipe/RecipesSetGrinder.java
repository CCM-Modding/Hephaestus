package ccm.hephaestus.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.api.fuels.FuelsGrinder;
import ccm.hephaestus.api.recipes.RecipesGrinder;
import ccm.hephaestus.enums.blocks.EnumOres;
import ccm.hephaestus.enums.items.EnumDusts;
import ccm.hephaestus.enums.items.EnumIngots;
import ccm.hephaestus.item.ModItems;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesSetGrinder {

    public RecipesSetGrinder() {
        RecipesSetGrinder.registerFuels();
        RecipesSetGrinder.registerRecipes();
    }

    private static void registerFuels() {
        FuelsGrinder.registerGrinderFuel(new ItemStack(ModItems.gsStone));
        FuelsGrinder.registerGrinderFuel(new ItemStack(ModItems.gsIron));
        FuelsGrinder.registerGrinderFuel(new ItemStack(ModItems.gsBronze));
        FuelsGrinder.registerGrinderFuel(new ItemStack(ModItems.gsObsidian));
        FuelsGrinder.registerGrinderFuel(new ItemStack(ModItems.gsDiamond));
    }

    // needs ore dictionary
    private static void registerRecipes() {

        RecipesGrinder.grinding().addGrinding(new ItemStack(Block.oreGold), EnumToItemStack.getItemIS(EnumDusts.dustGold, 2));
        RecipesGrinder.grinding().addGrinding(new ItemStack(Block.oreIron), EnumToItemStack.getItemIS(EnumDusts.dustIron, 2));

        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOres.oreAluminum), EnumToItemStack.getItemIS(EnumDusts.dustAluminum, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOres.oreCopper), EnumToItemStack.getItemIS(EnumDusts.dustCopper, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOres.oreLead), EnumToItemStack.getItemIS(EnumDusts.dustLead, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOres.oreSilver), EnumToItemStack.getItemIS(EnumDusts.dustSilver, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOres.oreSulfur), EnumToItemStack.getItemIS(EnumDusts.dustSulfur, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOres.oreTin), EnumToItemStack.getItemIS(EnumDusts.dustTin, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOres.oreTitanium), EnumToItemStack.getItemIS(EnumDusts.dustTitanium, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOres.oreTungsten), EnumToItemStack.getItemIS(EnumDusts.dustTungsten, 2));

        RecipesGrinder.grinding().addGrinding(new ItemStack(Item.ingotIron), EnumToItemStack.getItemIS(EnumDusts.dustGold));
        RecipesGrinder.grinding().addGrinding(new ItemStack(Item.ingotGold), EnumToItemStack.getItemIS(EnumDusts.dustIron));

        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotAluminum), EnumToItemStack.getItemIS(EnumDusts.dustAluminum));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotBronze), EnumToItemStack.getItemIS(EnumDusts.dustBronze));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotCopper), EnumToItemStack.getItemIS(EnumDusts.dustCopper));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotHardIron), EnumToItemStack.getItemIS(EnumDusts.dustHardIron));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotHeavyIron), EnumToItemStack.getItemIS(EnumDusts.dustHeavyIron));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotLead), EnumToItemStack.getItemIS(EnumDusts.dustLead));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotSilver), EnumToItemStack.getItemIS(EnumDusts.dustSilver));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotSteel), EnumToItemStack.getItemIS(EnumDusts.dustSteel));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotTin), EnumToItemStack.getItemIS(EnumDusts.dustTin));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotTitanium), EnumToItemStack.getItemIS(EnumDusts.dustTitanium));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotTitCarbide), EnumToItemStack.getItemIS(EnumDusts.dustTitCarbide));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotTunCarbide), EnumToItemStack.getItemIS(EnumDusts.dustTunCarbide));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngots.ingotTungsten), EnumToItemStack.getItemIS(EnumDusts.dustTungsten));

    }
}