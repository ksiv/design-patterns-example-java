package Patterns.Singleton;
/*
*  Singleton is an idea of having executable-wide unique Object.
*  one can implement these via  private constructor or enum.
*  They most often used for storing DB connections and to
*  hold file/Socket handlers but not limited to.
*  Some call them "anti-pattern" but they actually an ideal
*  example of what OOP is for.
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