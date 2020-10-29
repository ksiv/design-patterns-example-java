package Patterns.Prototype;

public abstract class nativeClonableItem implements Cloneable{
    public nativeClonableItem clone() throws CloneNotSupportedException {
        // call to native Java cloning method
        return (nativeClonableItem)super.clone();
    }
}

class icecream extends nativeClonableItem{
    topping topping;
    @Override
    public nativeClonableItem clone() throws CloneNotSupportedException {
        icecream clonedIcecream =(icecream)super.clone();
        clonedIcecream.setTopping((topping) this.topping.clone());
        return clonedIcecream;
    }

    public void setTopping(Patterns.Prototype.topping topping) {
        this.topping = topping;
    }

    public Patterns.Prototype.topping getTopping() {
        return topping;
    }
}

class topping extends  nativeClonableItem{
    String toppingName;

    public topping(String toppingName) {
        this.toppingName = toppingName;
    }

    @Override
    public nativeClonableItem clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getToppingName() {
        return toppingName;
    }
}