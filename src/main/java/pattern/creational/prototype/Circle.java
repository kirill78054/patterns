package pattern.creational.prototype;

import lombok.Getter;

@Getter
public class Circle extends Shape {

    private final int radius;

    public Circle(Circle circle) {
        this(circle.x, circle.y, circle.color, circle.radius);
    }

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

}
