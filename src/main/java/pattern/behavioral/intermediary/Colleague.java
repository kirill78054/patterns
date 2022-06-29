package pattern.behavioral.intermediary;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public String send(String message) {
        return mediator.send(message, this);
    }

    public abstract String notify(String message);

}



