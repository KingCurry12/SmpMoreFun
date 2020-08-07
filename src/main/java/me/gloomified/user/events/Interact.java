package me.gloomified.user.events;

import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Set;

public class Interact implements Listener {

    @EventHandler
    public void above(PlayerInteractEvent event) {
        Player player = event.getPlayer();
       if(event.getItem() == null) return;
        if (!player.getInventory().getItemInMainHand().getItemMeta().hasDisplayName())  return;
                if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "God AXE")) {
                    @SuppressWarnings("unchecked")
                    Location location = player.getTargetBlock(null, 3000).getLocation();
                    if(location.getWorld() == null) return;
                    location.getWorld().strikeLightning(location);
                }

    }
    @EventHandler
    public  void onPlayerUseExplosionPick(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if(event.getItem() == null) return;
        if(event.getClickedBlock() == null) return;
        if(player.getInventory().getItemInMainHand().getEnchantments().containsKey(Enchantment.getByKey(SmpMoreFun.customEnchantments.getKey()))){
            Location location =  event.getClickedBlock().getLocation();
            if(location.getWorld() == null) return;
            location.getWorld().createExplosion( location , 4f);
        }
    }
    @EventHandler
    public  void backPackEvent(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if(event.getItem() == null) return;
        if(player.getInventory().getItemInMainHand().getItemMeta() == null) return;
        if(player.getInventory().getItemInMainHand().getItemMeta().hasDisplayName()){
            if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD+"Backpack")){
                player.chat("/backpack");
            }
        }
    }
    @EventHandler
    public  void vanishStuff(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if(event.getItem() == null) return;
        if(player.getInventory().getItemInMainHand().getType() == Material.AIR) return;
        if(player.getInventory().getItemInMainHand().getItemMeta() == null) return;
        if(player.getInventory().getItemInMainHand().getItemMeta().getLore() == null) return;
        if(player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(null)) return;
        if(player.getInventory().getItemInMainHand().getItemMeta().hasDisplayName()){
            if(player.hasPermission("SmpMoreFun.use.VanishHoe")){
                if(player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(ChatColor.AQUA + "This hoe allows you to vanish")){
                    player.chat("/vanishtest");
                }
            }
        }
    }
}