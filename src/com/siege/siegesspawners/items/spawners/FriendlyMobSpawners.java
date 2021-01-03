package com.siege.siegesspawners.items.spawners;

import com.siege.siegesspawners.items.condenseditems.CondensedFriendlyMobItems;
import com.siege.siegesspawners.items.supercondenseditems.SuperCondensedFriendlyMobItems;
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
        snowManSpawnerRecipe();
        sheepSpawnerRecipe();
        pigSpawnerRecipe();
        horseSpawnerRecipe();
        squidSpawnerRecipe();
        chickenSpawnerRecipe();
        villagerSpawnerRecipe();
    }

    public static ItemStack itemCreator(Material material, int amount, EntityType entityType, String displayName) {
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

    private static void ironGolemSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.IRON_GOLEM,"§6Iron Golem Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("iron_golem_spawner"), item);
        recipe.shape("III","IBI","III");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedIronBlock));
        recipe.setIngredient('B',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void cowSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.COW,"§6Cow Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("cow_spawner"), item);
        recipe.shape("LLL","BIB","BBB");
        recipe.setIngredient('L',  new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedLeather));
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedBeef));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void snowManSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.SNOWMAN,"§6Snowman Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("snowman_spawner"), item);
        recipe.shape("CCC","BIB","BBB");
        recipe.setIngredient('C',  new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedCarvedPumpkin));
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedSnowBlock));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void sheepSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.SHEEP,"§6Sheep Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("sheep_spawner"), item);
        recipe.shape("WWW","MIM","MMM");
        recipe.setIngredient('W',  new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedWhiteWool));
        recipe.setIngredient('M', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedMutton));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void pigSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.PIG,"§6Pig Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("pig_spawner"), item);
        recipe.shape("PPP","PIP","PPP");
        recipe.setIngredient('P', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedPorkChop));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void horseSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.HORSE,"§6Horse Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("horse_spawner"), item);
        recipe.shape("LLL","LIL","LLL");
        recipe.setIngredient('L', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedLeather));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void squidSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.SQUID,"§6Squid Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("squid_spawner"), item);
        recipe.shape("SSS","SIS","SSS");
        recipe.setIngredient('S', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedInkSac));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void chickenSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.CHICKEN,"§6Chicken Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("chicken_spawner"), item);
        recipe.shape("FFF","CIC","CCC");
        recipe.setIngredient('F', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedFeather));
        recipe.setIngredient('C', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedChicken));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void villagerSpawnerRecipe() {
        ItemStack item = itemCreator(Material.SPAWNER,1,EntityType.VILLAGER,"§6Villager Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("villager_spawner"), item);
        recipe.shape(" E ","EIE"," E ");
        recipe.setIngredient('E', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedEmeraldBlock));
        recipe.setIngredient('I',Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }
}
