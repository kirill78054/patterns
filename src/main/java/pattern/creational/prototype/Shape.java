package pattern.creational.prototype;

public abstract class Shape {

    protected int x, y;
    protected String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getSquare() {
        return x*y;
    }

    public abstract Shape clone();

}
