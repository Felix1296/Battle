package de.dubsteet.battle.listeners;

import de.dubsteet.battle.Battle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if(Battle.currentGamephase != Battle.Gamephase.PREGAME && !p.hasPermission("Battle.Joinlater")) { //TODO: Nachjoinen
            e.setJoinMessage("");
            p.kickPlayer("The battle is already in process.");
            return;
        }
        e.setJoinMessage(Battle.prefix + p.getName() + " has joined the battle."); //TODO: Admins ingame keine Message
        //TODO: TP in die Map, Maybe Glaskasten oder extra Welt
    }
}
