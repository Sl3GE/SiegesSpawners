package com.siege.siegesspawners.items.supercondenseditems;

import com.siege.siegesspawners.items.condenseditems.CondensedFriendlyMobItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class SuperCondensedFriendlyMobItems {
    public static ItemStack superCondensedLeather;
    public static ItemStack superCondensedBeef;
    public static ItemStack superCondensedCarvedPumpkin;
    public static ItemStack superCondensedSnowBlock;
    public static ItemStack superCondensedWhiteWool;
    public static ItemStack superCondensedMutton;
    public static ItemStack superCondensedPorkChop;

    public static void init() {
        createSuperCondensedCowDrops();
        createSuperCondensedSnowmanDrops();
        superCreateCondensedSheepDrops();
        createSuperCondensedPorkChop();
    }

    private static void createSuperCondensedCowDrops() {
        ItemStack item = new ItemStack(Material.LEATHER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§1Super Condensed Leather");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        superCondensedLeather = item;

        item = new ItemStack(Material.BEEF, 1);
        meta = item.getItemMeta();
        meta.setDisplayName("§1Super Condensed Beef");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        superCondensedBeef = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_leather"), superCondensedLeather);
        recipe.shape("LLL","LLL","LLL");
        recipe.setIngredient('L', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedLeather));
        Bukkit.getServer().addRecipe(recipe);

        recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_beef"), superCondensedBeef);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedBeef));
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createSuperCondensedSnowmanDrops() {
        ItemStack item = new ItemStack(Material.CARVED_PUMPKIN, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§1Super Condensed Carved Pumpkin");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        superCondensedCarvedPumpkin = item;

        item = new ItemStack(Material.SNOW_BLOCK, 1);
        meta = item.getItemMeta();
        meta.setDisplayName("§1Super Condensed Snow Block");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        superCondensedSnowBlock = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_carved_pumpkin"), superCondensedCarvedPumpkin);
        recipe.shape("CCC","CCC","CCC");
        recipe.setIngredient('C', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedCarvedPumpkin));
        Bukkit.getServer().addRecipe(recipe);

        recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_snow_block"), superCondensedSnowBlock);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedSnowBlock));
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void superCreateCondensedSheepDrops() {
        ItemStack item = new ItemStack(Material.WHITE_WOOL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§1Condensed White Wool");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        superCondensedWhiteWool = item;

        item = new ItemStack(Material.MUTTON, 1);
        meta = item.getItemMeta();
        meta.setDisplayName("§1Condensed Mutton");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        superCondensedMutton = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_white_wool"), superCondensedWhiteWool);
        recipe.shape("WWW","WWW","WWW");
        recipe.setIngredient('W', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedWhiteWool));
        Bukkit.getServer().addRecipe(recipe);

        recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_mutton"), superCondensedMutton);
        recipe.shape("MMM","MMM","MMM");
        recipe.setIngredient('M', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedMutton));
        Bukkit.getServer().addRecipe(recipe);
    }
    private static void createSuperCondensedPorkChop() {
        ItemStack item = new ItemStack(Material.PORKCHOP, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§1Super Condensed Porkchop");
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        superCondensedPorkChop = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_porkchop"), superCondensedPorkChop);
        recipe.shape("PPP","PPP","PPP");
        recipe.setIngredient('P', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedPorkChop));
        Bukkit.addRecipe(recipe);
    }
}
