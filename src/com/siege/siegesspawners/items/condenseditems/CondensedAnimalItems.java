package com.siege.siegesspawners.items.condenseditems;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class CondensedAnimalItems {
    public static ItemStack condensedLeather;
    public static ItemStack condensedBeef;

    public static void init() {
        createCondensedCowDrops();
    }

    private static void createCondensedCowDrops() {
        ItemStack item = new ItemStack(Material.LEATHER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Condensed Leather");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        condensedLeather = item;

        item = new ItemStack(Material.BEEF, 1);
        meta = item.getItemMeta();
        meta.setDisplayName("§2Condensed Beef");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        condensedBeef = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_leather"), condensedLeather);
        recipe.shape("LLL","LLL","LLL");
        recipe.setIngredient('L', new RecipeChoice.ExactChoice(new ItemStack(Material.LEATHER,1)));
        Bukkit.getServer().addRecipe(recipe);

        recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_beef"), condensedBeef);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BEEF,1)));
        Bukkit.getServer().addRecipe(recipe);
    }

}
