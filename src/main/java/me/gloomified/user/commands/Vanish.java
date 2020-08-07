package me.gloomified.user.commands;

import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Vanish implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(SmpMoreFun.getPlugin(SmpMoreFun.class).getConfig().getBoolean("VanishHoe.playeruse")){
            if(sender.hasPermission("SmpMoreFun.use.VanishHoe")){
                if(sender instanceof  Player){
                    Player player = (Player) sender;
                    if(SmpMoreFun.players.contains(player)){
                        SmpMoreFun.players.remove(player);
                        for(Player online : Bukkit.getOnlinePlayers()){
                            online.showPlayer(SmpMoreFun.getPlugin(SmpMoreFun.class) , player);
                        }
                        player.sendMessage(ChatColor.DARK_AQUA+"You are now not Invisible");
                    }else {
                        for(Player online : Bukkit.getOnlinePlayers()){
                            if(!online.isOp()){
                                online.hidePlayer(SmpMoreFun.getPlugin(SmpMoreFun.class) , player);
                            }
                        }
                        SmpMoreFun.players.add(player);
                        player.sendMessage(ChatColor.DARK_AQUA+"You are now  Invisible");
                    }
                }
            }else {
                sender.sendMessage(ChatColor.RED+ "You don't have the permission to use this.");
            }

        }
        return true;
    }
}
