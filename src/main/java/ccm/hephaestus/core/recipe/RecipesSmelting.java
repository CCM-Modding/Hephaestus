package ccm.hephaestus.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.nucleum_omnium.helper.enums.EnumToItemStack;

final class RecipesSmelting {

    public RecipesSmelting() {

        FurnaceRecipes.smelting().addSmelting(EnumOres.oreAluminum.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotAluminum), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOres.oreCopper.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotCopper), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOres.oreLead.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotLead), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOres.oreSilver.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotSilver), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOres.oreTin.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotTin), 1.0F);

        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustGold.ordinal(), new ItemStack(Item.ingotGold), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustIron.ordinal(), new ItemStack(Item.ingotIron), 0.0F);

        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustAluminum.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotAluminum), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustBronze.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotBronze), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustCopper.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotCopper), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustHeavyIron.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotHeavyIron), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustLead.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotLead), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustSilver.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotSilver), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustSteel.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotSteel), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustTin.ordinal(), EnumToItemStack.getItemIS(EnumIngots.ingotTin), 0.0F);
    }
}