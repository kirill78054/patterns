package pattern.structural.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tree {

    private final int x, y;
    private final TreeType type;

    public void draw() {
        System.out.println("Для наглядности = " + type);
        type.draw(x, y);
    }

}
