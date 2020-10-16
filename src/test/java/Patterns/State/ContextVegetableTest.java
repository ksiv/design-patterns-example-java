package Patterns.State;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContextVegetableTest {

    /*
    *   In this example
    *
    * */

    @Test
    void changeOfStateChangesBehaviour(){
        Vegetable cucumber = new Vegetable();
        new unprocessed(cucumber).wash();
        Assertions.assertEquals("washed",cucumber.getState().toString());

        Vegetable potato = new Vegetable();
        new unprocessed(potato).wash().cook().serve();
        Assertions.assertEquals("served",potato.getState().toString());

    }

}