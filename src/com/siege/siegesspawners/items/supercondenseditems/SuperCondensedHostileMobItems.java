package com.siege.siegesspawners.items.supercondenseditems;

import com.siege.siegesspawners.items.condenseditems.CondensedHostileMobItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class SuperCondensedHostileMobItems {

    public static ItemStack superCondensedBone;
    public static ItemStack superCondensedRottenFlesh;
    public static ItemStack superCondensedBlazeRod;

    public static void init() {
        createSuperCondensedBone();
        createSuperCondensedRottenFlesh();
        createSuperCondensedBlazeRod();
    }

    private static void createSuperCondensedBone() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§1Super Condensed Bone");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        superCondensedBone = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_bone"), superCondensedBone);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedBone));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedRottenFlesh() {
        ItemStack item = new ItemStack(Material.ROTTEN_FLESH, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§1Super Condensed Rotten Flesh");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        superCondensedRottenFlesh = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_rotten_flesh"), superCondensedRottenFlesh);
        recipe.shape("FFF","FFF","FFF");
        recipe.setIngredient('F', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedRottenFlesh));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedBlazeRod() {
        ItemStack item = new ItemStack(Material.BLAZE_ROD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§1Super Condensed Blaze Rod");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        superCondensedBlazeRod = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_blaze_rod"), superCondensedBlazeRod);
        recipe.shape("RRR","RRR","RRR");
        recipe.setIngredient('R', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedBlazeRod));
        Bukkit.addRecipe(recipe);
    }
}
