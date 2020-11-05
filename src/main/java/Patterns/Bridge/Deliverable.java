package Patterns.Bridge;

public abstract class Deliverable {
    // Strategy Implementation injection
    protected Ideliverable implementation;
    protected Deliverable(Ideliverable implementation){
        this.implementation = implementation;
    }
    public abstract String send();
}

