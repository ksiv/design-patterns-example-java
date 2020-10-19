package Patterns.Observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketQueueTest {

    @Test
    void allFolkInTheQueueGotTheNews(){
        TicketQueue queueForGameOfTheYear = new TicketQueue();
        Person Joe = new Person();
        Person Alice = new Person();
        Joe.takePlaceInTheQueue(queueForGameOfTheYear);
        Alice.takePlaceInTheQueue(queueForGameOfTheYear);
        Assertions.assertEquals("",Joe.wazzup());
        Assertions.assertEquals("",Alice.wazzup());
        queueForGameOfTheYear.eventUpdate("sold out");
        Assertions.assertEquals("sold out",Joe.wazzup());
        Assertions.assertEquals("sold out",Alice.wazzup());
    }
}