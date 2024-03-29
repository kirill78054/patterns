package map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;

public class HashMapTest {

    @Test
    public void callTest() {
        Map<Car, String> cars = new HashMap<>();

        Car car = new Car(1, "BMW");

        cars.put(car, "one");
        car.setModel("Toyota");

        assertFalse(cars.containsKey(car));
    }

}
