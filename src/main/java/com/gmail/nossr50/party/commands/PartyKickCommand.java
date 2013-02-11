package com.gmail.nossr50.party.commands;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.nossr50.mcMMO;
import com.gmail.nossr50.events.party.McMMOPartyChangeEvent;
import com.gmail.nossr50.events.party.McMMOPartyChangeEvent.EventReason;
import com.gmail.nossr50.locale.LocaleLoader;
import com.gmail.nossr50.party.Party;
import com.gmail.nossr50.party.PartyManager;
import com.gmail.nossr50.util.Permissions;
import com.gmail.nossr50.util.Users;

public class PartyKickCommand implements CommandExecutor {
    private Player player;
    private Party playerParty;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!Permissions.hasPermission(sender, "mcmmo.commands.party.kick")) {
            sender.sendMessage(command.getPermissionMessage());
            return true;
        }

        switch (args.length) {
        case 2:
            player = (Player) sender;
            playerParty = Users.getPlayer(player).getParty();

            if (!playerParty.getLeader().equals(player.getName())) {
                sender.sendMessage(LocaleLoader.getString("Party.NotOwner"));
                return true;
            }

            OfflinePlayer target = mcMMO.p.getServer().getOfflinePlayer(args[1]);

            if (!playerParty.getMembers().contains(target)) {
                sender.sendMessage(LocaleLoader.getString("Party.NotInYourParty", args[1]));
                return true;
            }

            if (target.isOnline()) {
                Player onlineTarget = target.getPlayer();
                String partyName = playerParty.getName();

                McMMOPartyChangeEvent event = new McMMOPartyChangeEvent(onlineTarget, partyName, null, EventReason.KICKED_FROM_PARTY);
                mcMMO.p.getServer().getPluginManager().callEvent(event);

                if (event.isCancelled()) {
                    return true;
                }

                onlineTarget.sendMessage(LocaleLoader.getString("Commands.Party.Kick", partyName));
            }

            PartyManager.removeFromParty(target, playerParty);
            return true;

        default:
            sender.sendMessage(LocaleLoader.getString("Commands.Usage.2", "party", "kick", "<" + LocaleLoader.getString("Commands.Usage.Player") + ">"));
            return true;
        }
    }

}
