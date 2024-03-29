package pattern.behavioral.observer;

import org.junit.Test;

public class EventListenersTest {

    @Test
    public void updateTest() {
        Editor editor = new Editor();
        EventListeners emailAlertsListener = new EmailAlertsListener();
        EventListeners loggingListener = new LoggingListener();

        editor.getEventManager().subscribe("open", loggingListener);
        editor.getEventManager().subscribe("save", emailAlertsListener);

        editor.openFile("test.file");
        editor.saveFile();
    }

}
