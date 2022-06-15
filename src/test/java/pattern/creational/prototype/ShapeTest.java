package pattern.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeTest {

    @Test
    public void cloneRectangleGetSquareTest() {
        Rectangle clone = (Rectangle) new Rectangle(2, 2, "Синий", 11, 12).clone();
        assertEquals(2 * 2, clone.getSquare());
    }

    @Test
    public void cloneCircleGetSquareTest() {
        Circle clone = (Circle) new Circle(2, 2, "Синий", 11).clone();
        assertEquals(2 * 2, clone.getSquare());
    }

}
