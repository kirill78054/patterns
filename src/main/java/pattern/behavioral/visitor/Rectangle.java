package pattern.behavioral.visitor;

public class Rectangle implements Shape {

    private int x, y;

    public void specialMethodRectangle() {
        System.out.println("Вызов специального метода только у Rectangle\n");
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник с координатами x=" + x + ", y=" + y);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
