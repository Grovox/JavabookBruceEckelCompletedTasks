package innerclasses.controller2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new LinkedList<>();
    public void addEvent(Event c){
        eventList.add(c);
    }
    public void run(){
        /*while (eventList.size() > 0)
            for(Event e : new LinkedList<>(eventList)){
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }*/
        Iterator<Event> EL = eventList.iterator();
        while (EL.hasNext())
            System.out.println(EL.next());
    }
}
