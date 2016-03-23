import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Event> data = new ArrayList();
        int[] p = {2000,3,4};
        int[] y = {4,5,5};
        data.add(new Event(1.0, "Event 1", p, y, "Notes", true, 0));
        data.add(new Event(2.0, "Event 2", p, y, "More Notes", false, 1));
        for(Event e : data)
        {
            System.out.println("Event Name: " + e.getEventName()); // + " Year: " + e.getEventStart() + " Month: " + e.getEventEnd() + " Day: " + e.eStart.get(5));
        }  
        System.out.println("TESTING PROJECT");
        Project project1 = new Project("project1", p ,y);
        Event event1 = new Event(1.0, "Event 1", p, y, "Notes", true, 0);
        Event event2 = new Event(2.0, "Event 2", p, y, "More Notes", false, 1);
        project1.addEvent(event1);
        project1.addEvent(event2);
        System.out.println(project1.getSize());
        project1.getEventList().stream().forEach((e) -> {
            System.out.println("ID:: " + e.getID() + "Event Name: " + e.getEventName()); // + " Year: " + e.eStart.get(1) + " Month: " + e.eStart.get(2) + " Day: " + e.eStart.get(5));
        });

//testing Project.checkDuplicate(id)
        System.out.println(project1.checkDuplicate(1.0)); //false
        System.out.println(project1.checkDuplicate(1.1));
        System.out.println(project1.checkDuplicate(2.0)); //false
        System.out.println(project1.checkDuplicate(3.0));
        
        //testing adding duplicate events.
        Project project3 = new Project("project 3,", p, y);
        Event event4 = new Event(2.0, "Event 2", p, y, "More Notes", false, 1);
        Event event5 = new Event(2.0, "Event 2", p, y, "More Notes", false, 1);
        Event event6 = new Event(6.0, "Event 2", p, y, "More Notes", false, 1);
        project3.addEvent(2.0, event4);
        System.out.println(project3.getSize()); // expected 1
        project3.addEvent(2.0, event5);
        System.out.println(project3.getSize()); // expected 1
        project3.addEvent(6.0, event6);
        System.out.println(project3.getSize()); // expected 2   
       
        
        //testing event depenancies
        //add dependancy to event1 in project3.
        //If / else clause will nt be needed if using Drop-downs.
     /*   Project projectDepTest = new Project("projectDepTest", p ,y);
        Double x = 7.0;
        Event eventDepTest = new Event(1.0, "EventDepTest", p, y, "More Notes", false, 1);
        projectDepTest.addEvent(eventDepTest);
        if (projectDepTest.checkDuplicate(x) != true) {
            eventDepTest.addDependancy(x);
        } else {
            System.out.println("Cannot add dependancy where there is no Event.");  
        }        
        eventDepTest.getEventDependancy();

*/
     //Package used to test WBT.
     
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


