package com.siege.craftablespawners.items.supercondenseditems;

import com.siege.craftablespawners.items.AbstractedCreationMethods;
import com.siege.craftablespawners.items.condenseditems.CondensedFriendlyMobItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

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

    private static void createSuperCondensedCowDrops() {
        superCondensedLeather = AbstractedCreationMethods.createItem(Material.LEATHER,1,"§1Super Condensed Leather");
        superCondensedBeef = AbstractedCreationMethods.createItem(Material.BEEF,1,"§1Super Condensed Beef");

        AbstractedCreationMethods.condenseItems(superCondensedLeather,"super_condensed_leather", CondensedFriendlyMobItems.condensedLeather);
        AbstractedCreationMethods.condenseItems(superCondensedBeef,"super_condensed_beef", CondensedFriendlyMobItems.condensedBeef);
    }

    private static void createSuperCondensedSnowmanDrops() {
        superCondensedCarvedPumpkin = AbstractedCreationMethods.createItem(Material.CARVED_PUMPKIN,1,"§1Super Condensed Carved Pumpkin");
        superCondensedSnowBlock = AbstractedCreationMethods.createItem(Material.SNOW_BLOCK,1,"§1Super Condensed Snow Block");

        AbstractedCreationMethods.condenseItems(superCondensedCarvedPumpkin,"super_condensed_carved_pumpkin", CondensedFriendlyMobItems.condensedCarvedPumpkin);
        AbstractedCreationMethods.condenseItems(superCondensedSnowBlock,"super_condensed_snow_block", CondensedFriendlyMobItems.condensedSnowBlock);
    }

    private static void superCreateCondensedSheepDrops() {
        superCondensedWhiteWool = AbstractedCreationMethods.createItem(Material.WHITE_WOOL,1,"§1Super Condensed White Wool");
        superCondensedMutton = AbstractedCreationMethods.createItem(Material.MUTTON,1,"§1Super Condensed Mutton");

        AbstractedCreationMethods.condenseItems(superCondensedWhiteWool,"super_condensed_white_wool", CondensedFriendlyMobItems.condensedWhiteWool);
        AbstractedCreationMethods.condenseItems(superCondensedMutton,"super_condensed_mutton", CondensedFriendlyMobItems.condensedMutton);
    }

    private static void createSuperCondensedPorkChop() {
        superCondensedPorkChop = AbstractedCreationMethods.createItem(Material.PORKCHOP,1,"§1Super Condensed Porkchop");

        AbstractedCreationMethods.condenseItems(superCondensedPorkChop,"super_condensed_porkchop", CondensedFriendlyMobItems.condensedPorkChop);
    }

    private static void createSuperCondensedInkSac() {
        superCondensedInkSac = AbstractedCreationMethods.createItem(Material.INK_SAC,1,"§1Super Condensed Ink Sac");

        AbstractedCreationMethods.condenseItems(superCondensedInkSac,"super_condensed_ink_sac", CondensedFriendlyMobItems.condensedInkSac);
    }

    private static void superCreateCondensedChickenDrops() {
        superCondensedChicken = AbstractedCreationMethods.createItem(Material.CHICKEN,1,"§1Super Condensed Chicken");
        superCondensedFeather = AbstractedCreationMethods.createItem(Material.FEATHER,1,"§1Super Condensed Feather");

        AbstractedCreationMethods.condenseItems(superCondensedChicken,"super_condensed_chicken", CondensedFriendlyMobItems.condensedChicken);
        AbstractedCreationMethods.condenseItems(superCondensedFeather,"super_condensed_feather", CondensedFriendlyMobItems.condensedFeather);
    }
}
