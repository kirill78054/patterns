package creational.patterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public Car(String chassis, String body, String paint, String interior) {
        this.chassis = chassis;
        this.body = body;
        this.paint = paint;
        this.interior = interior;
    }

    public boolean doQualityCheck() {
        return (chassis != null && !chassis.trim().isEmpty()) && (body != null && !body.trim().isEmpty())
                && (paint != null && !paint.trim().isEmpty()) && (interior != null && !interior.trim().isEmpty());
    }

}