package com.siege.siegesspawners.items.condenseditems;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

public class CondensedHostileMobItems {
    public static ItemStack condensedBone;
    public static ItemStack condensedRottenFlesh;
    public static ItemStack condensedBlazeRod;
    public static ItemStack condensedGunpowder;
    public static ItemStack condensedString;

    public static void init() {
        createCondensedBone();
        createCondensedRottenFlesh();
        createCondensedBlazeRod();
        createCondensedGunpowder();
        createCondensedString();
    }

    private static ItemStack createItem(Material material, int amount, String displayName) {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(displayName);
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    private static void createCondensedBone() {
        condensedBone = createItem(Material.BONE, 1, "§2Condensed Bone");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_bone"), condensedBone);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BONE,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedRottenFlesh() {
        condensedRottenFlesh = createItem(Material.BONE, 1, "§2Condensed Rotten Flesh");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_rotten_flesh"), condensedRottenFlesh);
        recipe.shape("FFF","FFF","FFF");
        recipe.setIngredient('F', new RecipeChoice.ExactChoice(new ItemStack(Material.ROTTEN_FLESH,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedBlazeRod() {
        condensedBlazeRod = createItem(Material.BLAZE_ROD, 1, "§2Condensed Blaze Rod");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_blaze_rod"), condensedBlazeRod);
        recipe.shape("RRR","RRR","RRR");
        recipe.setIngredient('R', new RecipeChoice.ExactChoice(new ItemStack(Material.BLAZE_ROD,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedGunpowder() {
        condensedGunpowder = createItem(Material.GUNPOWDER, 1, "§2Condensed Gunpowder");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_gunpowder"), condensedGunpowder);
        recipe.shape("GGG","GGG","GGG");
        recipe.setIngredient('G', new RecipeChoice.ExactChoice(new ItemStack(Material.GUNPOWDER,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedString() {
        condensedString = createItem(Material.STRING, 1, "§2Condensed String");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_string"), condensedString);
        recipe.shape("SSS","SSS","SSS");
        recipe.setIngredient('S', new RecipeChoice.ExactChoice(new ItemStack(Material.STRING,1)));
        Bukkit.addRecipe(recipe);
    }
}
