package com.ula.broadcast;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Ula on 11/29/16.
 */
public class Main extends JavaPlugin implements Listener {


    private static Plugin plugin;
    private static Main instance;

    public static Main getInstance()
    {
        return instance;
    }





    @Override
    public void onEnable(){
        Bukkit.getConsoleSender().sendMessage("§aBroadcaster 0.1 Alpha Enabled");

        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");

        plugin = this;
        instance = this;

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, this);



    }


    @Override
    public void onDisable(){


        Bukkit.getConsoleSender().sendMessage("§aBroadcaster 0.1 Alpha Disabled");

    }







}
