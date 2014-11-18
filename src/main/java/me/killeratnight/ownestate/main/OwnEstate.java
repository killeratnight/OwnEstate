package me.killeratnight.ownestate.main;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Nicolas
 */
public class OwnEstate extends JavaPlugin{
  public static OwnEstate plugin;
  public PluginDescriptionFile pdf;
  public ConsoleCommandSender console;
  public String plname;
  
  @Override
  public void onDisable(){
    console.sendMessage(plname + "OwnEstate " + pdf.getVersion() + " successfully disabled.");
  }
  @Override
  public void onEnable(){
    plugin = this;
    pdf = getDescription();
    console = getServer().getConsoleSender();
    plname = ChatColor.DARK_AQUA + "[" + ChatColor.YELLOW + pdf.getName() + ChatColor.DARK_AQUA + "] " + ChatColor.GOLD;
    
    console.sendMessage(plname + "OwnEstate " + pdf.getVersion() + " successfully enabled");
    
    
  }
}
