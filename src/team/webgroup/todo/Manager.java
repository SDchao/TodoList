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
    public void setComplete(int index,Boolean isCompleted)
    {
        eventArrayList.set(index);
        eventArrayList.set(isCompleted);
    }

    public void modifyEvent(int index,string newTitle,string newContent)
    {
        eventArrayList.modify(index);
        eventArrayList.modify(newTitle);
        eventArrayList.modify(newContent);
    }

}
