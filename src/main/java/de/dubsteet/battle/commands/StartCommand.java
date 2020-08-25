package de.dubsteet.battle.commands;

import de.dubsteet.battle.Battle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(!p.hasPermission("Battle.Start")) {
                p.sendMessage(Battle.prefix + "You have no permission to use this command");
                return true;
            }
            if(Battle.currentGamephase != Battle.Gamephase.PREGAME) {
                p.sendMessage(Battle.prefix + "The battle has already started");
                return true;
            }
            //TODO: StartGame
        }
        return true;
    }
}
