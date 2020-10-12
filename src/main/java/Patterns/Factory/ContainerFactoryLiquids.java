package Patterns.Factory;

/*
*  This is liquids container Factory
*
* */
public class ContainerFactoryLiquids implements IContainerFactory {
    public abstractContainer ByName(String containerName){
        if ("Cup".equals(containerName)) {
            return new Cup();
        }
        if("Jar".equals(containerName)){
            return  new Jar();
        }
        return null;
    }

}

