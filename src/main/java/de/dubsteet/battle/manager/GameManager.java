package de.dubsteet.battle.manager;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class GameManager {

    public static void startGame() {
        for(Player all: Bukkit.getOnlinePlayers()) {
            //TODO: Teleport in Map
        }
    }
}
