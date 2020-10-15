package Patterns.MVC;

/*
* Model is actually business data owner component
* it includes business logic in terms of raw functionality
* */

public class SequenceModel {
    private Integer currentInt =0;
    private Integer limit = 10;
    SequenceModel(Integer setLimitTo){
        this.limit = setLimitTo;
    }

    Integer getNext(){
        currentInt++;
        if (currentInt > limit){
            currentInt = 1;
        }
        return currentInt;
    }
    Integer getCurrent(){
        return currentInt;
    }
    void restart(){
        currentInt = 1;
    }

}
