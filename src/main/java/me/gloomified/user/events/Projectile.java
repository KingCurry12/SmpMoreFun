package me.gloomified.user.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class Projectile implements Listener {
@EventHandler
    public void onhit(ProjectileHitEvent event) {
        if(event.getEntity() instanceof Arrow){

            if(event.getEntity().getShooter() instanceof Player){
                Player player = (Player) event.getEntity().getShooter();
                Location location =  event.getEntity().getLocation();
                if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_BLUE + "Teleport Bow")) {
                    player.teleport(location);
                    player.playSound(player.getLocation() , Sound.ENTITY_ENDERMAN_TELEPORT , 10 , 0.1f );
                }
            }

        }



    }
}
