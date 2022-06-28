package pattern.behavioral.iterator;

/*
Итератор(Iterator)

Даёт возможность последовательно обходить элементы состав-
ных объектов, не раскрывая их внутреннего представления.
*/
public interface ChannelIterator {

    boolean hasNext();

    Channel next();

}