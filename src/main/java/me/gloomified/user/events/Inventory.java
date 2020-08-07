package me.gloomified.user.events;

import me.gloomified.user.smpmorefun.Backpack_Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;

public class Inventory implements Listener {
    @EventHandler
    public void above(InventoryCloseEvent event){
        Player player = (Player) event.getPlayer();
        if(event.getView().getTitle().equalsIgnoreCase("Backpack")){
            ArrayList<ItemStack> items = new ArrayList<>();
            Arrays.stream(event.getInventory().getContents())
                    .filter(itemStack ->{
                        return itemStack != null;
                    }).forEach(itemStack -> items.add(itemStack));
            Backpack_Utils.storeItems(items, player);

        }
    }
}
