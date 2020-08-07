package me.gloomified.user.stuff;

import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class Bleeding_Sword {
SmpMoreFun plugin = SmpMoreFun.getPlugin(SmpMoreFun.class);
    public  void sword(){
        ItemStack im = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta itemMeta = im.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_AQUA + "Ancient Sword");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_AQUA+"--------------------------------------------");
        lore.add(ChatColor.AQUA + "Ancient Sword");
        lore.add(ChatColor.AQUA+"This sword will make the entity you hit bleed");
        lore.add(ChatColor.DARK_AQUA+"--------------------------------------------");
        itemMeta.setLore(lore);
        im.setItemMeta(itemMeta);
        NamespacedKey sword = new NamespacedKey(plugin, "AncientSword" );
        ShapedRecipe swordrec = new ShapedRecipe(sword , im);
        swordrec.shape("NNN" , "NSN" , "NNN");
        swordrec.setIngredient('N' , Material.NETHERITE_SCRAP);
        swordrec.setIngredient('S' , Material.NETHERITE_SWORD);
        if(plugin.getConfig().getBoolean("AncientSword.enable")){
            Bukkit.addRecipe(swordrec);
        }else {
            System.out.println(ChatColor.DARK_RED+ "Ancient Sword will not work, it is not enabled");
        }
    }
}
