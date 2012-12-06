package com.neverseenbefore.weja.speedboost;
 

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
 
public final class SpeedBoost extends JavaPlugin implements Listener {
 
    @Override
    public void onEnable(){
     getServer().getPluginManager().registerEvents(this, this);
    }
    
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();
        if(p.hasPermission("speedboost.speedboost")) {
         p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
        }
        if(p.hasPermission("speedboost.jump")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 1));
        }
    }
    
    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event){
        Player p = (Player) event.getPlayer();
        if(p.hasPermission("speedboost.speedboost")) {
        	p.removePotionEffect(PotionEffectType.SPEED);
        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
        }
        if(p.hasPermission("speedboost.jump")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
        p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 1));
        }
    }
}