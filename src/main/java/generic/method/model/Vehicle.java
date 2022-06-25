package generic.method.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    private String type;
    private String name;
    private String status = "고장";

    public Vehicle(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String toString() {
        return "type: " + type + " name : " +name;
    }
}
