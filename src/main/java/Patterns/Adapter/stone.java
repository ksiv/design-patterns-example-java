package Patterns.Adapter;

public class stone implements IheavyItem {


    @Override
    public void drop() {

    }

    @Override
    public void take() {

    }

    @Override
    public void crackShell() {
        System.out.println("rise up and bring down with a force");
    }
}
