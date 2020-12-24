package com.siege.siegesspawners.items.spawners;

import com.siege.siegesspawners.items.condenseditems.CondensedFriendlyMobItems;
import com.siege.siegesspawners.items.condenseditems.CondensedHostileMobItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class FriendlyMobSpawners {

    public static void init() {
        ironGolemSpawnerRecipe();
        cowSpawnerRecipe();
        SnowManSpawnerRecipe();
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
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedIronBlock));
        recipe.setIngredient('B',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
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
        recipe.setIngredient('L',  new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedLeather));
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedBeef));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void SnowManSpawnerRecipe() {
        ItemStack item = new ItemStack(Material.SPAWNER,1);
        ItemMeta meta = item.getItemMeta();
        BlockStateMeta blockStateMeta = (BlockStateMeta) meta;
        BlockState blockState = blockStateMeta.getBlockState();
        CreatureSpawner creatureSpawner = (CreatureSpawner) blockState;
        creatureSpawner.setSpawnedType(EntityType.SNOWMAN);
        blockState = (BlockState) creatureSpawner;
        blockStateMeta.setBlockState(blockState);
        meta = (ItemMeta) blockStateMeta;
        meta.setDisplayName("§6Snowman Spawner");
        item.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("snowman_spawner"), item);
        recipe.shape("CCC","BIB","BBB");
        recipe.setIngredient('C',  new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedCarvedPumpkin));
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedSnowBlock));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }
}
