package me.gloomified.user.stuff;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ToolsofGOD  {
    me.gloomified.user.smpmorefun.SmpMoreFun plugin = me.gloomified.user.smpmorefun.SmpMoreFun.getPlugin(me.gloomified.user.smpmorefun.SmpMoreFun.class);
    public  void Tools(){
        ArrayList<String> lore = new ArrayList<>();
        ItemStack GodAxe = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta itemMeta = GodAxe.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_RED+"God AXE");
        lore.add(ChatColor.RED+"---------------");
        lore.add("This Axe will kill anyone");
        lore.add(ChatColor.RED+"---------------");
        itemMeta.setLore(lore);
        GodAxe.setItemMeta(itemMeta);
        NamespacedKey namespacedKey = new NamespacedKey(plugin , "Zeus_AXE" );
        ShapedRecipe shapedRecipe = new ShapedRecipe(namespacedKey , GodAxe);
        shapedRecipe.shape("NNN" , "NIN" , "NNN");
        shapedRecipe.setIngredient('N' , Material.NETHERITE_INGOT);
        shapedRecipe.setIngredient('I' , Material.IRON_AXE);
        GodAxe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL , 10 );
        if(plugin.getConfig().getBoolean("LightningAxe")){
            plugin.getServer().addRecipe(shapedRecipe);
        }else{
            plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "Lightning Axe will not work, it is not enabled");

        }

        }
    }


