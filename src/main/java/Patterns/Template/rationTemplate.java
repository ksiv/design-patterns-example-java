package Patterns.Template;

public abstract class rationTemplate {
    abstract void utensils();
    abstract void water();
    abstract void food();

    /*
    * This is whole idea
    * so I won't do much work on this pattern
    * this can be "final", so called hardcode :-)
    * this all can be about construction or behaviour that should be the same
    * for every child class.
    *
    * */

    void pack(){
        food();
        water();
        utensils();
    }
}

class europeanPack extends rationTemplate {
     void utensils() {

     }
     void water(){
     }
     void food(){}

}
class chinesePack extends rationTemplate {
    void utensils() {
        // extra sticks
    }
    void water(){
    }
    void food(){}
}