package ccm.hephaestus.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import ccm.hephaestus.core.handlers.EHandler;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;

final class RecipesSmelting {

    public static void init() {

        FurnaceRecipes.smelting().addSmelting((EnumOres.oreAluminum.ordinal()), EHandler.getItem(EnumIngots.ingotAluminum), 1.0F);
        FurnaceRecipes.smelting().addSmelting((EnumOres.oreCopper.ordinal()), EHandler.getItem(EnumIngots.ingotCopper), 1.0F);
        FurnaceRecipes.smelting().addSmelting((EnumOres.oreLead.ordinal()), EHandler.getItem(EnumIngots.ingotLead), 1.0F);
        FurnaceRecipes.smelting().addSmelting((EnumOres.oreSilver.ordinal()), EHandler.getItem(EnumIngots.ingotSilver), 1.0F);
        FurnaceRecipes.smelting().addSmelting((EnumOres.oreTin.ordinal()), EHandler.getItem(EnumIngots.ingotTin), 1.0F);

        FurnaceRecipes.smelting().addSmelting((EnumDusts.dustGold.ordinal()), new ItemStack(Item.ingotGold), 0.0F);
        FurnaceRecipes.smelting().addSmelting((EnumDusts.dustIron.ordinal()), new ItemStack(Item.ingotIron), 0.0F);
        
        FurnaceRecipes.smelting().addSmelting((EnumDusts.dustAluminum.ordinal()), EHandler.getItem(EnumIngots.ingotAluminum), 0.0F);
        FurnaceRecipes.smelting().addSmelting((EnumDusts.dustBronze.ordinal()), EHandler.getItem(EnumIngots.ingotBronze), 0.0F);
        FurnaceRecipes.smelting().addSmelting((EnumDusts.dustCopper.ordinal()), EHandler.getItem(EnumIngots.ingotCopper), 0.0F);
        FurnaceRecipes.smelting().addSmelting((EnumDusts.dustHeavyIron.ordinal()), EHandler.getItem(EnumIngots.ingotHeavyIron), 0.0F);
        FurnaceRecipes.smelting().addSmelting((EnumDusts.dustLead.ordinal()), EHandler.getItem(EnumIngots.ingotLead), 0.0F);
        FurnaceRecipes.smelting().addSmelting((EnumDusts.dustSilver.ordinal()), EHandler.getItem(EnumIngots.ingotSilver), 0.0F);
        FurnaceRecipes.smelting().addSmelting((EnumDusts.dustSteel.ordinal()), EHandler.getItem(EnumIngots.ingotSteel), 0.0F);
        FurnaceRecipes.smelting().addSmelting((EnumDusts.dustTin.ordinal()), EHandler.getItem(EnumIngots.ingotTin), 0.0F);
    }
}