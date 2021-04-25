package com.siege.craftablespawners;

import com.siege.craftablespawners.commands.GiveCommand;
import com.siege.craftablespawners.events.CraftableSpawnersEvents;
import com.siege.craftablespawners.items.condenseditems.CondensedFriendlyMobItems;
import com.siege.craftablespawners.items.condenseditems.CondensedHostileMobItems;
import com.siege.craftablespawners.items.spawners.FriendlyMobSpawners;
import com.siege.craftablespawners.items.spawners.HostileMobSpawners;
import com.siege.craftablespawners.items.supercondenseditems.SuperCondensedFriendlyMobItems;
import com.siege.craftablespawners.items.supercondenseditems.SuperCondensedHostileMobItems;
import com.siege.craftablespawners.listeners.SpawnerMineListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class CraftableSpawners extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new SpawnerMineListener(this), this);
        CondensedHostileMobItems.init();
        CondensedFriendlyMobItems.init();
        SuperCondensedHostileMobItems.init();
        SuperCondensedFriendlyMobItems.init();
        HostileMobSpawners.init();
        FriendlyMobSpawners.init();

        getServer().getPluginManager().registerEvents(new CraftableSpawnersEvents(), this);

        GiveCommand giveCommand = new GiveCommand();
        getCommand("giveSpawner").setExecutor(giveCommand);

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Craftable Spawners]: Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Craftable Spawners]: Plugin is disabled!");
    }
}
