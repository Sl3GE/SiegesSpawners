package com.siege.craftablespawners.items.supercondenseditems;

import com.siege.craftablespawners.items.AbstractedCreationMethods;
import com.siege.craftablespawners.items.condenseditems.CondensedHostileMobItems;
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
    public static ItemStack superCondensedGunpowder;
    public static ItemStack superCondensedString;
    public static ItemStack superCondensedEnderPearl;
    public static ItemStack superCondensedMagmaCream;
    public static ItemStack superCondensedBlockOfRedstone;

    public static void init() {
        createSuperCondensedBone();
        createSuperCondensedRottenFlesh();
        createSuperCondensedBlazeRod();
        createSuperCondensedGunpowder();
        createSuperCondensedString();
        createSuperCondensedEnderPearl();
        createSuperCondensedMagmaCream();
        createSuperCondensedBlockOfRedstone();
    }

    private static void createSuperCondensedBone() {
        superCondensedBone = AbstractedCreationMethods.createItem(Material.BONE,1,"§1Super Condensed Bone");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_bone"), superCondensedBone);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedBone));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedRottenFlesh() {
        superCondensedRottenFlesh = AbstractedCreationMethods.createItem(Material.ROTTEN_FLESH,1,"§1Super Rotten Flesh");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_rotten_flesh"), superCondensedRottenFlesh);
        recipe.shape("FFF","FFF","FFF");
        recipe.setIngredient('F', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedRottenFlesh));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedBlazeRod() {
        superCondensedBlazeRod = AbstractedCreationMethods.createItem(Material.BLAZE_ROD,1,"§1Super Blaze Rod");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_blaze_rod"), superCondensedBlazeRod);
        recipe.shape("RRR","RRR","RRR");
        recipe.setIngredient('R', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedBlazeRod));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedGunpowder() {
        superCondensedGunpowder = AbstractedCreationMethods.createItem(Material.GUNPOWDER, 1, "§1Super Condensed Gunpowder");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_gunpowder"), superCondensedGunpowder);
        recipe.shape("GGG","GGG","GGG");
        recipe.setIngredient('G', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedGunpowder));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedString() {
        superCondensedString = AbstractedCreationMethods.createItem(Material.STRING, 1, "§1Super Condensed String");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_string"), superCondensedString);
        recipe.shape("SSS","SSS","SSS");
        recipe.setIngredient('S', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedString));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedEnderPearl() {
        superCondensedEnderPearl = AbstractedCreationMethods.createItem(Material.ENDER_PEARL, 1, "§1Super Condensed Ender Pearl");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_ender_pearl"), superCondensedEnderPearl);
        recipe.shape("EEE","EEE","EEE");
        recipe.setIngredient('E', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedEnderPearl));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedMagmaCream() {
        superCondensedMagmaCream = AbstractedCreationMethods.createItem(Material.MAGMA_CREAM, 1, "§1Super Condensed Magma Cream");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_magma_cream"), superCondensedMagmaCream);
        recipe.shape("MMM","MMM","MMM");
        recipe.setIngredient('M', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedMagmaCream));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedBlockOfRedstone() {
        superCondensedBlockOfRedstone = AbstractedCreationMethods.createItem(Material.REDSTONE_BLOCK, 1, "§1Super Condensed Block Of Redstone");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_block_of_redstone"), superCondensedBlockOfRedstone);
        recipe.shape("RRR","RRR","RRR");
        recipe.setIngredient('R', new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedBlockOfRedstone));
        Bukkit.addRecipe(recipe);
    }
}
