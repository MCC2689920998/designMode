package behavioral.state.impl;

import behavioral.state.State;
import behavioral.state.entity.Context;

/**
 * @Author MCC
 * @Create 2019/7/31 13:06
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop  state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop  State";
    }

}
