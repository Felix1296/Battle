package de.dubsteet.battle;

import de.dubsteet.battle.listeners.BlockProtectionLobby;
import de.dubsteet.battle.listeners.PlayerJoinListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Battle extends JavaPlugin {

    public enum Gamephase {PREGAME, GRACE, GAME, END}
    public static Gamephase currentGamephase;
    public static String prefix = "[Battle] ";

    @Override
    public void onEnable() {
        System.out.println("Battle started!");
        currentGamephase = Gamephase.PREGAME;
        registerEvents();
    }


    private void registerEvents() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new BlockProtectionLobby(), this);
    }
}
