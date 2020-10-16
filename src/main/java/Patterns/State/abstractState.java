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

    public chopped chop(){
        this.vegetable.setState(Vegetable.states.chopped);
        return new chopped(this.vegetable);
    }
}
class chopped extends abstractState {
    Vegetable vegetable;
    chopped(Vegetable vegetable){
        this.vegetable = vegetable  ;
    }

    public diced dice(){
        this.vegetable.setState(Vegetable.states.diced);
        return new diced(this.vegetable);
    }
}
class diced extends abstractState {
    Vegetable vegetable;
    diced(Vegetable vegetable){
        this.vegetable = vegetable  ;
    }

    public minced mince(){
        this.vegetable.setState(Vegetable.states.minced);
        return new minced(this.vegetable);
    }
}
class minced extends abstractState {
    Vegetable vegetable;

    minced(Vegetable vegetable) {
        this.vegetable = vegetable;
    }

}