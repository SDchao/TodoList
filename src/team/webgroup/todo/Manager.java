package team.webgroup.todo;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager {
    private ArrayList<Event> eventArrayList;

    public Manager() {
        this.eventArrayList = new ArrayList<>();
    }

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
        Event eventToset=eventArrayList.get(index);
        eventToset.setCompleted(isCompleted);
    }
    public void modifyEvent(int index, String newTitle, String newContent) {
        Event eventToModify = eventArrayList.get(index);    // Get the target event from the list
        eventToModify.setTitle(newTitle);   // call target event's setTitle function to change the title
        eventToModify.setContent(newContent);
    }
}
