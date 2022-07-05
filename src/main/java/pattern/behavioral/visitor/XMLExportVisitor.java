package pattern.behavioral.visitor;

/*
Особенность реализации в том, что мы вызываем не только стандартные методы,
которые есть у интерфейса Shape, но и скрытое(не общее) поведение у каждого обьекта.
*/
public class XMLExportVisitor implements Visitor {

    @Override
    public void visitDot(Dot d) {
        d.move(1, 2);
        d.draw();
        d.specialMethodDot();
    }

    @Override
    public void visitCircle(Circle c) {
        c.move(2, 2);
        c.draw();
        c.specialMethodCircle();
    }

    @Override
    public void visitRectangle(Rectangle r) {
        r.move(2, 3);
        r.draw();
        r.specialMethodRectangle();
    }

    @Override
    public void visitCompoundShape(CompoundShape cs) {
        cs.move(3, 3);
        cs.draw();
        cs.specialMethodCompoundShape();
    }

}
