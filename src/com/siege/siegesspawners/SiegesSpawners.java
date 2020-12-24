package com.siege.siegesspawners;

import com.siege.siegesspawners.items.condenseditems.CondensedAnimalItems;
import com.siege.siegesspawners.items.condenseditems.CondensedMobItems;
import com.siege.siegesspawners.items.spawners.SpawnerRecipes;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class SiegesSpawners extends JavaPlugin {

    @Override
    public void onEnable() {
        CondensedMobItems.init();
        CondensedAnimalItems.init();
        SpawnerRecipes.init();
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Siege's Spawners]: Plugin is enabled!");
    }
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Siege's Spawners]: Plugin is disabled!");
    }
}
