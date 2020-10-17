package Patterns.Strategy;

    /*
    * Multicooker is a "Context" where different strategies
    * executed
    * */

public class multiCooker {
    food currentFood;
    IcookMethod method;

    multiCooker load(food food){
        this.currentFood = food;
        return this;
    }
    multiCooker setModeTo(IcookMethod method){
        this.method =method;
        return this;
    }
    multiCooker cook(){
        method.process(this.currentFood);
        return this;
    }
    food unload(){
        food unloadable = this.currentFood;
        this.currentFood = null;
        return unloadable;
    }
}
