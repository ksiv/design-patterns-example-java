package Patterns.Bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
    /*
    * Bridge is same as strategy only here it is not a single encounter but a structural basis
    * Deliverables can vary as well as delivery methods
    * This is one of patters a hard to understand because not everyone ever encounters a case
    * where it is useful. One may wonder, where is a bridge? Well programmers never been good
    * in communications
    * */
class BridgeTest {
    @Test
    public void test(){
        Deliverable electronicMail = new Email(new ElectronicDelivery());
        Mail mail = new Mail(new GroundDelivery());
        Assertions.assertEquals(mail.send(),"you paid packaging, stamps and got a post office receipt");
        Assertions.assertEquals(electronicMail.send(),"you got a mailer daemon response");

    }

}