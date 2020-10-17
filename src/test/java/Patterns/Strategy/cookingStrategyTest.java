package Patterns.Strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class cookingStrategyTest {

    @Test
    void cookingStrategyApplication() {
        multiCooker cooker;
        cooker = new multiCooker();
        food carrot = new food("carrot");
        cooker.load(carrot).setModeTo(new boil()).cook();
        Assertions.assertEquals("carrot soup", carrot.getName());
        // it will do soup until strategy is changed
        cooker.load(new food("onion")).cook();
        Assertions.assertEquals("onion soup", cooker.unload().getName());

        food potato = new food("potato");
        cooker.load(potato).setModeTo(new fry()).cook();
        Assertions.assertEquals("fried potato", potato.getName());


    }
}