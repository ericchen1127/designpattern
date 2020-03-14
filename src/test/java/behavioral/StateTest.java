package behavioral;

import com.eric.designpattern.behavioral.state.AngryState;
import com.eric.designpattern.behavioral.state.StateContext;
import org.junit.Test;

public class StateTest {
    @Test
    public void testState() {
        final StateContext stateContext = new StateContext();
        stateContext.setState(new AngryState());
        for (int i = 0; i < 10; i++) {
            stateContext.act();
        }
    }
}
