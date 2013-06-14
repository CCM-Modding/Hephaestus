package ccm.hephaestus.core.recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import ccm.hephaestus.enums.EnumDusts;
import ccm.hephaestus.enums.EnumIngots;
import ccm.hephaestus.enums.EnumOres;
import ccm.nucleum_omnium.helper.enums.EnumHelper;

final class RecipesSmelting {

    public RecipesSmelting() {

        FurnaceRecipes.smelting().addSmelting(EnumOres.oreAluminum.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotAluminum), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOres.oreCopper.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotCopper), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOres.oreLead.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotLead), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOres.oreSilver.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotSilver), 1.0F);
        FurnaceRecipes.smelting().addSmelting(EnumOres.oreTin.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotTin), 1.0F);

        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustGold.ordinal(),
                new ItemStack(Item.ingotGold), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustIron.ordinal(),
                new ItemStack(Item.ingotIron), 0.0F);

        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustAluminum.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotAluminum), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustBronze.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotBronze), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustCopper.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotCopper), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustHeavyIron.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotHeavyIron), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustLead.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotLead), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustSilver.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotSilver), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustSteel.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotSteel), 0.0F);
        FurnaceRecipes.smelting().addSmelting(EnumDusts.dustTin.ordinal(),
                EnumHelper.getItemIS(EnumIngots.ingotTin), 0.0F);
    }
}