package Patterns.MVC;

public class SequenceView {
    /*
    *  View component most times a subscriber it deals only with representation
    *  This is plain text view
    *  it could be easily changed to XML or JSON
    *
    * */
    void update(Integer currentNumber){
        System.out.println("-- "+currentNumber+"  --");
    }
}
