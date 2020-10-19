package Patterns.Observer;

    /*
    *  This is a subscriber (observer) class. Objects handlers of this class
    *  will be injected into the object they need to get events from.
    * */

public class Person implements Iperson {
    String queueEvent = "";
    void takePlaceInTheQueue(TicketQueue queue){
        queue.add(this);
    }
    void freePlaceInTheQueue(TicketQueue queue){
        queue.remove(this);
    }
    public void gotNews(String news){
        this.queueEvent = news;
    }
    String wazzup(){
        return queueEvent;
    }
}
