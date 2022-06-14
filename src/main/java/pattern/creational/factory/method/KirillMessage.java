package pattern.creational.factory.method;

public class KirillMessage extends Message {

    @Override
    public Text createMessage() {
        return new KirillText();
    }

}
