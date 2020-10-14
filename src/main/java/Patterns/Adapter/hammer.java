package Patterns.Adapter;

public class hammer implements IhammerTool {

    @Override
    public void nail() {
        System.out.println("nail");
    }

    @Override
    public void flatten() {
        System.out.println("flattening ");
    }

    @Override
    public void crush() {
        System.out.println("crushing ");
    }
}
