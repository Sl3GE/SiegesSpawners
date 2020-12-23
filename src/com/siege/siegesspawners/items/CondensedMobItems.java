package com.siege.siegesspawners.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class CondensedMobItems {
    public static ItemStack condensedIronBlock;

    public static void init() {
        createCondensedIronBlock();
    }

    private static void createCondensedIronBlock() {
        ItemStack item = new ItemStack(Material.IRON_BLOCK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Condensed Iron Block");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        condensedIronBlock = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_iron_block"), condensedIronBlock);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', Material.IRON_BLOCK);
        Bukkit.getServer().addRecipe(recipe);
    }

}
