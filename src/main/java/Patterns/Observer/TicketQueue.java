package Patterns.Observer;
import java.util.ArrayList;
import java.util.List;

    /*
    *   This is observable object class.
    *   it holds collection of object handlers
    *   and passes to these its state updates
    * */

public class TicketQueue {
    private List<Person> peopleInTheQueue = new ArrayList<>();
    void add(Person person){
        this.peopleInTheQueue.add(person);
    }
    void remove(Person person){
        this.peopleInTheQueue.remove(person);
    }
    void eventUpdate(String news){
        for( Person p : this.peopleInTheQueue) {
            p.gotNews(news);

        }

    }

}
