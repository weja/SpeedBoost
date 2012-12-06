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
     getLogger().info("SpeedBoost v0.3 has been succesfully enabled!");
    }
    @Override
    public void onDisable(){
     getLogger().info("SpeedBoost v0.3 has been succesfully disabled! See ya!");
    }
    
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();
        if(p.hasPermission("speedboost.speedboost.one")) {
         p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 0));
        }
        if(p.hasPermission("speedboost.speedboost.two")) {
        	p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
        }
        if(p.hasPermission("speedboost.speedboost.three")) {
        	p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 2));
        }
        if(p.hasPermission("speedboost.jump.one")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 0));
        }
        if(p.hasPermission("speedboost.jump.two")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 1));
        }
        if(p.hasPermission("speedboost.jump.three")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 2));
        }
    }
    
    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event){
        Player p = (Player) event.getPlayer();
        if(p.hasPermission("speedboost.speedboost.one")) {
        	p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 0));
        }
        if(p.hasPermission("speedboost.speedboost.two")) {
        	p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
        }
        if(p.hasPermission("speedboost.speedboost.three")) {
        	p.removePotionEffect(PotionEffectType.SPEED);
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 2));
        }
        if(p.hasPermission("speedboost.jump.one")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 0));
        }
        if(p.hasPermission("speedboost.jump.two")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 1));
        }
        if(p.hasPermission("speedboost.jump.three")) {
        	p.removePotionEffect(PotionEffectType.JUMP);
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 18000, 2));
        }
    }
}