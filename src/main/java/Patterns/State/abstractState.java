package Patterns.State;

    /*
    * States linked via abstraction
    * */

public abstract class abstractState {
    String pullTheCord(RoomLight roomLight){
        return null;
    }
}
class on extends abstractState {
    @Override
    String pullTheCord(RoomLight roomLight) {
        roomLight.setState(new off());
        return "off";
    }
}
class off extends abstractState {
    @Override
    String pullTheCord(RoomLight roomLight) {
        roomLight.setState(new on());
        return "on";
    }
}
