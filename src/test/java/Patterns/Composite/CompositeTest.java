package Patterns.Composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {

    @Test
    void heatDistribution() {
        cookingGearComposite oven = new cookingGearComposite();
        cookingGearComposite bowl = new cookingGearComposite();
        cookingGearComposite cookingFoilPieceA = new cookingGearComposite();
        cookingGearComposite cookingFoilPieceB = new cookingGearComposite();
        foodItems potato = new foodItems();
        foodItems carrot = new foodItems();
        cookingFoilPieceA.add(potato);
        cookingFoilPieceB.add(carrot);
        bowl.add(cookingFoilPieceA);
        bowl.add(cookingFoilPieceB);
        oven.add(bowl);
        oven.heat(100, 20);
        Assertions.assertEquals(potato.temperature, 100);
        Assertions.assertEquals(carrot.minutes,20);
    }
}