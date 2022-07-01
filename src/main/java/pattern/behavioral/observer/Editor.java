package pattern.behavioral.observer;

import lombok.Getter;

public class Editor {

    @Getter
    private final EventManager eventManager;

    private String fileName;

    public Editor() {
        this.eventManager = new EventManager();
    }

    public void openFile(String fileName) {
        this.fileName = fileName;
        eventManager.notify("open", fileName);
    }

    public void saveFile() {
        eventManager.notify("save", fileName);
    }

}
