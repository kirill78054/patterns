package patterns.factory.method;

import creational.patterns.factory.method.AndreyMessage;
import creational.patterns.factory.method.KirillMessage;
import creational.patterns.factory.method.Message;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageTest {

    @Test
    public void MessageKirillTest() {
        Message message = new KirillMessage();
        assertEquals("Kirill", message.getMessage());
    }

    @Test
    public void MessageAndreyTest() {
        Message message = new AndreyMessage();
        assertEquals("Andrey", message.getMessage());
    }

}
