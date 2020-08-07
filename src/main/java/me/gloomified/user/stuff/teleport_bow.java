package me.gloomified.user.stuff;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class teleport_bow {
    me.gloomified.user.smpmorefun.SmpMoreFun plugin = me.gloomified.user.smpmorefun.SmpMoreFun.getPlugin(me.gloomified.user.smpmorefun.SmpMoreFun.class);
    public void bow(){
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.BLUE + "---------------");
        lore.add(ChatColor.BLUE+ "Teleport Bow");
        lore.add(ChatColor.BLUE + "---------------");
        ItemStack itemStack = new ItemStack(Material.BOW);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setLore(lore);
        itemMeta.setDisplayName(ChatColor.DARK_BLUE + "Teleport Bow");
        itemStack.setItemMeta(itemMeta);
        NamespacedKey Bow = new NamespacedKey(plugin, "Teleport_BOW");
        ShapedRecipe telebow = new ShapedRecipe(Bow , itemStack);
        telebow.shape("NNN" , "NBN" , "NNN");
        telebow.setIngredient('N' , Material.NETHERITE_INGOT);
        telebow.setIngredient('B' , Material.BOW);
        itemStack.addUnsafeEnchantment(Enchantment.ARROW_INFINITE , 2 );
        if(plugin.getConfig().getBoolean("TeleportBow")){
            plugin.getServer().addRecipe(telebow);
        }else{
            plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "Teleport Bow will not work, it is not enabled");
        }


    }
}
