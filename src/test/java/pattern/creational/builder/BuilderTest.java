package pattern.creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {

    @Test
    public void createClassicCarTest() {
        CarBuilder builder = new ClassicCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufactureCar();
        assertEquals("Classic Chassis", car.getChassis());
    }

    @Test
    public void createCarBuilderTest() {
        CarBuilder builder = new ClassicCarBuilder();
        Car car = builder.paint("paint").fixBody("Body").fixChassis("Classic Chassis").fixInterior("interior").build();
        assertEquals("Classic Chassis", car.getChassis());
    }

}
