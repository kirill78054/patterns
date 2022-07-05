package pattern.behavioral.visitor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class XMLExportVisitorTest {

    @Test
    public void shapeAcceptTest() {
        Visitor visitor = new XMLExportVisitor();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Dot());
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new CompoundShape());

        shapes.forEach(shape -> shape.accept(visitor));
    }

}
