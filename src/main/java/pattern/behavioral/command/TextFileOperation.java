package pattern.behavioral.command;

/*
Команда(Command)

Превращает запросы в объекты, позволяя передавать их как
аргументы при вызове методов, ставить запросы в очередь,
логировать их, а также поддерживать отмену операций.
*/
@FunctionalInterface
public interface TextFileOperation {

    String execute();

}
