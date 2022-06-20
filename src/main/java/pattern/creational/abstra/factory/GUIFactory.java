package pattern.creational.abstra.factory;

/*
Абстрактная фабрика(Abstract Factory)

Позволяет создавать семейства связанных объектов, не привя-
зываясь к конкретным классам создаваемых объектов.
*/
public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}
