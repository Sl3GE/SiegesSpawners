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

public class CondensedHostileMobItems {
    public static ItemStack condensedIronBlock;
    public static ItemStack condensedBone;

    public static void init() {
        createCondensedBone();
    }

    private static void createCondensedBone() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Condensed Bone");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        condensedBone = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_bone"), condensedBone);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BONE,1)));
        Bukkit.addRecipe(recipe);
    }
}