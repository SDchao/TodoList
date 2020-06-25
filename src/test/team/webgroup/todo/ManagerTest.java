package test.team.webgroup.todo; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.Assert;
import team.webgroup.todo.*;

import java.util.ArrayList;

public class ManagerTest {
    private Manager manager;

@Before
public void before() {
    manager = new Manager();
} 

@Test
public void testManager() {
    // add event
    Event event1 = new Event("1st event", "1st event content", false);
    Event event2 = new Event("2nd event", "2nd event content", false);
    manager.addEvent(event1);
    manager.addEvent(event2);

    // get events
    ArrayList<Event> events = manager.getEvents();
    Assert.assertEquals(events.get(0), event1);
    Assert.assertEquals(events.get(1), event2);

    //TODO: modify event
}
@Test
public void testremoveEvent(){
    Event event1 = new Event("1st event","1st event contest",false);
    manager.removeEvent(event1);

    ArrayList<Event> events = manager.removeEvents();
    Assert.assertNull(event1);
}
@Test
public void testsetComplete(){
    Event event1 = new Event("1st event","1st event contest",false);
    Event event2 = new Event("1st event","1st event contest",true);
    manager.setComplete(event1, Boolean isCompleted);

    ArrayList<Event> events = manager.setComplete();
    Assert.assertEquals(event1,event2);
}
@Test
public void testmodifyEvent(){
    Event event1 = new Event("1st event","1st event contest",false);
    Event event2 = new Event("2nd event","2nd event contest",false);
    manager.modifyEvent(event1,2nd event,2nd event contest);

    ArrayList<Event> events = manager.modifyEvents();
    Assert.assertEquals(event1,event2);
}


} 
