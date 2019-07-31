package behavioral.state;

import behavioral.state.entity.Context;
import behavioral.state.impl.StartState;
import behavioral.state.impl.StopState;
import org.junit.Test;

import static org.junit.Assert.*;

public class StateTest {
    @Test
    public void doAction() throws Exception {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}