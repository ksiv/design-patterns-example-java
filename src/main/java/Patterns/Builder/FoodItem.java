package Patterns.Builder;

/*
* Builder pater is actually a flexible constructor
* It's main purpose to avoid building many constructors with different parameters
* If setters return "this" it also implements method chaining
*
* */

public class FoodItem {
    private String name;
    private String color;
    private String taste;
    private String smell;

    public String getColor(){
        return this.color;
    }
    public String getTaste(){
        return this.taste;
    }
    public String getSmell(){
        return this.smell;
    }
    public String getName(){
        return this.name;
    }

    private FoodItem(Builder builder){
        this.name = builder.name;
        this.color = builder.color;
        this.smell = builder.smell;
        this.taste = builder.taste;
    }
    static class Builder{
        private String name;
        private String color;
        private String taste;
        private String smell;

        public Builder(String name){
            this.name = name;
        }
        public Builder setTaste(String taste){
            this.taste = taste;
            return this;
        }
        public Builder setColor(String color){
            this.color = color;
            return this;
        }
        public Builder setSmell(String smell){
            this.smell = smell;
            return this;
        }
        public FoodItem build(){
            return new FoodItem( this);
        }
    }
}
