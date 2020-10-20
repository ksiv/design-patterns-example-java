package Patterns.State;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContextDoorTest {

    /*
    *   In this example veggies are "context".
    *   the rest are state wrappers which work on it
    *
    *
    * */

    @Test
    void changeOfStateChangesBehaviour(){
        Door statefulDoor = new Door();
        statefulDoor.setState(new closed());
        Assertions.assertEquals("opening",statefulDoor.operate());
        Assertions.assertEquals("closing",statefulDoor.operate());
        Assertions.assertEquals("opening",statefulDoor.operate());

        Door potato = new Door();
        //new unprocessed(potato).wash().cook().serve();
        //Assertions.assertEquals("served",potato.getState().toString());

    }

}