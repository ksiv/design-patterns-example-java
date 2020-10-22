package Patterns.Decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaterBottlingProcessDecorationTest {
    @Test
    void watterBottlingTest(){
        // non decorated
        oldGoodLiquidProducer simpleWater = new oldGoodLiquidProducer();
        Assertions.assertEquals("water in a bottle",simpleWater.produce("water","a bottle"));
        Assertions.assertEquals("oil in a phial",simpleWater.produce("oil","a phial"));
        // decorated
        labeledBottleWater labeledBottleWater = new labeledBottleWater(simpleWater);
        //labeledBottleWater.setLabel("test");
        Assertions.assertEquals("juice in a glass bottle with test label",labeledBottleWater.produce("juice","a glass bottle"));
    }

}