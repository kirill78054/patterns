package pattern.behavioral.visitor;

public class Circle implements Shape {

    private int x, y;

    public void specialMethodCircle() {
        System.out.println("Вызов специального метода только у Circle\n");
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с координатами x=" + x + ", y=" + y);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }

}
