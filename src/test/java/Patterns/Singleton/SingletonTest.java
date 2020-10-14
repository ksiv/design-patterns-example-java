package Patterns.Singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SingletonTest {
    @Test
    public void leftTurnIndicator()  {
        SteeringSingleton.getInstance().turnLeft();
        Assertions.assertTrue(this::isLeftTurnSignalBlinking);
        Assertions.assertFalse(this::isRightTurnSignalBlinking);
        SteeringSingleton.getInstance().turnRight();
        Assertions.assertTrue(this::isRightTurnSignalBlinking);
        Assertions.assertFalse(this::isLeftTurnSignalBlinking);
    }
    // State Subscriber
    private boolean isRightTurnSignalBlinking() {
        if(SteeringSingleton.getInstance().getTurnSide().equals("right")){
            return true;
        }
        return false;
    }
    // State Subscriber
    private boolean isLeftTurnSignalBlinking() {
        if(SteeringSingleton.getInstance().getTurnSide().equals("left")){
            return true;
        }
        return false;
    }
}