package pattern.behavioral.memento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTest {

    @Test
    public void undoTest() {
        String text = "Text test";
        String changedText = "Text test 22";

        Editor editor = new Editor();
        editor.setText(text);
        editor.setSelectionWidth(10);

        assertEquals(text, editor.getText());

        Command command = new Command();
        command.makeBackup(editor);

        editor.setText(changedText);
        assertEquals(changedText, editor.getText());

        command.undo();
        assertEquals(text, editor.getText());
    }

}
