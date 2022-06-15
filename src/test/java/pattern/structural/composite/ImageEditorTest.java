package pattern.structural.composite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ImageEditorTest {

    @Test
    public void imageEditorSizeTest() {
        ImageEditor imageEditor = new ImageEditor();
        imageEditor.add(new Circle(1, 2, 11));

        List<Graphic> graphics = new ArrayList<>();
        graphics.add(new Dot(3, 4));
        graphics.add(new Circle(5, 6, 13));
        imageEditor.groupSelected(graphics);

        assertEquals(5, imageEditor.size());
    }

}
