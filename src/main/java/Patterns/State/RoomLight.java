package Patterns.State;

    /*
    * This is so called "Context" which is controlled by separate states
    * in every states different behaviour provided by state classes
    *
    * Category: Injected behaviour
    * */

public class RoomLight {

    abstractState state;

    public void setState(abstractState actions) {
        this.state = actions;
    }
    // Call a method of an injected class
    String pullTheCord(){
        return state.pullTheCord(this);
    }

}
