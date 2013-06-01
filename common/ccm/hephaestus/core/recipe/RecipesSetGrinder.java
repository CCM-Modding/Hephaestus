package ccm.hephaestus.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.api.fuels.FuelsGrinder;
import ccm.hephaestus.api.recipes.RecipesGrinder;
import ccm.hephaestus.core.handlers.EHandler;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.hephaestus.item.ModItems;

final class RecipesSetGrinder {

    public RecipesSetGrinder() {
        registerFuels();
        registerRecipes();
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

        RecipesGrinder.grinding().addGrinding(new ItemStack(Block.oreGold), EHandler.getItem(EnumDusts.dustGold, 2));
        RecipesGrinder.grinding().addGrinding(new ItemStack(Block.oreIron), EHandler.getItem(EnumDusts.dustIron, 2));

        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumOres.oreAluminum), EHandler.getItem(EnumDusts.dustAluminum, 2));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumOres.oreCopper), EHandler.getItem(EnumDusts.dustCopper, 2));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumOres.oreLead), EHandler.getItem(EnumDusts.dustLead, 2));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumOres.oreSilver), EHandler.getItem(EnumDusts.dustSilver, 2));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumOres.oreSulfur), EHandler.getItem(EnumDusts.dustSulfur, 2));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumOres.oreTin), EHandler.getItem(EnumDusts.dustTin, 2));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumOres.oreTitanium), EHandler.getItem(EnumDusts.dustTitanium, 2));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumOres.oreTungsten), EHandler.getItem(EnumDusts.dustTungsten, 2));

        RecipesGrinder.grinding().addGrinding(new ItemStack(Item.ingotIron), EHandler.getItem(EnumDusts.dustGold));
        RecipesGrinder.grinding().addGrinding(new ItemStack(Item.ingotGold), EHandler.getItem(EnumDusts.dustIron));

        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotAluminum), EHandler.getItem(EnumDusts.dustAluminum));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotBronze), EHandler.getItem(EnumDusts.dustBronze));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotCopper), EHandler.getItem(EnumDusts.dustCopper));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotHardIron), EHandler.getItem(EnumDusts.dustHardIron));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotHeavyIron), EHandler.getItem(EnumDusts.dustHeavyIron));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotLead), EHandler.getItem(EnumDusts.dustLead));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotSilver), EHandler.getItem(EnumDusts.dustSilver));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotSteel), EHandler.getItem(EnumDusts.dustSteel));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotTin), EHandler.getItem(EnumDusts.dustTin));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotTitanium), EHandler.getItem(EnumDusts.dustTitanium));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotTitCarbide), EHandler.getItem(EnumDusts.dustTitCarbide));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotTunCarbide), EHandler.getItem(EnumDusts.dustTunCarbide));
        RecipesGrinder.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotTungsten), EHandler.getItem(EnumDusts.dustTungsten));

    }
}