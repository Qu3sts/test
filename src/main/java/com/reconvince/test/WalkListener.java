package com.reconvince.test;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class WalkListener implements Listener {
    @EventHandler
    public void walkTorture(EntityPickupItemEvent event) {
        event.getEntity().setHealth(0.0);
        event.getEntity().sendMessage("Bro, don't pick up items.");

    }








}
