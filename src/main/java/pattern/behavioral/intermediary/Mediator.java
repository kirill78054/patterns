package pattern.behavioral.intermediary;

/*
Посредник(Mediator)

Позволяет уменьшить связанность множества классов между
собой, благодаря перемещению этих связей в один класс-
посредник.
*/
public interface Mediator {

    String send(String message, Colleague sender);

}
