package kd8lvt.playerplates;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import org.bukkit.plugin.java.annotation.plugin.author.Authors;

@Plugin(name = "PlayerPlates", version = "1.1")
@ApiVersion(ApiVersion.Target.v1_13)
@Author("kd8lvt")
@Author("PureSpider")
public final class PlayerPlates extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new EventsHandler(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
