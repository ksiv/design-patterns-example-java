package Patterns;

import static java.lang.Thread.sleep;

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
