package ccm.hephaestus.core.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ccm.hephaestus.api.fuels.FuelsGrinder;
import ccm.hephaestus.api.recipes.RecipesGrinder;
import ccm.hephaestus.enums.blocks.EnumOresH;
import ccm.hephaestus.enums.items.EnumDustsH;
import ccm.hephaestus.enums.items.EnumIngotsH;
import ccm.hephaestus.item.ModItems;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

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

        RecipesGrinder.grinding().addGrinding(new ItemStack(Block.oreGold), EnumToItemStack.getItemIS(EnumDustsH.dustGold, 2));
        RecipesGrinder.grinding().addGrinding(new ItemStack(Block.oreIron), EnumToItemStack.getItemIS(EnumDustsH.dustIron, 2));

        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOresH.oreAluminum), EnumToItemStack.getItemIS(EnumDustsH.dustAluminum, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOresH.oreCopper), EnumToItemStack.getItemIS(EnumDustsH.dustCopper, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOresH.oreLead), EnumToItemStack.getItemIS(EnumDustsH.dustLead, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOresH.oreSilver), EnumToItemStack.getItemIS(EnumDustsH.dustSilver, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOresH.oreSulfur), EnumToItemStack.getItemIS(EnumDustsH.dustSulfur, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOresH.oreTin), EnumToItemStack.getItemIS(EnumDustsH.dustTin, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOresH.oreTitanium), EnumToItemStack.getItemIS(EnumDustsH.dustTitanium, 2));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getBlockIS(EnumOresH.oreTungsten), EnumToItemStack.getItemIS(EnumDustsH.dustTungsten, 2));

        RecipesGrinder.grinding().addGrinding(new ItemStack(Item.ingotIron), EnumToItemStack.getItemIS(EnumDustsH.dustGold));
        RecipesGrinder.grinding().addGrinding(new ItemStack(Item.ingotGold), EnumToItemStack.getItemIS(EnumDustsH.dustIron));

        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotAluminum), EnumToItemStack.getItemIS(EnumDustsH.dustAluminum));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotBronze), EnumToItemStack.getItemIS(EnumDustsH.dustBronze));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotCopper), EnumToItemStack.getItemIS(EnumDustsH.dustCopper));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotHardIron), EnumToItemStack.getItemIS(EnumDustsH.dustHardIron));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotHeavyIron), EnumToItemStack.getItemIS(EnumDustsH.dustHeavyIron));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotLead), EnumToItemStack.getItemIS(EnumDustsH.dustLead));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotSilver), EnumToItemStack.getItemIS(EnumDustsH.dustSilver));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotSteel), EnumToItemStack.getItemIS(EnumDustsH.dustSteel));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotTin), EnumToItemStack.getItemIS(EnumDustsH.dustTin));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotTitanium), EnumToItemStack.getItemIS(EnumDustsH.dustTitanium));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotTitCarbide), EnumToItemStack.getItemIS(EnumDustsH.dustTitCarbide));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotTunCarbide), EnumToItemStack.getItemIS(EnumDustsH.dustTunCarbide));
        RecipesGrinder.grinding().addGrinding(EnumToItemStack.getItemIS(EnumIngotsH.ingotTungsten), EnumToItemStack.getItemIS(EnumDustsH.dustTungsten));

    }
}