package pattern.behavioral.state;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class StateTest {

    @Test
    public void heatTest() {
        StateContext context = new StateContext();

        assertThat(context.getState(), instanceOf(SolidState.class));
        assertEquals(context.getState().getName(), "solid");
        context.heat();

        assertThat(context.getState(), instanceOf(LiquidState.class));
        assertEquals(context.getState().getName(), "liquid");
        context.heat();

        assertThat(context.getState(), instanceOf(GaseousState.class));
        assertEquals(context.getState().getName(), "gaseous");
        context.heat();
    }

}
