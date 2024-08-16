package cc.synkdev.chatWatchdogAPI.bukkit.events;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

public class MesageDeleteEvent extends Event implements Cancellable {
    Boolean cancel = false;
    @Getter private static final HandlerList HANDLERS_LIST = new HandlerList();
    @Getter private String message;
    @Getter private List<String> censorList;
    @Getter private Player player;

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean b) {
        cancel = b;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public MesageDeleteEvent(Player player, String message, List<String> censorList) {
        this.player = player;
        this.message = message;
        this.censorList = censorList;
    }
}
