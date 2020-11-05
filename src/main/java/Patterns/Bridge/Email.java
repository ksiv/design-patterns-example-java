package Patterns.Bridge;

public class Email extends Deliverable {
    protected Email(Ideliverable implementation) {
        super(implementation);
    }

    @Override
    public String send() {
        return implementation.send();
    }
}
