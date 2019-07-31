package behavioral.strategy.impl;

import behavioral.strategy.Strategy;

/**
 * @Author MCC
 * @Create 2019/7/31 14:36
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
