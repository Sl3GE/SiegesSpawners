package com.siege.craftablespawners.items.spawners;

import com.siege.craftablespawners.items.AbstractedCreationMethods;
import com.siege.craftablespawners.items.condenseditems.CondensedHostileMobItems;
import com.siege.craftablespawners.items.supercondenseditems.SuperCondensedHostileMobItems;
import org.bukkit.*;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class HostileMobSpawners {
    public static void init() {
        skeletonSpawnerRecipe();
        zombieSpawnerRecipe();
        blazeSpawnerRecipe();
        creeperSpawnerRecipe();
        spiderSpawnerRecipe();
        endermanSpawnerRecipe();
        slimeSpawnerRecipe();
        magmaCubeSpawnerRecipe();
        ghastSpawnerRecipe();
        zombifiedPiglinSpawnerRecipe();
        netherStarSpawnerRecipe();
        witherSkeletonSpawnerRecipe();
        witchSpawnerRecipe();
    }


    private static void skeletonSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.SKELETON,"§6Skeleton Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("skeleton_spawner"), item);
        recipe.shape("BBB","BIB","BBB");
        recipe.setIngredient('B',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedBone));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void zombieSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.ZOMBIE,"§6Zombie Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("zombie_spawner"), item);
        recipe.shape("FFF","FIF","FFF");
        recipe.setIngredient('F',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedRottenFlesh));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void blazeSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.BLAZE,"§6Blaze Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("blaze_spawner"), item);
        recipe.shape("RRR","RIR","RRR");
        recipe.setIngredient('R',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedBlazeRod));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void creeperSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.CREEPER,"§6Creeper Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("creeper_spawner"), item);
        recipe.shape("GGG","GIG","GGG");
        recipe.setIngredient('G',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedGunpowder));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void spiderSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.SPIDER,"§6Spider Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("spider_spawner"), item);
        recipe.shape("SSS","SIS","SSS");
        recipe.setIngredient('S',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedString));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void endermanSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.ENDERMAN,"§6Enderman Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("enderman_spawner"), item);
        recipe.shape("EEE","EIE","EEE");
        recipe.setIngredient('E',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedEnderPearl));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void slimeSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.SLIME,"§6Slime Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("slime_spawner"), item);
        recipe.shape("SSS","SIS","SSS");
        recipe.setIngredient('S',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedSlimeBlock));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void magmaCubeSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.MAGMA_CUBE,"§6Magma Cube Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("magma_cube_spawner"), item);
        recipe.shape("MMM","MIM","MMM");
        recipe.setIngredient('M',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedMagmaCream));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void ghastSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.GHAST,"§6Ghast Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("ghast_spawner"), item);
        recipe.shape("GGG","GIG","GGG");
        recipe.setIngredient('G',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedGhastTear));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void zombifiedPiglinSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.ZOMBIFIED_PIGLIN,"§6Zombified Piglin Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("zombie_piglin_spawner"), item);
        recipe.shape("GGG","GIG","GGG");
        recipe.setIngredient('G',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedGoldBlock));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void netherStarSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.WITHER,"§6Wither Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("wither_spawner"), item);
        recipe.shape("NNN","NIN","NNN");
        recipe.setIngredient('N',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedNetherStar));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void witherSkeletonSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.WITHER_SKELETON,"§6Wither Skeleton Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("wither_skeleton_spawner"), item);
        recipe.shape("WWW","WIW","WWW");
        recipe.setIngredient('W',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedWitherSkeletonSkull));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void witchSpawnerRecipe() {
        ItemStack item = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER,1,EntityType.WITCH,"§6Witch Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("witch_spawner"), item);
        recipe.shape("GRG","RIR","GRG");
        recipe.setIngredient('G',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedGunpowder));
        recipe.setIngredient('R',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedBlockOfRedstone));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }
}
