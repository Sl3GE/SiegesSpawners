package com.siege.siegesspawners.items.spawners;

import com.siege.siegesspawners.items.condenseditems.CondensedHostileMobItems;
import com.siege.siegesspawners.items.supercondenseditems.SuperCondensedHostileMobItems;
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
    }
    private static ItemStack itemCreator(Material material, int amount, EntityType entityType, String displayName) {
        /*
        Get item meta from item
        Cast item meta to blockstatemeta
        Get blockstate from blockstatemeta
        Cast blockstate to creaturespawner
        Set entitytype of creaturespawner
        Cast modified creaturespawner to blockstate
        Blockstatemeta set modified blockstate
        Cast blockstatemeta to item meta
        Itemstack set modified item meta
         */
        ItemStack item = new ItemStack(material,amount);
        ItemMeta meta = item.getItemMeta();
        BlockStateMeta blockStateMeta = (BlockStateMeta) meta;
        BlockState blockState = blockStateMeta.getBlockState();
        CreatureSpawner creatureSpawner = (CreatureSpawner) blockState;
        creatureSpawner.setSpawnedType(entityType);
        blockState = (BlockState) creatureSpawner;
        blockStateMeta.setBlockState(blockState);
        meta = (ItemMeta) blockStateMeta;
        meta.setDisplayName(displayName);
        item.setItemMeta(meta);
        return item;
    }

    private static void skeletonSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.SKELETON,"§6Skeleton Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("skeleton_spawner"), item);
        recipe.shape("BBB","BIB","BBB");
        recipe.setIngredient('B',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedBone));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void zombieSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.ZOMBIE,"§6Zombie Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("zombie_spawner"), item);
        recipe.shape("FFF","FIF","FFF");
        recipe.setIngredient('F',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedRottenFlesh));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void blazeSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.BLAZE,"§6Blaze Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("blaze_spawner"), item);
        recipe.shape("RRR","RIR","RRR");
        recipe.setIngredient('R',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedBlazeRod));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void creeperSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.CREEPER,"§6Creeper Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("creeper_spawner"), item);
        recipe.shape("GGG","GIG","GGG");
        recipe.setIngredient('G',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedGunpowder));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void spiderSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.SPIDER,"§6Spider Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("spider_spawner"), item);
        recipe.shape("SSS","SIS","SSS");
        recipe.setIngredient('S',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedString));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void endermanSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.ENDERMAN,"§6Enderman Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("enderman_spawner"), item);
        recipe.shape("EEE","EIE","EEE");
        recipe.setIngredient('E',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedEnderPearl));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void slimeSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.SLIME,"§6Slime Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("slime_spawner"), item);
        recipe.shape("SSS","SIS","SSS");
        recipe.setIngredient('S',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedSlimeBlock));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void magmaCubeSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.MAGMA_CUBE,"§6Magma Cube Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("magma_cube_spawner"), item);
        recipe.shape("MMM","MIM","MMM");
        recipe.setIngredient('M',  new RecipeChoice.ExactChoice(SuperCondensedHostileMobItems.superCondensedMagmaCream));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void ghastSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.GHAST,"§6Ghast Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("ghast_spawner"), item);
        recipe.shape("GGG","GIG","GGG");
        recipe.setIngredient('G',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedGhastTear));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void zombifiedPiglinSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.ZOMBIFIED_PIGLIN,"§6Zombified Piglin Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("zombie_piglin_spawner"), item);
        recipe.shape("GGG","GIG","GGG");
        recipe.setIngredient('G',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedGoldBlock));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }
}
