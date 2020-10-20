package Patterns.State;

    /*
    * This so called "Context" which is controlled by separate states
    * in every states different behaviour provided by state classes
    * */

public class Door {

    abstractState state;

    Door(){
    }

    public void setState(abstractState actions) {
        this.state = actions;
    }
    String operate(){
        return state.operate(this);
    }

}
