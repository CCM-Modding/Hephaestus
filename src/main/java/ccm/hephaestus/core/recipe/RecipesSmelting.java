package ccm.hephaestus.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import ccm.hephaestus.block.enums.EnumOresM;
import ccm.hephaestus.item.enums.EnumDust;
import ccm.hephaestus.item.enums.EnumIngot;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class RecipesSmelting {

    FurnaceRecipes furnace = FurnaceRecipes.smelting();

    public RecipesSmelting() {
        FurnaceRecipes.smelting().addSmelting(EnumOresM.oreAluminum.ordinal(), EnumToItemStack.getItemIS(EnumIngot.ingotAluminum), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOresM.oreCopper.ordinal(), EnumToItemStack.getItemIS(EnumIngot.ingotCopper), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOresM.oreSilver.ordinal(), EnumToItemStack.getItemIS(EnumIngot.ingotSilver), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOresM.oreTin.ordinal(), EnumToItemStack.getItemIS(EnumIngot.ingotTin), 1.0F);

        FurnaceRecipes.smelting().addSmelting(EnumDust.dustGold.ordinal(), new ItemStack(Item.ingotGold), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDust.dustIron.ordinal(), new ItemStack(Item.ingotIron), 0.0F);

        FurnaceRecipes.smelting().addSmelting(EnumDust.dustAluminum.ordinal(), EnumToItemStack.getItemIS(EnumIngot.ingotAluminum), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDust.dustBronze.ordinal(), EnumToItemStack.getItemIS(EnumIngot.ingotBronze), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDust.dustCopper.ordinal(), EnumToItemStack.getItemIS(EnumIngot.ingotCopper), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDust.dustSilver.ordinal(), EnumToItemStack.getItemIS(EnumIngot.ingotSilver), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDust.dustSteel.ordinal(), EnumToItemStack.getItemIS(EnumIngot.ingotSteel), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDust.dustTin.ordinal(), EnumToItemStack.getItemIS(EnumIngot.ingotTin), 0.0F);
    }
}