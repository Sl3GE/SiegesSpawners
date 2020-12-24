package com.siege.siegesspawners.items.spawners;

import com.siege.siegesspawners.items.condenseditems.CondensedHostileMobItems;
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
    }

    private static void skeletonSpawnerRecipe() {
        ItemStack item = new ItemStack(Material.SPAWNER,1);
        ItemMeta meta = item.getItemMeta();
        BlockStateMeta blockStateMeta = (BlockStateMeta) meta;
        BlockState blockState = blockStateMeta.getBlockState();
        CreatureSpawner creatureSpawner = (CreatureSpawner) blockState;
        creatureSpawner.setSpawnedType(EntityType.SKELETON);
        blockState = (BlockState) creatureSpawner;
        blockStateMeta.setBlockState(blockState);
        meta = (ItemMeta) blockStateMeta;
        meta.setDisplayName("§6Skeleton Spawner");
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("skeleton_spawner"), item);
        recipe.shape("BBB","BIB","BBB");
        recipe.setIngredient('B',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedBone));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void zombieSpawnerRecipe() {
        ItemStack item = new ItemStack(Material.SPAWNER,1);
        ItemMeta meta = item.getItemMeta();
        BlockStateMeta blockStateMeta = (BlockStateMeta) meta;
        BlockState blockState = blockStateMeta.getBlockState();
        CreatureSpawner creatureSpawner = (CreatureSpawner) blockState;
        creatureSpawner.setSpawnedType(EntityType.ZOMBIE);
        blockState = (BlockState) creatureSpawner;
        blockStateMeta.setBlockState(blockState);
        meta = (ItemMeta) blockStateMeta;
        meta.setDisplayName("§6Zombie Spawner");
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("zombie_spawner"), item);
        recipe.shape("FFF","FIF","FFF");
        recipe.setIngredient('F',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedRottenFlesh));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void blazeSpawnerRecipe() {
        ItemStack item = new ItemStack(Material.SPAWNER,1);
        ItemMeta meta = item.getItemMeta();
        BlockStateMeta blockStateMeta = (BlockStateMeta) meta;
        BlockState blockState = blockStateMeta.getBlockState();
        CreatureSpawner creatureSpawner = (CreatureSpawner) blockState;
        creatureSpawner.setSpawnedType(EntityType.BLAZE);
        blockState = (BlockState) creatureSpawner;
        blockStateMeta.setBlockState(blockState);
        meta = (ItemMeta) blockStateMeta;
        meta.setDisplayName("§6Blaze Spawner");
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("blaze_spawner"), item);
        recipe.shape("RRR","RIR","RRR");
        recipe.setIngredient('R',  new RecipeChoice.ExactChoice(CondensedHostileMobItems.condensedBlazeRod));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }
}
