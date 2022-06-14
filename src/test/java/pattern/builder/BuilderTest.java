package pattern.builder;

import pattern.creational.builder.AutomotiveEngineer;
import pattern.creational.builder.Car;
import pattern.creational.builder.CarBuilder;
import pattern.creational.builder.ClassicCarBuilder;
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
