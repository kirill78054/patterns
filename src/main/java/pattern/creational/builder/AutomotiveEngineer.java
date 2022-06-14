package pattern.creational.builder;

public class AutomotiveEngineer {

    private final CarBuilder builder;

    public AutomotiveEngineer(CarBuilder builder) {
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive Engineer can't work without Car Builder!");
        }
    }

    public Car manufactureCar() {
        return builder.fixChassis("Classic Chassis")
                .fixBody("Classic Body")
                .paint("Classic White Paint")
                .fixInterior("Classic interior")
                .build();
    }

}
