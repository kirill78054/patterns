package pattern.creational.builder;

/*
Строитель(Builder)

Позволяет создавать сложные объекты пошагово. Строитель
даёт возможность использовать один и тот же код строитель-
ства для получения разных представлений объектов.
*/
public interface CarBuilder {

    CarBuilder fixChassis(String chassis);

    CarBuilder fixBody(String body);

    CarBuilder paint(String paint);

    CarBuilder fixInterior(String interior);

    Car build();

}
