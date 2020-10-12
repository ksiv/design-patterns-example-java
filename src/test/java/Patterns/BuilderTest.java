package Patterns.Builder;

import Patterns.Builder.FoodItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class BuilderTest {

    @Test
    void makeFood(){
        FoodItem lemon = new FoodItem.Builder("Lemon").setColor("yellow").setTaste("sour").build();
        FoodItem Grape = new FoodItem.Builder("grape").setTaste("sweat").build();
        FoodItem Pumpkin = new FoodItem.Builder("Pumpkin").setColor("orange").build();
        Assertions.assertEquals(lemon.getTaste(),"sour");
        Assertions.assertEquals(Grape.getName(),"grape");
        Assertions.assertEquals(Pumpkin.getColor(),"orange");
    }
}