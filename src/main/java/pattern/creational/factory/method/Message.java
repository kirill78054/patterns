package pattern.creational.factory.method;

/*
Фабричный метод(Factory Method)

Определяет общий интерфейс для создания объектов в суперк-
лассе, позволяя подклассам изменять тип создаваемых объек-
тов.
*/
public abstract class Message {

    public String getMessage() {
        return createMessage().getMessage();
    }

    protected abstract Text createMessage();

}
