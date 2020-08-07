package me.gloomified.user.stuff;

import me.gloomified.user.smpmorefun.SmpMoreFun;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class Backpack {
    SmpMoreFun plugin = SmpMoreFun.getPlugin(SmpMoreFun.class);
    public void above(){
        ItemStack itemStack = new ItemStack(Material.WITHER_SKELETON_SKULL);
        ItemMeta itemMeta = itemStack.getItemMeta();
        if (itemMeta != null) itemMeta.setDisplayName(ChatColor.GOLD + "Backpack");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.GOLD + "-----------------------");
        lore.add(ChatColor.GOLD + "Backpack");
        lore.add(ChatColor.GOLD + "-----------------------");
        if (itemMeta != null) itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
         NamespacedKey namespacedKey = new NamespacedKey(plugin, "Backpack_key");
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey , itemStack);
        shapedRecipe.shape("GGG" , "GHG" , "GGG");
        shapedRecipe.setIngredient('G' , Material.GOLD_INGOT);
        shapedRecipe.setIngredient('H' , Material.WITHER_SKELETON_SKULL);
        if(plugin.getConfig().getBoolean("Backpack.craft")){
            plugin.getServer().addRecipe(shapedRecipe);
        }else {
            plugin.getServer().getConsoleSender().sendMessage(org.bukkit.ChatColor.DARK_RED + "Backpack will not work, it is not enabled");
        }

    }
}
