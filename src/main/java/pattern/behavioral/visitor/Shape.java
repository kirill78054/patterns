package pattern.behavioral.visitor;

public interface Shape extends Visitable<Visitor> {

    void move(int x, int y);

    void draw();

}
