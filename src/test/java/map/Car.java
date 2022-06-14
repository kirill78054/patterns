package map;

import java.util.Objects;

class Car {

    private int id;
    private String model;

    public Car(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        map.Car car = (map.Car) o;
        return id == car.id && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model);
    }

}
