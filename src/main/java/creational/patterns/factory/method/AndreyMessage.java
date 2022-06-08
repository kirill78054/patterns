package creational.patterns.factory.method;

public class AndreyMessage extends Message {

    @Override
    public Text createMessage() {
        return new AndreyText();
    }

}
