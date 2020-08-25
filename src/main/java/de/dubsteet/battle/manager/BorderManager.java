package de.dubsteet.battle.manager;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldBorder;

public class BorderManager {

    World world;

    public BorderManager(String worldName, int worldCenterX, int worldCenterY) {
        world = Bukkit.getWorld(worldName);
        world.getWorldBorder().setCenter(worldCenterX, worldCenterY);
    }

    public void setBorderSize(double size) {
        world.getWorldBorder().setSize(size);
    }
}
