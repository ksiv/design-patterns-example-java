package Patterns.State;

    /*
    * States linked via abstraction
    * */

public abstract class abstractState {
    String operate(Door door){
        return null;
    }
}
class opened extends abstractState {
    @Override
    String operate(Door door) {
        door.setState(new closed());
        return "closing";

    }
}
class closed extends abstractState {
    @Override
    String operate(Door door) {
        door.setState(new opened());
        return "opening";
    }

}
