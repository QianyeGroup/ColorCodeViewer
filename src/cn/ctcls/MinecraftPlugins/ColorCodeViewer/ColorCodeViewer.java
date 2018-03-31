package cn.ctcls.MinecraftPlugins.ColorCodeViewer;

/*
©2016 - 2018 锦州千叶科技有限公司 All rights reserved.
作者：真心 QQ：1307993674
主页：blog.ctcls.cn 
码云：https://gitee.com/CTCL
GitHub：https://github.com/CTCLS
 */
//Java库
import java.io.File;
//Bukkit库
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ColorCodeViewer extends JavaPlugin { //继承JavaPlugin

    FileConfiguration config = getConfig(); //配置文件读取

    @Override
    public void onEnable() { //加载信息
        CreateConfig();
        getLogger().info("§bColorCodeViewer §e>>> §a插件已加载完成!");
    }

    @Override
    public void onDisable() { //卸载信息

    }

    public void CreateConfig() { //配置文件检测
        if (!new File(getDataFolder() + File.separator + "config.yml").exists()) {
            saveDefaultConfig();
            getLogger().info("§bColorCodeViewer §e>>> §a无法找到配置文件,正在创建!");
        }
        try {
            reloadConfig();
            getLogger().info("§bColorCodeViewer §e>>> §a成功加载或重载配置文件!");
        } catch (Exception e) {
            e.printStackTrace();
            getServer().getPluginManager().disablePlugin(this);
            getLogger().info("§bColorCodeViewer §e>>> §c无法读取配置文件,请检查是否错误!");
        }
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) { //指令输出
        if (cmd.getName().equalsIgnoreCase("ccv")) {
            sender.sendMessage(config.getString("InfoPrefix") + "§a================§c颜色代码§a================");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&0 §0黑色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&1 §1深蓝         §a&2 §2深绿         §a&3 §3湖蓝");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&4 §4深红         §a&5 §5紫色         §a&6 §6金色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&7 §7灰色         §a&8 §8深灰         §a&9 §9靛蓝");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&a §a鲜绿         §a&b §b水蓝         §a&c §c红色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&d §d粉色         §a&e §e黄色         §a&f §f白色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a================§c样式代码§a================");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&r §r默认字体");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&l §r§l加粗§r         §a&o §r§o倾斜");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&n §r§n下划线§r       §a&m §r§m删除线");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("colorcodeviewer")) {
            sender.sendMessage(config.getString("InfoPrefix") + "§a================§c颜色代码§a================");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&0 §0黑色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&1 §1深蓝         §a&2 §2深绿         §a&3 §3湖蓝");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&4 §4深红         §a&5 §5紫色         §a&6 §6金色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&7 §7灰色         §a&8 §8深灰         §a&9 §9靛蓝");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&a §a鲜绿         §a&b §b水蓝         §a&c §c红色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&d §d粉色         §a&e §e黄色         §a&f §f白色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a================§c样式代码§a================");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&r §r默认字体");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&l §r§l加粗§r         §a&o §r§o倾斜");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&n §r§n下划线§r       §a&m §r§m删除线");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("color")) {
            sender.sendMessage(config.getString("InfoPrefix") + "§a================§c颜色代码§a================");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&0 §0黑色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&1 §1深蓝         §a&2 §2深绿         §a&3 §3湖蓝");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&4 §4深红         §a&5 §5紫色         §a&6 §6金色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&7 §7灰色         §a&8 §8深灰         §a&9 §9靛蓝");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&a §a鲜绿         §a&b §b水蓝         §a&c §c红色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&d §d粉色         §a&e §e黄色         §a&f §f白色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a================§c样式代码§a================");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&r §r默认字体");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&l §r§l加粗§r         §a&o §r§o倾斜");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&n §r§n下划线§r       §a&m §r§m删除线");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("colorcode")) {
            sender.sendMessage(config.getString("InfoPrefix") + "§a================§c颜色代码§a================");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&0 §0黑色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&1 §1深蓝         §a&2 §2深绿         §a&3 §3湖蓝");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&4 §4深红         §a&5 §5紫色         §a&6 §6金色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&7 §7灰色         §a&8 §8深灰         §a&9 §9靛蓝");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&a §a鲜绿         §a&b §b水蓝         §a&c §c红色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&d §d粉色         §a&e §e黄色         §a&f §f白色");
            sender.sendMessage(config.getString("InfoPrefix") + "§a================§c样式代码§a================");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&r §r默认字体");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&l §r§l加粗§r         §a&o §r§o倾斜");
            sender.sendMessage(config.getString("InfoPrefix") + "§a&n §r§n下划线§r       §a&m §r§m删除线");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("color.reload")) {
            CreateConfig();
            return true;
        }
        return false;
    }
}
