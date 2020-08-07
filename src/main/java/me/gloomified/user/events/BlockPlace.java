package me.gloomified.user.events;

import com.google.gson.internal.$Gson$Preconditions;
import me.gloomified.user.smpmorefun.SmpMoreFun;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Container;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public class BlockPlace implements Listener {
    @EventHandler
    public void above(BlockPlaceEvent event){
        Player player = event.getPlayer();
        if(player.getItemInHand().getItemMeta().getDisplayName() == null) return;
        if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Backpack")){
            event.setCancelled(true);
        }
    }
   @EventHandler
   public void breakEvent(BlockBreakEvent event){
        if(SmpMoreFun.getPlugin(SmpMoreFun.class).getConfig().getBoolean("Telepathy Shovel.playeruse")){
            Player player = event.getPlayer();
            Block block = event.getBlock();
            if(player.getInventory().getItemInMainHand().getType() == Material.AIR) return;
            if(player.getInventory().getItemInMainHand().getItemMeta() == null) return;
            if(player.getInventory().getItemInMainHand().getItemMeta().getLore() == null) return;
            if(block.getState() instanceof Container) return;
            if(player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(ChatColor.BLUE+"Telepathy Shovel")){
                event.setDropItems(false);
                Collection<ItemStack> drops = block.getDrops(player.getInventory().getItemInMainHand());
                if(drops.isEmpty()) return;
                player.getInventory().addItem(drops.iterator().next());
            }
        }

   }
}
