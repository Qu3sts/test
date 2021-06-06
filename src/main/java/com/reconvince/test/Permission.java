package com.reconvince.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class Permission implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {

        if (sender instanceof Player) {
        Player player = (Player) sender;
            if (player.isSprinting()) {
                player.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20000, 0));

            } else if (!player.isSprinting()) {
                player.getPlayer().removePotionEffect(PotionEffectType.SPEED);
            }

            return true;
        }





        return true;
    }


}
