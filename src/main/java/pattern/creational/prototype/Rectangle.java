package pattern.creational.prototype;

import lombok.Getter;

@Getter
public class Rectangle extends Shape {

    private final int width, height;

    public Rectangle(Rectangle rectangle) {
        this(rectangle.x, rectangle.y, rectangle.color, rectangle.width, rectangle.height);
    }

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

}
