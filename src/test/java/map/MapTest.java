package map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;

public class MapTest {

    @Test
    public void mapTest() {
        Car car = new Car(1, "BMW");
        Map<Car, String> cars = new HashMap<>();
        cars.put(car, "one");
        car.setModel("Toyota");
        assertFalse(cars.containsKey(car));
    }

}
