package Patterns.Prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class nativeClonableItemTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        icecream icecreamChocolateTop = new icecream();
        icecreamChocolateTop.setTopping(new topping("chocolate"));
        icecream icecreamChocolaTopSecond = (icecream)icecreamChocolateTop.clone();
        icecream icecreamWaffleTop = (icecream) icecreamChocolateTop.clone();
        icecreamWaffleTop.setTopping(new topping("Waffle"));
        Assertions.assertEquals(icecreamChocolateTop.topping.getToppingName(),"chocolate");
        Assertions.assertEquals(icecreamChocolaTopSecond.topping.getToppingName(),"chocolate");
        Assertions.assertEquals(icecreamWaffleTop.topping.getToppingName(),"Waffle");
        // native equals&hashcode
        Assertions.assertNotEquals(icecreamChocolateTop.hashCode(),icecreamWaffleTop.hashCode());
        Assertions.assertNotEquals(icecreamChocolateTop.topping.hashCode(),icecreamWaffleTop.topping.hashCode());

    }
}