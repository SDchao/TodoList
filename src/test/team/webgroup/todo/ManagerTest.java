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

    //modify event
    manager.modifyEvent(1, "New 1st event title", "New 1st event content");
    Assert.assertEquals("New 1st event title", manager.getEvents().get(1).getTitle());
    Assert.assertEquals("New 1st event content", manager.getEvents().get(1).getContent());

    //TODO: setComplete
    manager.setComplete(2,true);
    Assert.assertEquals(true,manager.getEvents().get(2).isCompleted());

    //TODO: removeEvent
    manager.removeEvent(1);
    Assert.assertNull(event1);

}

} 
