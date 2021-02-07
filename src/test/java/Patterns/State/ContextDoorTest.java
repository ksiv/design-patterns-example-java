package Patterns.State;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContextDoorTest {

    /*
    *   Here a Door is an object that can have two states (open, closed)
    *   One method "operate" that does an action depending on current state.
    *
    * */

    @Test
    void changeOfStateChangesBehaviour(){
        Door statefulDoor = new Door();
        statefulDoor.setState(new closed());

        Assertions.assertEquals("opening",statefulDoor.operate());

        Assertions.assertEquals("closing",statefulDoor.operate());

        Assertions.assertEquals("opening",statefulDoor.operate());

    }

}