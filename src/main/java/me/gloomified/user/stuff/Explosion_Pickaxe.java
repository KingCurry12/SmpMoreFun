package me.gloomified.user.stuff;

import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;

public class Explosion_Pickaxe {
    me.gloomified.user.smpmorefun.SmpMoreFun plugin = me.gloomified.user.smpmorefun.SmpMoreFun.getPlugin(me.gloomified.user.smpmorefun.SmpMoreFun.class);
    public void above(){
        ItemStack itemStack = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add(  ChatColor.RED+ "Explosive Break I");
        itemMeta.addEnchant(SmpMoreFun.customEnchantments ,1 , true);
        itemMeta.setLore(lore);
        itemMeta.setDisplayName("Explosion Pickaxe");
        itemStack.setItemMeta(itemMeta);
        NamespacedKey namespacedKey = new NamespacedKey(plugin, "Pickaxe_Explosion" );
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey , itemStack);
        shapedRecipe.shape("TTT" , "TNT" , "TTT");
        shapedRecipe.setIngredient('T' , Material.TNT);
        shapedRecipe.setIngredient('N' , Material.NETHERITE_PICKAXE);
      if( plugin.getConfig().getBoolean("ExplosionPickaxe") ){
          Bukkit.addRecipe(shapedRecipe);
        }else {
          plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED+"Explosion Axe will not work, it is not enabled");
      }

    }
}
