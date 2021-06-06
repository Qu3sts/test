package com.reconvince.test;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SprintListener implements Listener {
    @EventHandler
    public void sprintListener(PlayerToggleSprintEvent player) {

        if (player.isSprinting()) {

            player.getPlayer().sendMessage("Run forest, RUN!");
            player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 0));

        } else if (!player.isSprinting()) {
            player.getPlayer().removePotionEffect(PotionEffectType.SPEED);
        }

    }



}
