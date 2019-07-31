package behavioral.strategy;

import behavioral.strategy.impl.OperationAdd;
import behavioral.strategy.impl.OperationMultiply;
import behavioral.strategy.impl.OperationSubstract;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {
    @Test
    public void executeStrategy() throws Exception {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}