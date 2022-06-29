package pattern.behavioral.intermediary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MediatorTest {

    @Test
    public void sendTest() {
        ConcreteMediator m = new ConcreteMediator();

        Colleague c1 = new ConcreteColleague1(m);
        Colleague c2 = new ConcreteColleague2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        assertEquals("Colleague2 gets message: How are you?", c1.send("How are you?"));
        assertEquals("Colleague1 gets message: Fine, thanks", c2.send("Fine, thanks"));
    }

}
