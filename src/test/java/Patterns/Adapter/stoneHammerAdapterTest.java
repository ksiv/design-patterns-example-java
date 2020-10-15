package Patterns.Adapter;

import org.junit.jupiter.api.Test;


class stoneHammerAdapterTest {
    /*
    *
    *  I have a set of tools to flatten items but I need to be able to flatten
    *  target items if I do not have a tool at hand
    *  so I adapt a heavy object like a stone as a flattening tool only when
    *  required.
    *
    * */

    @Test
    void flattenWithHammerTool() {
        hammer hammerSample = new hammer();
        hammerSample.flatten();
        hammerSample.nail();
    }
    @Test
    void flattenWithStone() {
        stone stoneSample = new stone();
        stoneHammerAdapter stoneAsAHammer  = new stoneHammerAdapter(stoneSample);
        stoneAsAHammer.flatten();
        stoneAsAHammer.nail();
    }
}