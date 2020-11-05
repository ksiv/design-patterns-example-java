package Patterns.Bridge;

public class GroundDelivery implements Ideliverable{
    @Override
    public String send() {
        return "you paid packaging, stamps and got a post office receipt";
    }
}
