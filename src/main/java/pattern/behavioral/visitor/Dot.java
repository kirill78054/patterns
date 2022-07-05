package pattern.behavioral.visitor;

public class Dot implements Shape {

    private int x, y;

    public void specialMethodDot() {
        System.out.println("Вызов специального метода только у Dot\n");
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем точку с координатами x=" + x + ", y=" + y);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
