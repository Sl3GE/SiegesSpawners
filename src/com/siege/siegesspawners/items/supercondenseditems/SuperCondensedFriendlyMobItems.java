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
    public static ItemStack superCondensedInkSac;
    public static ItemStack superCondensedChicken;
    public static ItemStack superCondensedFeather;

    public static void init() {
        createSuperCondensedCowDrops();
        createSuperCondensedSnowmanDrops();
        superCreateCondensedSheepDrops();
        createSuperCondensedPorkChop();
        createSuperCondensedInkSac();
        superCreateCondensedChickenDrops();
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

    private static void createSuperCondensedCowDrops() {
        superCondensedLeather = createItem(Material.LEATHER,1,"§1Super Condensed Leather");
        superCondensedBeef = createItem(Material.BEEF,1,"§1Super Condensed Beef");

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
        superCondensedCarvedPumpkin = createItem(Material.CARVED_PUMPKIN,1,"§1Super Condensed Carved Pumpkin");
        superCondensedSnowBlock = createItem(Material.SNOW_BLOCK,1,"§1Super Condensed Snow Block");

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
        superCondensedWhiteWool = createItem(Material.WHITE_WOOL,1,"§1Super Condensed White Wool");
        superCondensedMutton = createItem(Material.MUTTON,1,"§1Super Condensed Mutton");

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
        superCondensedPorkChop = createItem(Material.PORKCHOP,1,"§1Super Condensed Porkchop");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_porkchop"), superCondensedPorkChop);
        recipe.shape("PPP","PPP","PPP");
        recipe.setIngredient('P', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedPorkChop));
        Bukkit.addRecipe(recipe);
    }

    private static void createSuperCondensedInkSac() {
        superCondensedInkSac = createItem(Material.INK_SAC,1,"§1Super Condensed Ink Sac");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_ink_sac"), superCondensedInkSac);
        recipe.shape("III","III","III");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedInkSac));
        Bukkit.addRecipe(recipe);
    }

    private static void superCreateCondensedChickenDrops() {
        superCondensedChicken = createItem(Material.CHICKEN,1,"§1Super Condensed Chicken");
        superCondensedFeather = createItem(Material.FEATHER,1,"§1Super Condensed Feather");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_chicken"), superCondensedChicken);
        recipe.shape("CCC","CCC","CCC");
        recipe.setIngredient('C', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedChicken));
        Bukkit.getServer().addRecipe(recipe);

        recipe = new ShapedRecipe(NamespacedKey.minecraft("super_condensed_feather"), superCondensedFeather);
        recipe.shape("FFF","FFF","FFF");
        recipe.setIngredient('F', new RecipeChoice.ExactChoice(CondensedFriendlyMobItems.condensedFeather));
        Bukkit.getServer().addRecipe(recipe);
    }
}
