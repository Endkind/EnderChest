package net.endkind.enderChest;

import net.endkind.enderChest.Command.OpenEnderChest;
import net.endkind.enderCore.platform.papermc.EnderPlugin;
import org.bukkit.command.CommandExecutor;

public final class EnderChest extends EnderPlugin implements CommandExecutor {
    private static EnderChest instance;

    @Override
    public void onPluginEnable() {
        registerBukkitCommand("ec", new OpenEnderChest());
    }

    @Override
    public void onPluginDisable() {}

    @Override
    public void reload() {}

    public static EnderChest getInstance() {
        return instance;
    }
}
