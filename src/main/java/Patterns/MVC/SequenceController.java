package Patterns.MVC;
  /*
  * Controller handles external imput and does routing of actions and events for model and view
  *
  * */
public class SequenceController {
    SequenceModel model = new SequenceModel(10);
    SequenceView view = new SequenceView();
    void clickResetButton(){
        model.restart();
        view.update(model.getCurrent());
    }
    void clickGetNextButton(){
        model.getNext();
        view.update(model.getCurrent());
    }
}
