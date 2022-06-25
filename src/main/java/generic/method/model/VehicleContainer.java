package generic.method.model;


import java.util.ArrayList;
import java.util.List;

public class VehicleContainer<T extends Vehicle> {
    List<T> vehicleList = new ArrayList<T>();

    public void addVehicle(T t) {
        vehicleList.add(t);
    }

    public int getSize() {
        return vehicleList.size();
    }

    public List<T> getVehicleList() {
        return vehicleList;
    }
}
