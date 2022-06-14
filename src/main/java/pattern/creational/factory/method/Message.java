package pattern.creational.factory.method;

public abstract class Message {

    public String getMessage() {
        return createMessage().getMessage();
    }

    protected abstract Text createMessage();

}
