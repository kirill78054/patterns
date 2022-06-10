package patterns.abstra.factory;

import creational.patterns.abstra.factory.Factory;
import creational.patterns.abstra.factory.MacFactory;
import creational.patterns.abstra.factory.WinFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {

    @Test
    public void winFactoryPrintTest() {
        Factory factory = new Factory(new WinFactory());
        assertEquals("Checkbox Win Button Win",  factory.paint());
    }

    @Test
    public void macFactoryPrintTest() {
        Factory factory = new Factory(new MacFactory());
        assertEquals("Checkbox Mac Button Mac",  factory.paint());
    }

}
