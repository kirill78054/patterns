package pattern.abstra.factory;

import org.junit.Test;
import pattern.creational.abstra.factory.Factory;
import pattern.creational.abstra.factory.MacFactory;
import pattern.creational.abstra.factory.WinFactory;

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
