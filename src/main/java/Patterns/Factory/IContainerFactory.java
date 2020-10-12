package Patterns.Factory;

import Patterns.Factory.abstractContainer;

public interface IContainerFactory {
    abstractContainer ByName(String containerName);
}
