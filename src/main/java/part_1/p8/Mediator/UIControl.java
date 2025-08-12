package part_1.p8.Mediator;

import java.util.List;
import java.util.ArrayList;

public class UIControl {

    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer) {
        eventHandlers.add(observer);
    }

    protected void notifyEventHandlers() {
        for (EventHandler observer : eventHandlers)
            observer.handle();
    }

}
