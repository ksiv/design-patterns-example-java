package Patterns.Strategy;

/*
 * Strategy concrete implementations
 * strategies of food cooking :-)
 * */

 class boil implements IcookMethod {
     public void process(food food){
         /*
         * Here happens all boil specific stuff
         * */
          food.setName(food.getName()+" soup");

     }

 }
 class fry implements IcookMethod {
     public void process(food food){
         /*
          * Here happens all fry specific stuff
          * */
         food.setName("fried "+food.getName());

     }
 }
 class steam implements IcookMethod {
     public void process(food food) {
         /*
          * Here happens all steaming specific stuff
          * */
         food.setName("steamed "+food.getName());
     }
 }


