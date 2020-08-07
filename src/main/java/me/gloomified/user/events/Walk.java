package me.gloomified.user.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Walk  implements Listener {
@EventHandler
    public void onWalk(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getBoots() == null) {
            return;
        } else if (player.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&4Blood God Armour"))) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 40, 2));
        }
    }
    @EventHandler
    public  void  onWalk2(PlayerMoveEvent event){
    Player player2 = event.getPlayer();
        if (player2.getInventory().getLeggings() == null) {
            return;
        }else if(player2.getInventory().getLeggings().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&',"&4Blood God Armour"))){
            player2.addPotionEffect(new PotionEffect(PotionEffectType.JUMP , 40 ,2));
        }
    }
}


