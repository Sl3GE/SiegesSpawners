package com.siege.craftablespawners.items.condenseditems;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import com.siege.craftablespawners.items.AbstractedCreationMethods;

public class CondensedHostileMobItems {
    public static ItemStack condensedBone;
    public static ItemStack condensedRottenFlesh;
    public static ItemStack condensedBlazeRod;
    public static ItemStack condensedGunpowder;
    public static ItemStack condensedString;
    public static ItemStack condensedEnderPearl;
    public static ItemStack condensedSlimeBlock;
    public static ItemStack condensedMagmaCream;
    public static ItemStack condensedGhastTear;
    public static ItemStack condensedGoldBlock;
    public static ItemStack condensedNetherStar;
    public static ItemStack condensedWitherSkeletonSkull;
    public static ItemStack condensedBlockOfRedstone;

    public static void init() {
        createCondensedBone();
        createCondensedRottenFlesh();
        createCondensedBlazeRod();
        createCondensedGunpowder();
        createCondensedString();
        createCondensedEnderPearl();
        createCondensedSlimeBlock();
        createCondensedMagmaCream();
        createCondensedGhastTear();
        createCondensedGoldBlock();
        createCondensedNetherStar();
        createCondensedWitherSkeletonSkull();
        createCondensedBlockOfRedstone();
    }

    private static void createCondensedBone() {
        condensedBone = AbstractedCreationMethods.createItem(Material.BONE, 1, "§2Condensed Bone");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_bone"), condensedBone);
        recipe.shape("BBB","BBB","BBB");
        recipe.setIngredient('B', new RecipeChoice.ExactChoice(new ItemStack(Material.BONE,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedRottenFlesh() {
        condensedRottenFlesh = AbstractedCreationMethods.createItem(Material.BONE, 1, "§2Condensed Rotten Flesh");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_rotten_flesh"), condensedRottenFlesh);
        recipe.shape("FFF","FFF","FFF");
        recipe.setIngredient('F', new RecipeChoice.ExactChoice(new ItemStack(Material.ROTTEN_FLESH,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedBlazeRod() {
        condensedBlazeRod = AbstractedCreationMethods.createItem(Material.BLAZE_ROD, 1, "§2Condensed Blaze Rod");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_blaze_rod"), condensedBlazeRod);
        recipe.shape("RRR","RRR","RRR");
        recipe.setIngredient('R', new RecipeChoice.ExactChoice(new ItemStack(Material.BLAZE_ROD,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedGunpowder() {
        condensedGunpowder = AbstractedCreationMethods.createItem(Material.GUNPOWDER, 1, "§2Condensed Gunpowder");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_gunpowder"), condensedGunpowder);
        recipe.shape("GGG","GGG","GGG");
        recipe.setIngredient('G', new RecipeChoice.ExactChoice(new ItemStack(Material.GUNPOWDER,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedString() {
        condensedString = AbstractedCreationMethods.createItem(Material.STRING, 1, "§2Condensed String");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_string"), condensedString);
        recipe.shape("SSS","SSS","SSS");
        recipe.setIngredient('S', new RecipeChoice.ExactChoice(new ItemStack(Material.STRING,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedEnderPearl() {
        condensedEnderPearl = AbstractedCreationMethods.createItem(Material.ENDER_PEARL, 1, "§2Condensed Ender Pearl");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_ender_pearl"), condensedEnderPearl);
        recipe.shape("EEE","EEE","EEE");
        recipe.setIngredient('E', new RecipeChoice.ExactChoice(new ItemStack(Material.ENDER_PEARL,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedSlimeBlock() {
        condensedSlimeBlock = AbstractedCreationMethods.createItem(Material.SLIME_BLOCK, 1, "§2Condensed Slime Block");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_slime_block"), condensedSlimeBlock);
        recipe.shape("SSS","SSS","SSS");
        recipe.setIngredient('S', new RecipeChoice.ExactChoice(new ItemStack(Material.SLIME_BLOCK,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedMagmaCream() {
        condensedMagmaCream = AbstractedCreationMethods.createItem(Material.MAGMA_CREAM, 1, "§2Condensed Magma Cream");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_magma_cream"), condensedMagmaCream);
        recipe.shape("MMM","MMM","MMM");
        recipe.setIngredient('M', new RecipeChoice.ExactChoice(new ItemStack(Material.MAGMA_CREAM,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedGhastTear() {
        condensedGhastTear = AbstractedCreationMethods.createItem(Material.GHAST_TEAR, 1, "§2Condensed Ghast Tear");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_ghast_tear"), condensedGhastTear);
        recipe.shape("GGG","GGG","GGG");
        recipe.setIngredient('G', new RecipeChoice.ExactChoice(new ItemStack(Material.GHAST_TEAR,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedGoldBlock() {
        condensedGoldBlock = AbstractedCreationMethods.createItem(Material.GOLD_BLOCK, 1, "§2Condensed Gold Block");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_gold_block"), condensedGoldBlock);
        recipe.shape("GGG","GGG","GGG");
        recipe.setIngredient('G', new RecipeChoice.ExactChoice(new ItemStack(Material.GOLD_BLOCK,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedNetherStar() {
        condensedNetherStar = AbstractedCreationMethods.createItem(Material.NETHER_STAR, 1, "§2Condensed Nether Star");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_nether_star"), condensedNetherStar);
        recipe.shape("NNN","NNN","NNN");
        recipe.setIngredient('N', new RecipeChoice.ExactChoice(new ItemStack(Material.NETHER_STAR,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedWitherSkeletonSkull() {
        condensedWitherSkeletonSkull = AbstractedCreationMethods.createItem(Material.WITHER_SKELETON_SKULL, 1, "§2Condensed Wither Skeleton Skull");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_wither_skeleton_skull"), condensedWitherSkeletonSkull);
        recipe.shape("WWW","WWW","WWW");
        recipe.setIngredient('W', new RecipeChoice.ExactChoice(new ItemStack(Material.WITHER_SKELETON_SKULL,1)));
        Bukkit.addRecipe(recipe);
    }

    private static void createCondensedBlockOfRedstone() {
        condensedBlockOfRedstone = AbstractedCreationMethods.createItem(Material.REDSTONE_BLOCK, 1, "§2Condensed Block Of Redstone");

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("condensed_block_of_redstone"), condensedBlockOfRedstone);
        recipe.shape("RRR","RRR","RRR");
        recipe.setIngredient('R', new RecipeChoice.ExactChoice(new ItemStack(Material.REDSTONE_BLOCK,1)));
        Bukkit.addRecipe(recipe);
    }
}
