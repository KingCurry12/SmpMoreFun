package me.gloomified.user.events;

import me.gloomified.user.smpmorefun.Bleed;
import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitTask;

public class EntityDam implements Listener {
    @EventHandler
    public void above(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if (player.getInventory().getChestplate() == null) {
                return;
            }else if(player.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&',"&4Blood God Armour"))) {
              player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE , 300 , 2));
            }
            }
        }
    @EventHandler
    public  void glowStickEffect(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player){
            Player player = (Player) event.getDamager();
            if(player.getInventory().getItemInMainHand().getItemMeta() == null) return;
            if(player.getInventory().getItemInMainHand().getItemMeta().getLore() == null) return;
            if(player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(null)) return;
            if(player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(ChatColor.GOLD + "Glow Effect I")){
                event.getEntity().setGlowing(true);
            }
        }
    }
    @EventHandler
    public  void  helmet(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player) {
            if (event.getDamager() instanceof Player) {
                Player player = (Player) event.getDamager();
                Player player1 = (Player) event.getEntity();
                if (player.getInventory().getHelmet() == null) return;
                if (player.getInventory().getHelmet().getItemMeta() == null) return;
                if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&4Blood God Armour"))) {
                    if (!player1.getActivePotionEffects().contains(new PotionEffect(PotionEffectType.POISON, 300, 2))) {
                        player1.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 300, 2));
                    }
                }

            }
        }
    }
    @EventHandler
    public void bleedStuff(EntityDamageByEntityEvent event){
        if(event.getEntity() instanceof LivingEntity){
            if(event.getDamager() instanceof Player){
                LivingEntity victim = (LivingEntity) event.getEntity();
                Player player = (Player) event.getDamager();
                if(player.getInventory().getItemInMainHand().getType() == Material.AIR) return;
                if(player.getInventory().getItemInMainHand().getItemMeta() == null) return;
                if(player.getInventory().getItemInMainHand().getItemMeta().getLore() == null) return;
                if(player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(ChatColor.AQUA + "Ancient Sword")){
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[Smp&4More&3Fun] ")+ChatColor.DARK_RED + "Your Target is now bleeding.");
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[Smp&4More&3Fun] ")+ChatColor.DARK_RED + "Sometimes the target will have some health left and will not die.");
                    BukkitTask task = new Bleed(victim).runTaskTimer(SmpMoreFun.getPlugin(SmpMoreFun.class), 0L, 40L);
                }


            }
        }

    }
        }


