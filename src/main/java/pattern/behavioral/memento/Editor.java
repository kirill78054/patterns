package pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Editor {

    @Getter
    private String text;
    private int selectionWidth;

    public void setText(String text) {
        this.text = text;
    }

    public void setSelectionWidth(int width) {
        this.selectionWidth = width;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this, text, selectionWidth);
    }

    @AllArgsConstructor
    class Snapshot {
        private final Editor editor;
        private final String text;
        private final int width;

        public void restore() {
            editor.setText(text);
            editor.setSelectionWidth(width);
        }
    }

}
