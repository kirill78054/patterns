package creational.patterns.factory.method;

public class KirillMessage extends Message {

    @Override
    public Text createMessage() {
        return new KirillText();
    }

}
