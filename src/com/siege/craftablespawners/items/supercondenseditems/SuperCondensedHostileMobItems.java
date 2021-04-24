package com.siege.craftablespawners.items.supercondenseditems;

import com.siege.craftablespawners.items.AbstractedCreationMethods;
import com.siege.craftablespawners.items.condenseditems.CondensedHostileMobItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SuperCondensedHostileMobItems {

    public static ItemStack superCondensedBone;
    public static ItemStack superCondensedRottenFlesh;
    public static ItemStack superCondensedBlazeRod;
    public static ItemStack superCondensedGunpowder;
    public static ItemStack superCondensedString;
    public static ItemStack superCondensedEnderPearl;
    public static ItemStack superCondensedMagmaCream;
    public static ItemStack superCondensedBlockOfRedstone;

    public static void init() {
        createSuperCondensedBone();
        createSuperCondensedRottenFlesh();
        createSuperCondensedBlazeRod();
        createSuperCondensedGunpowder();
        createSuperCondensedString();
        createSuperCondensedEnderPearl();
        createSuperCondensedMagmaCream();
        createSuperCondensedBlockOfRedstone();
    }

    private static void createSuperCondensedBone() {
        superCondensedBone = AbstractedCreationMethods.createItem(Material.BONE,1,"§1Super Condensed Bone");

        AbstractedCreationMethods.condenseItems(superCondensedBone,"super_condensed_bone", CondensedHostileMobItems.condensedBone);
    }

    private static void createSuperCondensedRottenFlesh() {
        superCondensedRottenFlesh = AbstractedCreationMethods.createItem(Material.ROTTEN_FLESH,1,"§1Super Rotten Flesh");

        AbstractedCreationMethods.condenseItems(superCondensedRottenFlesh,"super_condensed_rotten_flesh", CondensedHostileMobItems.condensedRottenFlesh);
    }

    private static void createSuperCondensedBlazeRod() {
        superCondensedBlazeRod = AbstractedCreationMethods.createItem(Material.BLAZE_ROD,1,"§1Super Blaze Rod");

        AbstractedCreationMethods.condenseItems(superCondensedBlazeRod,"super_condensed_blaze_rod", CondensedHostileMobItems.condensedBlazeRod);
    }

    private static void createSuperCondensedGunpowder() {
        superCondensedGunpowder = AbstractedCreationMethods.createItem(Material.GUNPOWDER, 1, "§1Super Condensed Gunpowder");

        AbstractedCreationMethods.condenseItems(superCondensedGunpowder,"super_condensed_gunpowder", CondensedHostileMobItems.condensedGunpowder);
    }

    private static void createSuperCondensedString() {
        superCondensedString = AbstractedCreationMethods.createItem(Material.STRING, 1, "§1Super Condensed String");

        AbstractedCreationMethods.condenseItems(superCondensedString,"super_condensed_string", CondensedHostileMobItems.condensedString);
    }

    private static void createSuperCondensedEnderPearl() {
        superCondensedEnderPearl = AbstractedCreationMethods.createItem(Material.ENDER_PEARL, 1, "§1Super Condensed Ender Pearl");

        AbstractedCreationMethods.condenseItems(superCondensedEnderPearl,"super_condensed_ender_pearl", CondensedHostileMobItems.condensedEnderPearl);
    }

    private static void createSuperCondensedMagmaCream() {
        superCondensedMagmaCream = AbstractedCreationMethods.createItem(Material.MAGMA_CREAM, 1, "§1Super Condensed Magma Cream");

        AbstractedCreationMethods.condenseItems(superCondensedMagmaCream,"super_condensed_magma_cream", CondensedHostileMobItems.condensedMagmaCream);
    }

    private static void createSuperCondensedBlockOfRedstone() {
        superCondensedBlockOfRedstone = AbstractedCreationMethods.createItem(Material.REDSTONE_BLOCK, 1, "§1Super Condensed Block Of Redstone");

        AbstractedCreationMethods.condenseItems(superCondensedBlockOfRedstone,"super_condensed_block_of_redstone", CondensedHostileMobItems.condensedBlockOfRedstone);
    }
}
