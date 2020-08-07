package me.gloomified.user.stuff;

import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class Telepathy_Shovel {
    SmpMoreFun plugin = SmpMoreFun.getPlugin(SmpMoreFun.class);
    public void telepathyShovel(){
        ItemStack itemStack = new ItemStack(Material.NETHERITE_SHOVEL);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_AQUA + "Telepathy Shovel");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.AQUA + "---------------------------------");
        lore.add(ChatColor.BLUE + "Telepathy Shovel");
        lore.add(ChatColor.AQUA + "---------------------------------");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        NamespacedKey namespacedKey = new NamespacedKey(plugin,  "Telepathy_Shovel");
        ShapedRecipe recipe = new ShapedRecipe(namespacedKey , itemStack);
        recipe.shape("GGG" , "GSG" , "GGG" );
        recipe.setIngredient('G' , Material.GOLD_INGOT);
        recipe.setIngredient('S' , Material.NETHERITE_SHOVEL);
        if(plugin.getConfig().getBoolean("Telepathy Shovel.enable")){
            plugin.getServer().addRecipe(recipe);
        }else {
            plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "Telepathy Shovel will not, it is not enabled");
        }
    }
}
