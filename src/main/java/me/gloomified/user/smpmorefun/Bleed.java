package me.gloomified.user.smpmorefun;

import org.bukkit.entity.LivingEntity;
import org.bukkit.scheduler.BukkitRunnable;

public class Bleed extends BukkitRunnable {
    LivingEntity victim;


    public Bleed(LivingEntity victim) {
        this.victim = victim;
    }

    @Override
    public void run() {
        if (victim.getHealth() > 1){
           // victim.setHealth(victim.getHealth() -1);
            victim.damage(1);
        }else if (victim.getHealth() == 1){
          //  victim.setHealth(victim.getHealth() -1);
            victim.damage(1);
        }else if(victim.getHealth() == 0){
            cancel();
        }

    }
}
