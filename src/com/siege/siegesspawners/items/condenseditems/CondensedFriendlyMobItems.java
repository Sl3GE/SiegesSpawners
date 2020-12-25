package com.siege.siegesspawners.items.condenseditems;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class CondensedFriendlyMobItems {
    public static ItemStack condensedIronBlock;
    public static ItemStack condensedLeather;
    public static ItemStack condensedBeef;
    public static ItemStack condensedCarvedPumpkin;
    public static ItemStack condensedSnowBlock;
    public static ItemStack condensedWhiteWool;
    public static ItemStack condensedMutton;
    public static ItemStack condensedPorkChop;
    public static ItemStack condensedInkSac;

    public static void init() {
        createCondensedCowDrops();
        createCondensedIronBlock();
        createCondensedSnowmanDrops();
        createCondensedSheepDrops();
        createCondensedPorkChop();
        createCondensedInkSac();
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

    private static void createCondensedIronBlock() {
        condensedIronBlock = createItem(Material.IRON_BLOCK,1,"§2Condensed Iron Block");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_iron_block"), condensedIronBlock);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_BLOCK,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedCowDrops() {
        condensedLeather = createItem(Material.LEATHER,1,"§2Condensed Leather");
        condensedBeef = createItem(Material.BEEF,1,"§2Condensed Beef");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_leather"), condensedLeather);
        recipe.shape("LLL","LLL","LLL");
        recipe.setIngredient('L', new RecipeChoice.ExactChoice(new ItemStack(Material.LEATHER,1)));
        Bukkit.getServer().addRecipe(recipe);

        recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_beef"), condensedBeef);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BEEF,1)));
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createCondensedSnowmanDrops() {
        condensedCarvedPumpkin = createItem(Material.CARVED_PUMPKIN,1,"§2Condensed Carved Pumpkin");
        condensedSnowBlock = createItem(Material.SNOW_BLOCK,1,"§2Condensed Snow Block");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_carved_pumpkin"), condensedCarvedPumpkin);
        recipe.shape("CCC","CCC","CCC");
        recipe.setIngredient('C', new RecipeChoice.ExactChoice(new ItemStack(Material.CARVED_PUMPKIN,1)));
        Bukkit.getServer().addRecipe(recipe);

        recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_snow_block"), condensedSnowBlock);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.SNOW_BLOCK,1)));
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createCondensedSheepDrops() {
        condensedWhiteWool = createItem(Material.WHITE_WOOL,1,"§2Condensed White Wool");
        condensedMutton = createItem(Material.MUTTON,1,"§2Condensed Mutton");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_white_wool"), condensedWhiteWool);
        recipe.shape("WWW","WWW","WWW");
        recipe.setIngredient('W', new RecipeChoice.ExactChoice(new ItemStack(Material.WHITE_WOOL,1)));
        Bukkit.getServer().addRecipe(recipe);

        recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_mutton"), condensedMutton);
        recipe.shape("MMM","MMM","MMM");
        recipe.setIngredient('M', new RecipeChoice.ExactChoice(new ItemStack(Material.MUTTON,1)));
        Bukkit.getServer().addRecipe(recipe);
    }

    private static void createCondensedPorkChop() {
        condensedPorkChop = createItem(Material.PORKCHOP,1,"§2Condensed Porkchop");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_porkchop"), condensedPorkChop);
        recipe.shape("PPP","PPP","PPP");
        recipe.setIngredient('P', new RecipeChoice.ExactChoice(new ItemStack(Material.PORKCHOP,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedInkSac() {
        condensedInkSac = createItem(Material.INK_SAC,1,"§2Condensed Ink Sac");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_ink_sac"), condensedInkSac);
        recipe.shape("III","III","III");
        recipe.setIngredient('I', new RecipeChoice.ExactChoice(new ItemStack(Material.INK_SAC,1)));
        Bukkit.addRecipe(recipe);
    }
}