package Patterns.Composite;

class foodItems implements Iheatable {
    Integer temperature;
    Integer minutes;

    @Override
    public void heat(Integer temperature, Integer minutes) {
        this.minutes = minutes;
        this.temperature = temperature;

    }
}
