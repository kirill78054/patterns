package pattern.behavioral.visitor;

@FunctionalInterface
public interface Visitable<V> {

    void accept(V visitor);

}
