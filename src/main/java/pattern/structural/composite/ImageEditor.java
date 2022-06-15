package pattern.structural.composite;

import java.util.List;

public class ImageEditor {

    private final CompoundGraphic all = new CompoundGraphic();

    public ImageEditor() {
        all.add(new Dot(1, 2));
        all.add(new Circle(1, 2, 11));
    }

    public void add(Graphic graphic) {
        all.add(graphic);
    }

    public void groupSelected(List<Graphic> graphics) {
        CompoundGraphic group = new CompoundGraphic();
        graphics.forEach(graphic -> {
            group.add(graphic);
            all.remove(graphic);
        });
        all.add(group);
        all.draw();
    }

    public int size() {
        return all.size();
    }

}
