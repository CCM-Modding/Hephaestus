package ccm.hephaestus.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


import ccm.hephaestus.api.fuels.FuelsGrinder;
import ccm.hephaestus.api.recipes.RecipesGrinder;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.hephaestus.item.ModItems;
import ccm.nucleum.helper.enums.EnumHelper;

final class RecipesSetGrinder
{

    public RecipesSetGrinder()
    {
        registerFuels();
        registerRecipes();
    }

    private static void registerFuels()
    {
        FuelsGrinder.registerGrinderFuel(new ItemStack(ModItems.gsStone));
        FuelsGrinder.registerGrinderFuel(new ItemStack(ModItems.gsIron));
        FuelsGrinder.registerGrinderFuel(new ItemStack(ModItems.gsBronze));
        FuelsGrinder.registerGrinderFuel(new ItemStack(ModItems.gsObsidian));
        FuelsGrinder.registerGrinderFuel(new ItemStack(ModItems.gsDiamond));
    }

    // needs ore dictionary
    private static void registerRecipes()
    {

        RecipesGrinder.grinding().addGrinding(new ItemStack(Block.oreGold), EnumHelper.getItemIS(EnumDusts.dustGold, 2));
        RecipesGrinder.grinding().addGrinding(new ItemStack(Block.oreIron), EnumHelper.getItemIS(EnumDusts.dustIron, 2));

        RecipesGrinder.grinding().addGrinding(EnumHelper.getBlockIS(EnumOres.oreAluminum), EnumHelper.getItemIS(EnumDusts.dustAluminum, 2));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getBlockIS(EnumOres.oreCopper), EnumHelper.getItemIS(EnumDusts.dustCopper, 2));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getBlockIS(EnumOres.oreLead), EnumHelper.getItemIS(EnumDusts.dustLead, 2));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getBlockIS(EnumOres.oreSilver), EnumHelper.getItemIS(EnumDusts.dustSilver, 2));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getBlockIS(EnumOres.oreSulfur), EnumHelper.getItemIS(EnumDusts.dustSulfur, 2));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getBlockIS(EnumOres.oreTin), EnumHelper.getItemIS(EnumDusts.dustTin, 2));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getBlockIS(EnumOres.oreTitanium), EnumHelper.getItemIS(EnumDusts.dustTitanium, 2));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getBlockIS(EnumOres.oreTungsten), EnumHelper.getItemIS(EnumDusts.dustTungsten, 2));

        RecipesGrinder.grinding().addGrinding(new ItemStack(Item.ingotIron), EnumHelper.getItemIS(EnumDusts.dustGold));
        RecipesGrinder.grinding().addGrinding(new ItemStack(Item.ingotGold), EnumHelper.getItemIS(EnumDusts.dustIron));

        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotAluminum), EnumHelper.getItemIS(EnumDusts.dustAluminum));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotBronze), EnumHelper.getItemIS(EnumDusts.dustBronze));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotCopper), EnumHelper.getItemIS(EnumDusts.dustCopper));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotHardIron), EnumHelper.getItemIS(EnumDusts.dustHardIron));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotHeavyIron), EnumHelper.getItemIS(EnumDusts.dustHeavyIron));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotLead), EnumHelper.getItemIS(EnumDusts.dustLead));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotSilver), EnumHelper.getItemIS(EnumDusts.dustSilver));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotSteel), EnumHelper.getItemIS(EnumDusts.dustSteel));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotTin), EnumHelper.getItemIS(EnumDusts.dustTin));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotTitanium), EnumHelper.getItemIS(EnumDusts.dustTitanium));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotTitCarbide), EnumHelper.getItemIS(EnumDusts.dustTitCarbide));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotTunCarbide), EnumHelper.getItemIS(EnumDusts.dustTunCarbide));
        RecipesGrinder.grinding().addGrinding(EnumHelper.getItemIS(EnumIngots.ingotTungsten), EnumHelper.getItemIS(EnumDusts.dustTungsten));

    }
}