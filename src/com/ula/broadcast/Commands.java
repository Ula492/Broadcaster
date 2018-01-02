package com.ula.broadcast;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Ula on 11/29/16.
 */
public class Commands implements CommandExecutor {


    String Prefix = "§8 Broadcaster > §r";


    public boolean onCommand(final CommandSender cs, Command cmd, String label, final String[] args) {

        /*
        /broadcaster: usage /broadcaster  : Shows all the commands for the plugin Broadcaster
        /bTitle: usage /bTitle send <Message> in stay out : Broadcasts a Title to all players
        /bActionBar: usage /bActionbar <Message> : Broadcasts an ActionBar to all players
         */


        if(cmd.getName().equalsIgnoreCase("Broadcaster")){
            if(args.length == 0) {
                cs.sendMessage(" " +
                               "§a§m=============================================\n" +
                               "§6/broadcaster  : Shows all the commands for the plugin Broadcaster\n" +
                               "§6/bTitle send <Message> in stay out : Broadcasts a Title to all players\n" +
                               "§6/bActionbar <Message> : Broadcasts an ActionBar to all players\n" +
                               "§a§m=============================================\n"+
                               "");
                return true;
            }
            //Other things here
        }
        if(cmd.getName().equalsIgnoreCase("bTitle")){
            if(args.length == 0){
                cs.sendMessage("\n" +
                               "§a§m=============================================\n" +
                               "\n" +
                               "§6/bTitle send <Message> in stay out : Broadcasts a Title to all players\n" +
                               "\n" +
                               "§a§m=============================================\n" +
                               "\n");
                return true;
            }
            if(args[0].equalsIgnoreCase("send")){
                // /bTitle send <Message> in stay out
                //         0     1        2   3    4

                if(args.length == 1) {
                    cs.sendMessage(Prefix + "§4You must enter a message to broadcast");
                    return true;
                }

                String TMessage  = "";
                for(int i = 1; i < args.length; i++){
                    TMessage += args[i] + " ";
                }
                TMessage = TMessage.trim();


            }


        }
        return true;
    }


}
