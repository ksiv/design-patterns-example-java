package Patterns;
/*
* This is a "Super" Factory - because it produces other Factories
* nothing really "super" in it just a hierarchy thing
* this is Interface factory type as it produces objects of same interface
*
* */

public class ContainerFactoriesByType {
    public IContainerFactory ByType(String containerFactoryName){
        if ("liquids".equals(containerFactoryName)) {
            return new ContainerFactoryLiquids();
        }
        if("solids".equals(containerFactoryName)){
            return new ContainerFactorySolids();
        }
        return null;
    }

}

