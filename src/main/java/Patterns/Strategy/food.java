package Patterns.Strategy;

public class food {
    String name = "";
    food(String name){
        setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
