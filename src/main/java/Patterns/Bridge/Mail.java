package Patterns.Bridge;

public class Mail extends Deliverable{
    protected Mail(Ideliverable implementation) {
        super(implementation);
    }
    @Override
    public String send() {
        return implementation.send();
    }
}
