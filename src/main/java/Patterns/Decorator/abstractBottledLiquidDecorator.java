package Patterns.Decorator;

// Decorator implements original interface
public abstract class abstractBottledLiquidDecorator implements IbottledLiquid{
    protected IbottledLiquid bottledLiquidDecorated;

    public abstractBottledLiquidDecorator(IbottledLiquid bottledLiquidToDecorate) {
        this.bottledLiquidDecorated = bottledLiquidToDecorate;
    }

    @Override
    public String produce(String liquid, String bottle) {
        return bottledLiquidDecorated.produce(liquid,bottle);
    }

}

// concrete decorator
class labeledBottleWater extends abstractBottledLiquidDecorator{

    public labeledBottleWater(IbottledLiquid bottledLiquidToDecorate){
        super(bottledLiquidToDecorate);
    }

    @Override
    public String produce(String liquid, String bottle) {
        return super.produce(liquid, bottle)+getLabel();
    }
    //Decoration method
    public String getLabel(){
        // load label from somewhere
        return " with test label";
    }
}