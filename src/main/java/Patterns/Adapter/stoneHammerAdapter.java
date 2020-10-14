package Patterns.Adapter;

public class stoneHammerAdapter implements IhammerTool {
    private stone stoneSample;
    public stoneHammerAdapter(stone s){
        stoneSample = s;
    }
    @Override
    public void nail() {

    }

    @Override
    public void flatten() {
        stoneSample.drop();
    }

    @Override
    public void crush() {

    }
}
