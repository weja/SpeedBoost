package com.neverseenbefore.weja.speedboost;
 

import org.bukkit.entity.HumanEntity;
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
    @Override
    public void onDisable(){
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player HumanEntity = event.getPlayer();
        if(HumanEntity.hasPotionEffect(PotionEffectType.SPEED)){
        	HumanEntity.removePotionEffect(PotionEffectType.SPEED);
        	 }
            HumanEntity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
            event.getPlayer().sendMessage("Speed Boost II has been refreshed!");
    }
    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event){
        HumanEntity HumanEntity = event.getPlayer();
        if(HumanEntity.hasPotionEffect(PotionEffectType.SPEED)){
        	HumanEntity.removePotionEffect(PotionEffectType.SPEED);
        	 }
        HumanEntity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 18000, 1));
    }
}