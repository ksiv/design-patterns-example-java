package Patterns.Singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SingletonTest {
    @Test
    public void leftTurnIndicator()  {
        StearingSingleton.getInstance().turnLeft();
        Assertions.assertTrue(this::isLeftTurnSignalBlinking);
        Assertions.assertFalse(this::isRightTurnSignalBlinking);
        StearingSingleton.getInstance().turnRight();
        Assertions.assertTrue(this::isRightTurnSignalBlinking);
        Assertions.assertFalse(this::isLeftTurnSignalBlinking);
    }
    // State Subscriber
    private boolean isRightTurnSignalBlinking() {
        if(StearingSingleton.getInstance().getTurnSide().equals("right")){
            return true;
        }
        return false;
    }
    // State Subscriber
    private boolean isLeftTurnSignalBlinking() {
        if(StearingSingleton.getInstance().getTurnSide().equals("left")){
            return true;
        }
        return false;
    }
}