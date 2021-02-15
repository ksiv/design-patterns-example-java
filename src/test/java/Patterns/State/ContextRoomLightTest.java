package Patterns.State;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContextRoomLightTest {

    /*
    *   Here a room light with pull cord switch. One pull the cord to turn light on \off
    *   These are common on light sources, and ceiling fans.
    *   One method "pullTheCord" that does an action depending on current state.
    *
    * */

    @Test
    void changeOfStateChangesBehaviour(){
        RoomLight statefulRoomLight = new RoomLight();
        statefulRoomLight.setState(new off());

        Assertions.assertEquals("on",statefulRoomLight.pullTheCord());

        Assertions.assertEquals("off",statefulRoomLight.pullTheCord());

        Assertions.assertEquals("on",statefulRoomLight.pullTheCord());

    }

}