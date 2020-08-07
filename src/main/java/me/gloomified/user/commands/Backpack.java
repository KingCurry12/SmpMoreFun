package me.gloomified.user.commands;

import me.gloomified.user.smpmorefun.*;
import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class Backpack implements CommandExecutor {
    SmpMoreFun  plugin = SmpMoreFun.getPlugin(SmpMoreFun.class);
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("Smpmorefun.use.backpack")){
            if(command.getName().equals("Backpack")){
                if(sender instanceof Player){
                    Player player = (Player) sender;
                    ArrayList<ItemStack> Items = Backpack_Utils.getItems(player);
                    Inventory inventory = Bukkit.createInventory(player, plugin.getConfig().getInt("Backpack.size"), "Backpack");
                    Items.forEach(inventory::addItem);
                    player.openInventory(inventory);
                }
        }
        }
        return true;
    }
}
