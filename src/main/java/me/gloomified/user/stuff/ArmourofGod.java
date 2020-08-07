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

public class ArmourofGod  {
    public  void GodArmour(){
        me.gloomified.user.smpmorefun.SmpMoreFun plugin = me.gloomified.user.smpmorefun.SmpMoreFun.getPlugin(me.gloomified.user.smpmorefun.SmpMoreFun.class);

        ArrayList<String> lore = new ArrayList<>();
        ItemStack Chestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ItemStack Legggings = new ItemStack(Material.NETHERITE_LEGGINGS);
        ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS);
        ItemStack helments = new ItemStack(Material.NETHERITE_HELMET);
        helments.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 10);
        Chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 10);
        Legggings.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 10);
        boots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL , 10);
        ItemMeta itemMeta1 = Chestplate.getItemMeta();
        ItemMeta itemMeta2 = Legggings.getItemMeta();
        ItemMeta itemMeta3 = boots.getItemMeta();
        ItemMeta itemMeta4 = helments.getItemMeta();
        lore.add(ChatColor.DARK_RED + "---------------");
        lore.add(ChatColor.translateAlternateColorCodes('&',"&4Blood for the blood god" ));
        lore.add(ChatColor.DARK_RED + "---------------");
        itemMeta1.setLore(lore);
        itemMeta2.setLore(lore);
        itemMeta3.setLore(lore);
        itemMeta4.setLore(lore);
        itemMeta1.setDisplayName(ChatColor.translateAlternateColorCodes('&',"&4Blood God Armour"));
        itemMeta3.setDisplayName(ChatColor.translateAlternateColorCodes('&',"&4Blood God Armour"));
        itemMeta2.setDisplayName(ChatColor.translateAlternateColorCodes('&',"&4Blood God Armour"));
        itemMeta4.setDisplayName(ChatColor.translateAlternateColorCodes('&',"&4Blood God Armour"));
        Chestplate.setItemMeta(itemMeta1);
        Legggings.setItemMeta(itemMeta2);
        boots.setItemMeta(itemMeta3);
        helments.setItemMeta(itemMeta4);
        NamespacedKey ChestPlate2 = new NamespacedKey(plugin, "ChesPlate_KEY");
        ShapedRecipe plate = new ShapedRecipe(ChestPlate2, Chestplate);
        plate.shape("GGG" , "GAG" , "GGG");
        plate.setIngredient('G' , Material.GOLD_BLOCK);
        plate.setIngredient('A' , Material.NETHERITE_CHESTPLATE);
        NamespacedKey Leggings2 = new NamespacedKey(plugin,"Leg_KEY" );
        ShapedRecipe leg = new ShapedRecipe(Leggings2 , Legggings);
        leg.shape("GGG" , "GLG" , "GGG");
        leg.setIngredient('G' , Material.GOLD_BLOCK);
        leg.setIngredient('L' , Material.NETHERITE_LEGGINGS);
        NamespacedKey Boots2 = new NamespacedKey(plugin, "Boots_Key");
        ShapedRecipe boot = new ShapedRecipe(Boots2 , boots );
        boot.shape("GGG" , "GBG" , "GGG");
        boot.setIngredient('G' , Material.GOLD_BLOCK);
        boot.setIngredient('B' , Material.NETHERITE_BOOTS);
        NamespacedKey helmet = new NamespacedKey(plugin , "Helmet_Key");
        ShapedRecipe helmet2 = new ShapedRecipe(helmet , helments);
        helmet2.shape("GGG" , "GHG" ,"GGG");
        helmet2.setIngredient('G' , Material.GOLD_BLOCK);
        helmet2.setIngredient('H' , Material.NETHERITE_HELMET);
        if(plugin.getConfig().getBoolean("Armourofgod")){
            plugin.getServer().addRecipe(plate);
            plugin.getServer().addRecipe(leg);
            plugin.getServer().addRecipe(boot);
            plugin.getServer().addRecipe(helmet2);
        }else {
            plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "Blood God armour will not work, it is not enabled");
        }


    }
}
