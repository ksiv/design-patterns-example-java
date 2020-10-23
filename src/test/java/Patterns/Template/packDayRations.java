package Patterns.Template;

import org.junit.jupiter.api.Test;

class packDayRations {

    @Test
    void differentStartupsOdSameTemplate() {
        new europeanPack().pack();
        new chinesePack().pack();
    }
}