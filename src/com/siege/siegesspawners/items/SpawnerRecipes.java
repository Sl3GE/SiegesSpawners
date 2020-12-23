package com.siege.siegesspawners.items;

import org.bukkit.*;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class SpawnerRecipes {
    public static void init() {
        ironGolemSpawnerRecipe();
        cowSpawnerRecipe();
    }

    private static void ironGolemSpawnerRecipe() {
        /*
        Get item meta
        Cast to blockstatemeta
        Get blockstate
        Cast to creaturespawner
        Set entitytype
        Blockstatemeta set modified blockstate
        Itemstack set modified itemmeta

        Hope that this helps. For further information use spigot api doc as reference.
         */
        ItemStack item = new ItemStack(Material.SPAWNER,1);
        ItemMeta meta = item.getItemMeta();
        BlockStateMeta blockStateMeta = (BlockStateMeta) meta;
        BlockState blockState = blockStateMeta.getBlockState();
        CreatureSpawner creatureSpawner = (CreatureSpawner) blockState;
        creatureSpawner.setSpawnedType(EntityType.IRON_GOLEM);
        blockState = (BlockState) creatureSpawner;
        blockStateMeta.setBlockState(blockState);
        meta = (ItemMeta) blockStateMeta;
        meta.setDisplayName("§6Iron Golem Spawner");
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("iron_golem_spawner"), item);
        recipe.shape("III","IBI","III");
        recipe.setIngredient('I', CondensedMobItems.condensedIronBlock.getType());
        recipe.setIngredient('B',Material.IRON_BARS);
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void cowSpawnerRecipe() {
        ItemStack item = new ItemStack(Material.SPAWNER,1);
        ItemMeta meta = item.getItemMeta();
        BlockStateMeta blockStateMeta = (BlockStateMeta) meta;
        BlockState blockState = blockStateMeta.getBlockState();
        CreatureSpawner creatureSpawner = (CreatureSpawner) blockState;
        creatureSpawner.setSpawnedType(EntityType.COW);
        blockState = (BlockState) creatureSpawner;
        blockStateMeta.setBlockState(blockState);
        meta = (ItemMeta) blockStateMeta;
        meta.setDisplayName("§6Cow Spawner");
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("cow_spawner"), item);
        recipe.shape("LLL","LIB","BBB");
        recipe.setIngredient('L', CondensedAnimalItems.condensedLeather.getType());
        recipe.setIngredient('B', CondensedAnimalItems.condensedBeef.getType());
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.getServer().addRecipe(recipe);
    }
}
