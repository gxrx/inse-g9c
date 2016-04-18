/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GarethAllenStringer
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Event> data = new ArrayList();
        int[] p = {2000,3,4};
        int[] y = {4,5,5};
        /*
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
        */
        
        //DEMO
        System.out.println("DEMO START");
        //DEMO EVENT CLASS
        System.out.println("Event Class");
        System.out.println("Events have an ID, name, start and end dates, notes, a milestone proporty and a duration.");
        Event eventDemo = new Event(1.6, "Initial Sketches", p, y, "Notes", true, 3);
        System.out.println("After creating the Event, eventDemo, we can call methods to extract or change data. ");
        System.out.println("Event ID:" + eventDemo.getID() +", Event Name: " + eventDemo.getEventName() + ", Event Duration:" + eventDemo.getDuration());
        System.out.println();
        System.out.println("Events can also have dependancies. Event 1.6 is dependant on 1.5 and 1.4.");
        Event eventDemo2 = new Event(1.0, "Initial Sketches", p, y, "Notes", true, 3);
        Event eventDemo3 = new Event(1.0, "Initial Sketches", p, y, "Notes", true, 3);
        System.out.println("Calling getDependancies");
        eventDemo.setDependancy(1.5);
        eventDemo.setDependancy(1.4);
        eventDemo.getEventDependancy();
        System.out.println("This operation will be required for the PERT and GANTT charts.");
   
        System.out.println("------------------------------------------------");
        System.out.println("Projet Class");
        System.out.println("The project class has a set start and end date, and includes an array of vnts.");
        System.out.println("Adding Events - Calling Project methods.");
        Project projectDemo = new Project("Project 1,", p, y);
        projectDemo.addEvent(eventDemo);
        projectDemo.addEvent(eventDemo2);
        projectDemo.addEvent(eventDemo3);
        projectDemo.getEventList();

        
        
        
    }
    }

