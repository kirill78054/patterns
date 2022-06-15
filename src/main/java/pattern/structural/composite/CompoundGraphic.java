package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private final List<Graphic> children = new ArrayList<>();

    @Override
    public void move(int x, int y) {
        children.forEach(child -> child.move(x, y));
    }

    @Override
    public void draw() {
        System.out.println("Draw compound graphic");
        children.forEach(Graphic::draw);
    }

    public int size() {
        return size(this.children);
    }

    private int size(List<Graphic> children) {
        return children.stream().reduce(0, (sum, graphic) -> sum + calculateSize(graphic), Integer::sum);
    }

    private int calculateSize(Graphic graphic) {
        if (graphic instanceof CompoundGraphic) {
            return size(((CompoundGraphic) graphic).children);
        }
        return 1;
    }

    public void add(Graphic graphic) {
        children.add(graphic);
    }

    public void remove(Graphic graphic) {
        children.remove(graphic);
    }

}
