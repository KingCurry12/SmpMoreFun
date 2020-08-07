package me.gloomified.user.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Info implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if(args.length <= 0){
                TextComponent textComponent = new TextComponent(ChatColor.AQUA + "_KingCurry_(Dev)");
                textComponent.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL , "https://www.spigotmc.org/members/kingdutchisbad.817692/"));
                textComponent.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT , new Text(ChatColor.AQUA+"Author")));
                sender.sendMessage(ChatColor.DARK_AQUA + "-------------------------------------");
                sender.sendMessage(ChatColor.AQUA+"This Plugin is made by:");
                sender.spigot().sendMessage(textComponent);
                sender.sendMessage(ChatColor.AQUA+"The plugin adds custom recipes");
                sender.sendMessage(ChatColor.AQUA+"Commands:");
                sender.sendMessage(ChatColor.BLUE+"/backpack");
                sender.sendMessage(ChatColor.BLUE+"/smpmorefun");
                TextComponent textComponent1 = new TextComponent(ChatColor.BLUE + "Download Link!");
                textComponent1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT  , new Text(ChatColor.AQUA+"Download now!")));
                textComponent1.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL , "https://www.spigotmc.org/resources/smpmorefun.81998/"));
                sender.spigot().sendMessage(textComponent1);
                sender.sendMessage(ChatColor.DARK_AQUA + "-------------------------------------");
            }
    return true;
    }
}
