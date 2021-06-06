package com.reconvince.test;

import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("COCK");
        getServer().getPluginManager().registerEvents(new WalkListener(), this);
        getCommand("nuts").setExecutor(new CommandListener());
        getCommand("kickme").setExecutor(new AnotherCmdListener());
        getCommand("speed").setExecutor(new Permission());
        getServer().getPluginManager().registerEvents(new Cocki(), this);

    }



}
