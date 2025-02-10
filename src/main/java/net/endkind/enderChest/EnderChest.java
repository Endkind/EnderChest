package net.endkind.enderChest;

import net.endkind.enderChest.Command.OpenEnderChest;
import net.endkind.enderCore.platform.papermc.EnderPlugin;

public final class EnderChest extends EnderPlugin {
    private static EnderChest instance;

    @Override
    public void onPluginEnable() {
        instance = this;
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
