package Patterns.Adapter;

public class stone implements IheavyItem {
    @Override
    public void drop() {
        System.out.println("dropping");
    }

    @Override
    public void take() {

    }
}
