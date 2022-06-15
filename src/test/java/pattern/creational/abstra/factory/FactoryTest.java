package pattern.creational.abstra.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {

    @Test
    public void winFactoryPrintTest() {
        Factory factory = new Factory(new WinFactory());
        assertEquals("Checkbox Win Button Win", factory.paint());
    }

    @Test
    public void macFactoryPrintTest() {
        Factory factory = new Factory(new MacFactory());
        assertEquals("Checkbox Mac Button Mac", factory.paint());
    }

}
