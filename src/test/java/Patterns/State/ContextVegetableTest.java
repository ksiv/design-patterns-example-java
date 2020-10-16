package Patterns.State;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContextVegetableTest {
    /*
    *
    * */

    @Test
    void changeOfStateChangesBehaviour(){
        Vegetable cucumber = new Vegetable();
        new unprocessed(cucumber).wash();
        Assertions.assertEquals("washed",cucumber.getState().toString());

        Vegetable potato = new Vegetable();
        new unprocessed(potato).wash().chop().dice().mince();
        Assertions.assertEquals("minced",potato.getState().toString());

    }

}