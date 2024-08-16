package cc.synkdev.chatWatchdogAPI.bungee.events;

import lombok.Getter;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Event;

import java.util.List;

public class MessageDeleteEvent extends Event {
    @Getter private String message;
    @Getter private List<String> censorList;
    @Getter private ProxiedPlayer player;
    public MessageDeleteEvent(String message, List<String> censorList, ProxiedPlayer player) {
        this.message = message;
        this.censorList = censorList;
        this.player = player;
    }
}
