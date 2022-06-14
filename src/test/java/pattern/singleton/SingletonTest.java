package pattern.singleton;

import pattern.creational.singleton.Singleton;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class SingletonTest {

    @Test
    public void getInstanceTest() {
        final String name = "Kirill";
        Singleton kirillInstance = Singleton.getInstance(name);
        Singleton andreyInstance = Singleton.getInstance("Andrey");
        assertEquals(name, kirillInstance.getName());
        assertEquals(name, andreyInstance.getName());
    }

}
