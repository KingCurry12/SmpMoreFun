package me.gloomified.user.commands;

import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class reload implements CommandExecutor {
SmpMoreFun plugin = SmpMoreFun.getPlugin(SmpMoreFun.class);
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("Smpmorefunreload")){
            if(sender.hasPermission("Smpmorefun.use.reload")){
                plugin.reloadConfig();
                plugin.saveConfig();
                sender.sendMessage(ChatColor.RED+ "[Smp"+ChatColor.DARK_RED+"More"+ChatColor.DARK_AQUA+"Fun]"+ChatColor.AQUA+"Plugin reloaded");
            }
        }

        return true;
    }
}
