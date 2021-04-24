package com.siege.craftablespawners.items;

import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class AbstractedCreationMethods {
    public static ItemStack createItem(Material material, int amount, String displayName) {
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(displayName);
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack itemSpawnerCreator(Material material, int amount, EntityType entityType, String displayName) {
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
}
