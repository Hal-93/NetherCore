package net.netherserver.nethercore;

import org.bukkit.plugin.java.JavaPlugin;

public final class NetherCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("NetherCore plugin enabled.");
        getCommand("nc").setExecutor(new Status());
    }

    @Override
    public void onDisable() {
        getLogger().info("NetherCore plugin disabled.");
    }
}
