package pattern.behavioral.intermediary;

public class ConcreteMediator implements Mediator {

    private Colleague colleague1;
    private Colleague colleague2;

    public void setColleague1(Colleague colleague) {
        this.colleague1 = colleague;
    }

    public void setColleague2(Colleague colleague) {
        this.colleague2 = colleague;
    }

    @Override
    public String send(String message, Colleague sender) {
        if (sender.equals(colleague1)) {
            return colleague2.notify(message);
        } else {
            return colleague1.notify(message);
        }
    }

}
