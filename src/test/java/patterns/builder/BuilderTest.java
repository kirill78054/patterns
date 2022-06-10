package patterns.builder;

import creational.patterns.builder.AutomotiveEngineer;
import creational.patterns.builder.Car;
import creational.patterns.builder.CarBuilder;
import creational.patterns.builder.ClassicCarBuilder;
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
