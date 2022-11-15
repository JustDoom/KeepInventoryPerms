package com.imjustdoom.keepinventoryperms;

import com.imjustdoom.keepinventoryperms.listener.PlayerDeathListener;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public final class KeepInventoryPerms extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);
    }

    @Override
    public void onDisable() {
        // Unregister event listeners
        HandlerList.unregisterAll(this);
    }
}
