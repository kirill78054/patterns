package pattern.behavioral.observer;

public class LoggingListener implements EventListeners {

    @Override
    public void update(String fileName) {
        System.out.println("LoggingListener " + fileName);
    }

}
