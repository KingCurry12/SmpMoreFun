package me.gloomified.user.events;


import me.gloomified.user.smpmorefun.SmpMoreFun;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class Join implements Listener {
    public void above(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        PersistentDataContainer dataContainer = player.getPersistentDataContainer();
        if (!dataContainer.has(new NamespacedKey(SmpMoreFun.getPlugin(SmpMoreFun.class), "Backpack"), PersistentDataType.STRING)) {
            dataContainer.set(new NamespacedKey(SmpMoreFun.getPlugin(SmpMoreFun.class), "Backpack"), PersistentDataType.STRING, "");
        }
        for (int i = 0; i < SmpMoreFun.players.size(); i++) {
            if(!player.isOp()){
                player.hidePlayer(SmpMoreFun.getPlugin(SmpMoreFun.class), SmpMoreFun.players.get(i));
            }

        }
    }
}
