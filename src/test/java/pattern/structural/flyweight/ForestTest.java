package pattern.structural.flyweight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForestTest {

    @Test
    public void getCacheSizeTest() {
        Forest forest = new Forest();
        forest.planTree(1, 2, "Kirill", "Red");
        forest.planTree(3, 4, "Kirill", "Red");
        forest.planTree(4, 5, "Andrey", "Black");
        forest.draw();

        assertEquals(2, forest.getCacheSize());
    }

}
