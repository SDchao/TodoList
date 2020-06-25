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


} 
