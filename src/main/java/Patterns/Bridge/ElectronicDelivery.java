package Patterns.Bridge;

public class ElectronicDelivery implements Ideliverable {
    @Override
    public String send() {
        return "you got a mailer daemon response";
    }

}
