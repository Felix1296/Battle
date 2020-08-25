package de.dubsteet.battle.listeners;

import de.dubsteet.battle.Battle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class BlockProtectionLobby implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        if(isModifyNotLegal(p)) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        if(isModifyNotLegal(p)) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        if(isModifyNotLegal(e.getPlayer())) e.setCancelled(true);
    }

    private static boolean isModifyNotLegal(Player p) {
        return Battle.currentGamephase == Battle.Gamephase.PREGAME && !p.hasPermission("Battle.ModifyPreGameBlocks");
    }
}
