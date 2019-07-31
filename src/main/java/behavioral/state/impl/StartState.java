package behavioral.state.impl;

import behavioral.state.State;
import behavioral.state.entity.Context;

/**
 * @Author MCC
 * @Create 2019/7/31 13:06
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }

}
