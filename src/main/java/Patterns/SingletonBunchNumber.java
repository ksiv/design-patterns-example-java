package Patterns;

import java.time.LocalDateTime;

public class SingletonBunchNumber {
    private static SingletonBunchNumber me;
    private static LocalDateTime time;
    private SingletonBunchNumber(){
        this.time = LocalDateTime.now();
        System.out.println(time);
    }
    private static SingletonBunchNumber getInstance(){
        // Lazy-initialization
        if(me == null){
            me = new SingletonBunchNumber();
        }
        return me;
    }
    public LocalDateTime getTime(){
        return this.time;
    }
}
