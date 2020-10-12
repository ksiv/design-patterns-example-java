package Patterns.Singleton;
/*
*  Singleton is an idea of having executable-wide unique Object.
*  one can implement these via  private constructor or enum.
*  They most often used for storing DB connections and to
*  hold file/Socket handlers but not limited to.
*  Some call them "anti-pattern" but they actually an ideal
*  example of what OOP is for.
* */

public class SequenceSingleton {
    // Sequence logic
    private int currentValue = 0;
    // sync for thread safe nextValue
    public synchronized int getNext() {
        currentValue = currentValue + 1;
        //System.out.println("curr val" + currentValue);
        return currentValue;
    }
    // Singleton logic below
    private SequenceSingleton(){

    }
    private static SequenceSingleton INSTANCE;
    // sync for thread safe init
    public synchronized static SequenceSingleton getInstance() throws InterruptedException {

        // Lazy-initialization
        if(INSTANCE == null){
            INSTANCE = new SequenceSingleton();
        }
        return INSTANCE;
    }

}
