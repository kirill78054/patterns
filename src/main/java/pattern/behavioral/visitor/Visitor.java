package pattern.behavioral.visitor;

/*
Посетитель(Visitor)

Позволяет добавлять в программу новые операции, не изменяя
классы объектов, над которыми эти операции могут выполнять-
ся.
*/
public interface Visitor {

    void visitDot(Dot d);

    void visitCircle(Circle c);

    void visitRectangle(Rectangle r);

    void visitCompoundShape(CompoundShape cs);

}
