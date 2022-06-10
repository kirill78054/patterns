package creational.patterns.builder;

public interface CarBuilder {

    CarBuilder fixChassis(String chassis);

    CarBuilder fixBody(String body);

    CarBuilder paint(String paint);

    CarBuilder fixInterior(String interior);

    Car build();

}
