package de.dubsteet.battle.commands;

import de.dubsteet.battle.Battle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HostCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(!p.hasPermission("Battle.host")) {
                p.sendMessage(Battle.prefix + "You have no permission to host a battle");
                return true;
            }
            if(Battle.currentGamephase != Battle.Gamephase.PREGAME) {
                p.sendMessage(Battle.prefix + "The battle has already started");
                return true;
            }
            //TODO: Open Inventory oder per Befehl?
        }
        return true;
    }
}
