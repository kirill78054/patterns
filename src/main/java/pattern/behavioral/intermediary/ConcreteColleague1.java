package pattern.behavioral.intermediary;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String notify(String message) {
        return "Colleague1 gets message: " + message;
    }

}
