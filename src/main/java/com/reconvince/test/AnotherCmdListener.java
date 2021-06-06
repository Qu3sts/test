package com.reconvince.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

class AnotherCmdListener implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            player.kickPlayer("GG");
        }

        return true;
    }


    }
