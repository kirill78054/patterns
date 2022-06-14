package pattern.prototype;

import org.junit.Test;
import pattern.creational.prototype.Circle;
import pattern.creational.prototype.Rectangle;

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
