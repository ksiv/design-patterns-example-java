package Patterns.State;

    /*
    * States linked via abstraction
    * It is absolutely not a must for them to be a chain style
    * but this is maybe the only way to avoid unbearable ugliness
    * of backward call like "new closedState(Window).open"
    * */

public abstract class abstractState {
    protected abstractState() {
    }
}
class unprocessed extends abstractState {
    Vegetable vegetable;
    unprocessed(Vegetable vegetable){
        this.vegetable = vegetable  ;
    }

    public washed wash(){
        this.vegetable.setState(Vegetable.states.washed);
        return new washed(this.vegetable);
    }
}
class washed extends abstractState {
    Vegetable vegetable;
    washed(Vegetable vegetable){
        this.vegetable = vegetable  ;
    }

    public cooked cook(){
        this.vegetable.setState(Vegetable.states.cooked);
        return new cooked(this.vegetable);
    }
}
class cooked extends abstractState {
    Vegetable vegetable;
    cooked(Vegetable vegetable){
        this.vegetable = vegetable  ;
    }

    public served serve(){
        this.vegetable.setState(Vegetable.states.served);
        return new served(this.vegetable);
    }
}
class served extends abstractState {
    Vegetable vegetable;
    served(Vegetable vegetable){
        this.vegetable = vegetable  ;
    }

}
