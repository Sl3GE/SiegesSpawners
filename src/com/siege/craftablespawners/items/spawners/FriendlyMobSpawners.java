package com.siege.craftablespawners.items.spawners;

import com.siege.craftablespawners.items.AbstractedCreationMethods;
import com.siege.craftablespawners.items.condenseditems.CondensedFriendlyMobItems;
import com.siege.craftablespawners.items.supercondenseditems.SuperCondensedFriendlyMobItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import java.util.HashMap;

public class FriendlyMobSpawners {

    private static ItemStack ironGolemSpawner;
    private static ItemStack cowSpawner;
    private static ItemStack snowManSpawner;
    private static ItemStack sheepSpawner;
    private static ItemStack pigSpawner;
    private static ItemStack horseSpawner;
    private static ItemStack squidSpawner;
    private static ItemStack chickenSpawner;
    private static ItemStack villagerSpawner;
    private static HashMap<EntityType, ItemStack> friendlyEntityTypesMap;


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
        generateFriendlyEntityTypesMap();
    }

    public static void generateFriendlyEntityTypesMap() {
        friendlyEntityTypesMap = new HashMap<>();
        friendlyEntityTypesMap.put(EntityType.IRON_GOLEM, ironGolemSpawner);
        friendlyEntityTypesMap.put(EntityType.COW, cowSpawner);
        friendlyEntityTypesMap.put(EntityType.SNOWMAN, snowManSpawner);
        friendlyEntityTypesMap.put(EntityType.SHEEP, sheepSpawner);
        friendlyEntityTypesMap.put(EntityType.PIG, pigSpawner);
        friendlyEntityTypesMap.put(EntityType.HORSE, horseSpawner);
        friendlyEntityTypesMap.put(EntityType.SQUID, squidSpawner);
        friendlyEntityTypesMap.put(EntityType.CHICKEN, chickenSpawner);
        friendlyEntityTypesMap.put(EntityType.VILLAGER, villagerSpawner);
    }

    public static HashMap<EntityType, ItemStack> getFriendlyEntityTypesMap() {
        return friendlyEntityTypesMap;
    }

    private static void ironGolemSpawnerRecipe() {
        ironGolemSpawner = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER, 1, EntityType.IRON_GOLEM, "§6Iron Golem Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("iron_golem_spawner"), ironGolemSpawner);
        recipe.shape("III", "IBI", "III");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedIronBlock));
        recipe.setIngredient('B', Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void cowSpawnerRecipe() {
        cowSpawner = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER, 1, EntityType.COW, "§6Cow Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("cow_spawner"), cowSpawner);
        recipe.shape("LLL", "BIB", "BBB");
        recipe.setIngredient('L', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedLeather));
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedBeef));
        recipe.setIngredient('I', Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void snowManSpawnerRecipe() {
        snowManSpawner = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER, 1, EntityType.SNOWMAN, "§6Snowman Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("snowman_spawner"), snowManSpawner);
        recipe.shape("CCC", "BIB", "BBB");
        recipe.setIngredient('C', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedCarvedPumpkin));
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedSnowBlock));
        recipe.setIngredient('I', Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void sheepSpawnerRecipe() {
        sheepSpawner = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER, 1, EntityType.SHEEP, "§6Sheep Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("sheep_spawner"), sheepSpawner);
        recipe.shape("WWW", "MIM", "MMM");
        recipe.setIngredient('W', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedWhiteWool));
        recipe.setIngredient('M', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedMutton));
        recipe.setIngredient('I', Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void pigSpawnerRecipe() {
        pigSpawner = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER, 1, EntityType.PIG, "§6Pig Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("pig_spawner"), pigSpawner);
        recipe.shape("PPP", "PIP", "PPP");
        recipe.setIngredient('P', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedPorkChop));
        recipe.setIngredient('I', Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void horseSpawnerRecipe() {
        horseSpawner = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER, 1, EntityType.HORSE, "§6Horse Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("horse_spawner"), horseSpawner);
        recipe.shape("LLL", "LIL", "LLL");
        recipe.setIngredient('L', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedLeather));
        recipe.setIngredient('I', Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void squidSpawnerRecipe() {
        squidSpawner = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER, 1, EntityType.SQUID, "§6Squid Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("squid_spawner"), squidSpawner);
        recipe.shape("SSS", "SIS", "SSS");
        recipe.setIngredient('S', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedInkSac));
        recipe.setIngredient('I', Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void chickenSpawnerRecipe() {
        chickenSpawner = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER, 1, EntityType.CHICKEN, "§6Chicken Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("chicken_spawner"), chickenSpawner);
        recipe.shape("FFF", "CIC", "CCC");
        recipe.setIngredient('F', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedFeather));
        recipe.setIngredient('C', new RecipeChoice.ExactChoice(SuperCondensedFriendlyMobItems.superCondensedChicken));
        recipe.setIngredient('I', Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }

    private static void villagerSpawnerRecipe() {
        villagerSpawner = AbstractedCreationMethods.itemSpawnerCreator(Material.SPAWNER, 1, EntityType.VILLAGER, "§6Villager Spawner");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("villager_spawner"), villagerSpawner);
        recipe.shape(" E ", "EIE", " E ");
        recipe.setIngredient('E', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedEmeraldBlock));
        recipe.setIngredient('I', Material.IRON_BARS);
        Bukkit.addRecipe(recipe);
    }
}
