package me.gloomified.user.stuff;

import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class GlowStick implements Listener {
    SmpMoreFun plugin = SmpMoreFun.getPlugin(SmpMoreFun.class);
    public void above(){
        ItemStack GlowStick = new ItemStack(Material.STICK);
        ItemMeta itemMeta = GlowStick.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GOLD + "GlowStick");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.GOLD + "Glow Effect I");
        itemMeta.setLore(lore);
        GlowStick.setItemMeta(itemMeta);
        NamespacedKey namespacedKey = new NamespacedKey(plugin,"Glow_Stick" );
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey , GlowStick);
        shapedRecipe.shape("   " , "RSR" , "   ");
        shapedRecipe.setIngredient('R' , Material.BLAZE_ROD);
        shapedRecipe.setIngredient('S' , Material.STICK);
        if(plugin.getConfig().getBoolean("GlowStick")){
            plugin.getServer().addRecipe(shapedRecipe);
        }else {
            plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "GlowStick will not work, it is not enabled");
        }

    }
}
