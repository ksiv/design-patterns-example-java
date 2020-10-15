package Patterns.Adapter;

public class hammer implements IhammerTool {

    @Override
    public void nail() {
        System.out.println("rise up and bring down with a force");
    }

    @Override
    public void flatten() {
        System.out.println("rise up and bring down with a force ");
    }


}
