package net.netherserver.nethercore;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Status implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("nc")){
            if (args.length == 0) {
                sender.sendMessage("§eNetherCore command executed!");
                return true;
            } else {
                if (args[1].equalsIgnoreCase("version")) {
                    sender.sendMessage("§aNetherCore ver1.0-SNAPSHOT");
                }
            }
        }
        return false;
    }

}
