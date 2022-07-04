package pattern.behavioral.strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrategyTest {

    @Test
    public void executionTest() {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        assertEquals(3, context.executeStrategy(1, 2));

        context.setStrategy(new ConcreteStrategySubtract());
        assertEquals(3, context.executeStrategy(5, 2));

        context.setStrategy(new ConcreteStrategyMultiply());
        assertEquals(10, context.executeStrategy(5, 2));
    }

}
