package pattern.structural.flyweight;

import java.util.Objects;

public class TreeType {

    private final String name, color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println("name = " + name + ", color = " + color);
        System.out.println("x = " + x + ", y = " + y + "\n");
    }

    public boolean equals(String name, String color) {
        if (name == null || name.isEmpty() || color == null || color.isEmpty()) return false;
        return Objects.equals(this.name, name) && Objects.equals(this.color, color);
    }

}
