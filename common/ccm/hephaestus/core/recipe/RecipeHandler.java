package ccm.hephaestus.core.recipe;

import java.util.Arrays;
import java.util.List;

public final class RecipeHandler {

    private static List<String> toDelete = Arrays.asList(new String[] {/*
                                                                        * Integer.
                                                                        * toString
                                                                        * (Item.
                                                                        * axeIron
                                                                        * .
                                                                        * itemID
                                                                        * ),
                                                                        * Integer
                                                                        * .
                                                                        * toString
                                                                        * (Item.
                                                                        * hoeIron
                                                                        * .
                                                                        * itemID
                                                                        * ),
                                                                        * Integer
                                                                        * .
                                                                        * toString
                                                                        * (Item.
                                                                        * shovelIron
                                                                        * .
                                                                        * itemID
                                                                        * ),
                                                                        * Integer
                                                                        * .
                                                                        * toString
                                                                        * (Item.
                                                                        * pickaxeIron
                                                                        * .
                                                                        * itemID
                                                                        * ),
                                                                        * Integer
                                                                        * .
                                                                        * toString
                                                                        * (Item.
                                                                        * swordIron
                                                                        * .
                                                                        * itemID
                                                                        * ),
                                                                        * Integer
                                                                        * .
                                                                        * toString
                                                                        * (Item.
                                                                        * axeGold
                                                                        * .
                                                                        * itemID
                                                                        * ),
                                                                        * Integer
                                                                        * .
                                                                        * toString
                                                                        * (Item.
                                                                        * hoeGold
                                                                        * .
                                                                        * itemID
                                                                        * ),
                                                                        * Integer
                                                                        * .
                                                                        * toString
                                                                        * (Item.
                                                                        * shovelGold
                                                                        * .
                                                                        * itemID
                                                                        * ),
                                                                        * Integer
                                                                        * .
                                                                        * toString
                                                                        * (Item.
                                                                        * pickaxeGold
                                                                        * .
                                                                        * itemID
                                                                        * ),
                                                                        * Integer
                                                                        * .
                                                                        * toString
                                                                        * (Item.
                                                                        * swordGold
                                                                        * .
                                                                        * itemID
                                                                        * )
                                                                        */
    });

    /**
     * Initializes all the methods that handle Recipes.
     */
    public static void init() {
        RecipesRemover.delete(toDelete);
        new RecipesSetGrinder();
        new RecipesSetBlast();
        new RecipesCrafting();
        new RecipesCraftingArmor();
        new RecipesCraftingBlocks();
        new RecipesCraftingTools();
        new RecipesSmelting();
    }
}