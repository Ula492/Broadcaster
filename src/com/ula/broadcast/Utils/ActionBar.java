package com.ula.broadcast.Utils;

import net.minecraft.server.v1_11_R1.IChatBaseComponent;
import net.minecraft.server.v1_11_R1.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

/**
 * Created by Ula on 11/29/16.
 */
public class ActionBar {

    public static void sendActionBar(Player p, String message)
    {
        IChatBaseComponent cbc = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + message + "\"}");
        PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc, (byte)2);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(ppoc);
    }

}
