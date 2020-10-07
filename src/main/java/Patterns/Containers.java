package Patterns;

import java.time.LocalDateTime;

abstract class abstractContainer {
    public abstract void fill();
}
class Cup extends abstractContainer {
    public void fill() {
        System.out.println("filling this Cup");
    }
    public void drink() {
        System.out.println("drinking from this Cup");
    }
}

class Jar extends abstractContainer {
    public void fill() {
        System.out.println("filling this Jar");
    }
}

class Box extends abstractContainer {
    public void fill() {
        System.out.println("filling this Box");
    }
}

class Crate extends abstractContainer {
    public void fill() {
        System.out.println("filling this Crate");
    }
}

