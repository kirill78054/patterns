package pattern.behavioral.visitor;

/*
Посетитель(Visitor)

Позволяет добавлять в программу новые операции, не изменяя
классы объектов, над которыми эти операции могут выполнять-
ся.
*/
public interface Visitor {

    void visit(Dot d);

    void visit(Circle c);

    void visit(Rectangle r);

    void visit(CompoundShape cs);

}
