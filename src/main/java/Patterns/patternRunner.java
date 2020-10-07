package Patterns;
/*
* Get two different containers to fill
* Idea -  it hides completely the logic of container production.
*
* */
public class patternRunner {
    public static void main(String[] args) {
        // Old good step-by-step
        // Get a factory for liquids containers from the super-factory
        IContainerFactory liquidsContainers = new ContainerFactoriesByType().ByType("liquids");
        // get "Jar" container from the factory
        abstractContainer myJar = liquidsContainers.ByName("Jar");
        // fill the jar
        myJar.fill();
        // Same, but getting "Box" container via chaining style
        abstractContainer myBox = new ContainerFactoriesByType().ByType("solids").ByName("Box");
        // fill the box
        myBox.fill();
        // casting to Cup because it has an extra method "drink"
        Cup myCup = (Cup) new ContainerFactoriesByType().ByType("liquids").ByName("Cup");
        myCup.drink();
    }
}
