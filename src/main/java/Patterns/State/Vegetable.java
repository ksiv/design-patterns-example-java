package Patterns.State;

    /*
    * This so called "Context" which is controlled by separate states
    * in every states different behaviour provided by state classes
    * */

public class Vegetable {
    public enum states { unprocessed, washed, chopped, diced, minced,mashed}
    private states state;

    Vegetable(){
        this.setState(states.unprocessed);
    }
    states getState(){
        return this.state;
    }

    public void setState(states state) {
        this.state = state;
    }

}
