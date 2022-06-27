package pattern.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextFile {

    private String name;

    public String open() {
        System.out.println("Opening file " + name);
        return "Opening file " + name;
    }

    public String save() {
        System.out.println("Saving file " + name);
        return "Saving file " + name;
    }

}
