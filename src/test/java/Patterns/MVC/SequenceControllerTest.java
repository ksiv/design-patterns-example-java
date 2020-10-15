package Patterns.MVC;

import org.junit.jupiter.api.Test;

class SequenceControllerTest {

    @Test
    void MVCtest() {
        SequenceController controller = new SequenceController();
        controller.clickGetNextButton();
        controller.clickGetNextButton();
        controller.clickResetButton();
        controller.clickGetNextButton();

    }

}