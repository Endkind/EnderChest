package net.endkind.enderChest.Command;

import net.endkind.enderChest.EnderChest;
import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class OpenEnderChest implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(EnderChest.getInstance().genMessage(
                    Component.text("This command can only be executed by players!")
            ));
        }

        Player player = (Player) sender;

        player.openInventory(player.getEnderChest());

        return true;
    }
}
