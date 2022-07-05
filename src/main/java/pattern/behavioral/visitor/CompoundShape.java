package pattern.behavioral.visitor;

public class CompoundShape implements Shape {

    private int x, y;

    public void specialMethodCompoundShape() {
        System.out.println("Вызов специального метода только у CompoundShape\n");
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем составную форму с координатами x=" + x + ", y=" + y);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompoundShape(this);
    }

}
