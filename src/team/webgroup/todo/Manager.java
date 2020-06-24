package team.webgroup.todo;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager {
    private ArrayList<Event> eventArrayList;

    public Manager(Event[] eventsToAdd) {
        this.eventArrayList = new ArrayList<>();
        eventArrayList.addAll(Arrays.asList(eventsToAdd));
    }

    public ArrayList<Event> getEvents() {
        return (ArrayList<Event>) eventArrayList.clone();
    }

    public void addEvent(Event e) {
        eventArrayList.add(e);
    }

    public void removeEvent(int index) {
        eventArrayList.remove(index);
    }
}
