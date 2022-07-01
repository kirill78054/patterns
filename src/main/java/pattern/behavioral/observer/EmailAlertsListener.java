package pattern.behavioral.observer;

public class EmailAlertsListener implements EventListeners {

    @Override
    public void update(String fileName) {
        System.out.println("EmailAlertsListener " + fileName);
    }

}
