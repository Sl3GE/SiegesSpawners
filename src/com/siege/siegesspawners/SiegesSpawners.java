package com.siege.siegesspawners;

import com.siege.siegesspawners.items.condenseditems.CondensedFriendlyMobItems;
import com.siege.siegesspawners.items.condenseditems.CondensedHostileMobItems;
import com.siege.siegesspawners.items.spawners.FriendlyMobSpawners;
import com.siege.siegesspawners.items.spawners.HostileMobSpawners;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class SiegesSpawners extends JavaPlugin {

    @Override
    public void onEnable() {
        CondensedHostileMobItems.init();
        CondensedFriendlyMobItems.init();
        HostileMobSpawners.init();
        FriendlyMobSpawners.init();
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Siege's Spawners]: Plugin is enabled!");
    }
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Siege's Spawners]: Plugin is disabled!");
    }
}
