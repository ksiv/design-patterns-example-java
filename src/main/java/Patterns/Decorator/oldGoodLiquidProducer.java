package Patterns.Decorator;

public class oldGoodLiquidProducer implements IbottledLiquid {
    @Override
    public String produce(String liquid, String bottle) {
        return liquid+" in "+bottle;
    }
}
