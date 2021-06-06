package com.reconvince.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

class CommandListener implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {

        if (sender instanceof Player) {

            Player player = (Player) sender;
            player.sendMessage("Ayo bro! That's kinda sus.");
        }


    return true;
    }

}
