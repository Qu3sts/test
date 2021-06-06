package com.reconvince.test;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Cocki implements Listener {

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent event) {

        if (event.getEntity() instanceof Player) {
            event.getEntity().sendMessage("Say goodbye to your items! :)");
            ((Player) event.getEntity()).setHealth(0.0);




        }




    }




    }




