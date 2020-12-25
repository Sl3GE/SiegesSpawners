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

    private static ItemStack createItem(Material material, int amount, String displayName) {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(displayName);
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    private static void createSuperCondensedBone() {
        superCondensedBone = createItem(Material.BONE,1,"§1Super Condensed Bone");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_bone"), superCondensedBone);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedBone));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedRottenFlesh() {
        superCondensedRottenFlesh = createItem(Material.ROTTEN_FLESH,1,"§1Super Rotten Flesh");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_rotten_flesh"), superCondensedRottenFlesh);
        recipe.shape("FFF","FFF","FFF");
        recipe.setIngredient('F', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedRottenFlesh));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedBlazeRod() {
        superCondensedBlazeRod = createItem(Material.BLAZE_ROD,1,"§1Super Blaze Rod");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_blaze_rod"), superCondensedBlazeRod);
        recipe.shape("RRR","RRR","RRR");
        recipe.setIngredient('R', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedBlazeRod));
        Bukkit.addRecipe(recipe);
    }
}
