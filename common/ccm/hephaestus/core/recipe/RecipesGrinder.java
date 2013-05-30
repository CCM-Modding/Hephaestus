package ccm.hephaestus.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.api.fuels.GrinderFuels;
import ccm.hephaestus.api.recipes.GrinderRecipes;
import ccm.hephaestus.core.handlers.EHandler;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.hephaestus.item.ModItems;

final class RecipesGrinder {

    public RecipesGrinder() {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels() {
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gsStone));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gsIron));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gsBronze));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gsObsidian));
        GrinderFuels.registerGrinderFuel(new ItemStack(ModItems.gsDiamond));
    }

    // needs ore dictionary
    private static void registerRecipes() {
        
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.oreGold), EHandler.getItem(EnumDusts.dustGold, 2));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Block.oreIron), EHandler.getItem(EnumDusts.dustIron, 2));
        
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumOres.oreAluminum), EHandler.getItem(EnumDusts.dustAluminum, 2));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumOres.oreCopper), EHandler.getItem(EnumDusts.dustCopper, 2));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumOres.oreLead), EHandler.getItem(EnumDusts.dustLead, 2));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumOres.oreSilver), EHandler.getItem(EnumDusts.dustSilver, 2));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumOres.oreSulfur), EHandler.getItem(EnumDusts.dustSulfur, 2));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumOres.oreTin), EHandler.getItem(EnumDusts.dustTin, 2));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumOres.oreTitanium), EHandler.getItem(EnumDusts.dustTitanium, 2));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumOres.oreTungsten), EHandler.getItem(EnumDusts.dustTungsten, 2));
        
        GrinderRecipes.grinding().addGrinding(new ItemStack(Item.ingotIron), EHandler.getItem(EnumDusts.dustGold));
        GrinderRecipes.grinding().addGrinding(new ItemStack(Item.ingotGold), EHandler.getItem(EnumDusts.dustIron));

        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotAluminum), EHandler.getItem(EnumDusts.dustAluminum));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotBronze), EHandler.getItem(EnumDusts.dustBronze));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotCopper), EHandler.getItem(EnumDusts.dustCopper));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotHardIron), EHandler.getItem(EnumDusts.dustHardIron));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotHeavyIron), EHandler.getItem(EnumDusts.dustHeavyIron));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotLead), EHandler.getItem(EnumDusts.dustLead));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotSilver), EHandler.getItem(EnumDusts.dustSilver));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotSteel), EHandler.getItem(EnumDusts.dustSteel));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotTin), EHandler.getItem(EnumDusts.dustTin));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotTitanium), EHandler.getItem(EnumDusts.dustTitanium));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotTitCarbide), EHandler.getItem(EnumDusts.dustTitCarbide));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotTunCarbide), EHandler.getItem(EnumDusts.dustTunCarbide));
        GrinderRecipes.grinding().addGrinding(EHandler.getItem(EnumIngots.ingotTungsten), EHandler.getItem(EnumDusts.dustTungsten));

    }
}