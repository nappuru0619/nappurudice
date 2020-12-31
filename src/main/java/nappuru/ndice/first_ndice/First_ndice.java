package nappuru.ndice.first_ndice;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class First_ndice extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        class main {
            public void main(String[] args) {
                int min = 1;
                int max = 10;
                
                Random random = new Random();
                
                int value = random.nextInt(max + min) + min;
                System.out.println(value);

                Bukkit.getServer().broadcastMessage(sender.getName() + "は" + main.toString() + "をだした。");

            }
        }
        return true;
    }
}
