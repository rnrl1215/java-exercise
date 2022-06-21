package generic.base.model;

import lombok.Getter;

@Getter
public class Vehicle {
    private String engine;
    private String type;

    public Vehicle(String type, String engine) {
        this.engine = engine;
        this.type = type;
    }
}
