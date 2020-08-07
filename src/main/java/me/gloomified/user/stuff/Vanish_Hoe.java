package me.gloomified.user.stuff;

import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Vanish_Hoe  {
    SmpMoreFun plugin = SmpMoreFun.getPlugin(SmpMoreFun.class);
    public void vanishHoe(){
        ItemStack itemStack = new ItemStack(Material.NETHERITE_HOE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_AQUA+ "Vanish Hoe");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.AQUA + "----------------------------------------");
        lore.add(ChatColor.AQUA + "This hoe allows you to vanish");
        lore.add(ChatColor.AQUA+ "Only Weakness is that Operators can");
        lore.add(ChatColor.AQUA+ "see, you also new players can see you");
        lore.add(ChatColor.AQUA + "----------------------------------------");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        NamespacedKey namespacedKey = new NamespacedKey(plugin, "Vanish_Hoe" );
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey , itemStack);
        shapedRecipe.shape("GGG" , "GHG" , "GGG");
        shapedRecipe.setIngredient('G' , Material.GOLD_BLOCK);
        shapedRecipe.setIngredient('H' , Material.NETHERITE_HOE);
        if(plugin.getConfig().getBoolean("VanishHoe.enable")){
            plugin.getServer().addRecipe(shapedRecipe);
        }else{
            System.out.println(ChatColor.RED + "Vanish Hoe will not work, it is not enabled");
        }
    }
}
