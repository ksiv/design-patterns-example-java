package Patterns.Factory;


class ContainerFactorySolids implements IContainerFactory {
    public abstractContainer ByName(String containerName){
        if ("Box".equals(containerName)) {
            return new Box();
        }
        if("Crate".equals(containerName)){
            return  new Crate();
        }
        return null;
    }

}
