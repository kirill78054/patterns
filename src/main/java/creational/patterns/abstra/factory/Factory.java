package creational.patterns.abstra.factory;

public class Factory {

    private final Button button;
    private final Checkbox checkbox;

    public Factory(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public String paint() {
        return String.format("%s %s", checkbox.paint(), button.paint());
    }

}
