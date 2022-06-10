package creational.patterns.builder;

public class ClassicCarBuilder implements CarBuilder {

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public ClassicCarBuilder() {
        super();
    }

    @Override
    public CarBuilder fixChassis(String chassis) {
        this.chassis = chassis;
        return this;
    }

    @Override
    public CarBuilder fixBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public CarBuilder paint(String paint) {
        this.paint = paint;
        return this;
    }

    @Override
    public CarBuilder fixInterior(String interior) {
        this.interior = interior;
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis, body, paint, interior);
        if (car.doQualityCheck()) {
            return car;
        } else {
            System.out.println("Car assembly is incomplete. Can't deliver!");
        }
        return null;
    }

}
