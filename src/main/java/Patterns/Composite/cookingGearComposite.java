package Patterns.Composite;

import java.util.ArrayList;
    /*
    * If you know observer pattern already. composite is like hierarchical observation
    * */
public class cookingGearComposite implements Iheatable{
    private final ArrayList<Iheatable> childHeatable = new ArrayList<>();
    Integer temperature;
    Integer minutes;
    @Override
    public void heat(Integer degree, Integer minutes) {
        this.minutes = minutes;
        this.temperature = degree;
        for (Iheatable child : childHeatable){
            child.heat(degree,minutes);
        }
    }
        public void add(Iheatable child) {
            childHeatable.add(child);
        }

}
