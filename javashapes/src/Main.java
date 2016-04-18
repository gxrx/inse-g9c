//Main class used to run shapes testing. 

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Event> data = new ArrayList();
        int[] p = {2000,3,4};
        int[] y = {4,5,5};
        
     //Test Drawing shapes.
     
        Project projectWBT = new Project("projectWBT", p ,y);
        Event event1a = new Event(1.0, "Event 1.0", p, y, "Notes", true, 0);
        Event event2a = new Event(1.1, "Event 1.1", p, y, "Notes", true, 0);
        Event event3a = new Event(1.2, "Event 1.2", p, y, "Notes", true, 0);
        Event event4a = new Event(1.3, "Event 1.3", p, y, "Notes", true, 0);
        Event event5a = new Event(2.0, "Event 2.0", p, y, "More Notes", false, 1);
        projectWBT.addEvent(event1a);
        projectWBT.addEvent(event2a);
        projectWBT.addEvent(event3a);
        projectWBT.addEvent(event4a);
        projectWBT.addEvent(event5a);
     
     
              ShapesEx wbt = new ShapesEx();
              wbt.run();
   
     
    }
    }


