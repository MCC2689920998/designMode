package behavioral.interpreter.impl;

import behavioral.interpreter.Expression;

/**
 * @Author MCC
 * @Create 2019/7/31 10:24
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
