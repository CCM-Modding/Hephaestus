package ccm.hephaestus.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import ccm.hephaestus.enums.blocks.EnumOresH;
import ccm.hephaestus.enums.items.EnumDustsH;
import ccm.hephaestus.enums.items.EnumIngotsH;
import ccm.nucleum_omnium.utils.helper.enums.EnumToItemStack;

final class RecipesSmelting {

    public RecipesSmelting() {

        FurnaceRecipes.smelting().addSmelting(EnumOresH.oreAluminum.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotAluminum), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOresH.oreCopper.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotCopper), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOresH.oreLead.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotLead), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOresH.oreSilver.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotSilver), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOresH.oreTin.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotTin), 1.0F);

        FurnaceRecipes.smelting().addSmelting(EnumDustsH.dustGold.ordinal(), new ItemStack(Item.ingotGold), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDustsH.dustIron.ordinal(), new ItemStack(Item.ingotIron), 0.0F);

        FurnaceRecipes.smelting().addSmelting(EnumDustsH.dustAluminum.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotAluminum), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDustsH.dustBronze.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotBronze), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDustsH.dustCopper.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotCopper), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDustsH.dustHeavyIron.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotHeavyIron), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDustsH.dustLead.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotLead), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDustsH.dustSilver.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotSilver), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDustsH.dustSteel.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotSteel), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDustsH.dustTin.ordinal(), EnumToItemStack.getItemIS(EnumIngotsH.ingotTin), 0.0F);
    }
}