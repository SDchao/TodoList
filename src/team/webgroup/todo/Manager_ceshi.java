package team.webgroup.todo;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager {
    private ArrayList<Event> eventArrayList;
    private ArrayList<String> titleArrayList;
    private ArrayList<String> contentArrayList;
    private ArrayList<Boolean> isCompletedArrayList;

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
        isCompletedArrayList.set(index,isCompleted);
    }

    public void modifyEvent(int index,String newTitle,String newContent)
    {
        titleArrayList.set(index,newTitle);
        contentArrayList.set(index,newContent);
    }
}
