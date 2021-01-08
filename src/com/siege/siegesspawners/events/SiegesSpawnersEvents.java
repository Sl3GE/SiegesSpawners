package com.siege.siegesspawners.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Locale;

public class SiegesSpawnersEvents implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        ItemStack item = event.getItemInHand();
        Player player = event.getPlayer();
        if (item.getType() == Material.SPAWNER) {
            ItemMeta meta = item.getItemMeta();
            String name = meta.getDisplayName();
            name = name.replace("§6","");
            String[] nameSplit = name.split(" ");
            int nameLength = nameSplit.length;
            String entityName = "";
            for (int i = 0; i < nameLength - 1; i++) {
                entityName+=nameSplit[i];
                if (i != nameLength-2) {
                    entityName+= "_";
                }
            }
            EntityType entityType = EntityType.valueOf(entityName.toUpperCase(Locale.ROOT));
            CreatureSpawner cs = (CreatureSpawner) event.getBlock().getState();
            cs.setSpawnedType(entityType);
            cs.update();
            player.sendMessage(meta.getDisplayName() + " Placed!");
        }
    }
}
