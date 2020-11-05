package Patterns.Singleton;
/*
*  Singleton is an idea of having executable-wide unique Object.
*
* */

public class SteeringSingleton {
    //  logic
    private String turnDirection;
    public synchronized void turnLeft() {
        turnDirection = "left";
    }
    public synchronized void turnRight() {
        turnDirection = "right";
    }
    public synchronized String getTurnSide(){
        return turnDirection;
    }
    // Singleton logic below
    private SteeringSingleton(){

    }
    private static SteeringSingleton INSTANCE;
    public synchronized static SteeringSingleton getInstance() {

        if(INSTANCE == null){
            INSTANCE = new SteeringSingleton();
        }
        return INSTANCE;
    }

}
