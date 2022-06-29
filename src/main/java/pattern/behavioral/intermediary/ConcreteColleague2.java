package pattern.behavioral.intermediary;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String notify(String message) {
        return "Colleague2 gets message: " + message;
    }

}