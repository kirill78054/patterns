package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Наблюдатель(Observer)

Создаёт механизм подписки, позволяющий одним объектам
следить и реагировать на события, происходящие в других
объектах.
*/
public class EventManager {

    private final Map<String, List<EventListeners>> listeners = new HashMap<>();

    public void subscribe(String eventType, EventListeners listener) {
        if (listeners.containsKey(eventType)) {
            listeners.get(eventType).add(listener);
        } else {
            List<EventListeners> list = new ArrayList<>();
            list.add(listener);
            listeners.put(eventType, list);
        }
    }

    public void unsubscribe(String eventType, EventListeners listener) {
        if (listeners.containsKey(eventType)) {
            listeners.get(eventType).remove(listener);
        }
    }

    public void notify(String eventType, String data) {
        listeners.get(eventType).forEach(listener -> listener.update(data));
    }

}
