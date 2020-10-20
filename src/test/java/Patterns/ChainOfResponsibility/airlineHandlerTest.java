package Patterns.ChainOfResponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class airlineHandlerTest {

    /*
    * There is a passenger handling chain a simple one :-)
    * as passengers come they put into the chain and if all links are ok they take off
    *
    * */

    @Test
    void boardingChainOfResponsibility() {
        Ihandler boardingProceduresHandlingChain = new startHandler();
        // Penny is all around nice girl
        Passenger Penny = new Passenger("ok","ok","ok");
        Assertions.assertEquals("bon voyage",boardingProceduresHandlingChain.handle(Penny));
        // Jonny carrying illegal stuff.
        Passenger Jonny = new Passenger("drugs","ok","ok");
        // lets run them through check chain
        Assertions.assertEquals("stuck on custom",boardingProceduresHandlingChain.handle(Jonny));
    }
}