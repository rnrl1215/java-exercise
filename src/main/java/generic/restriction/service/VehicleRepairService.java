package generic.restriction.service;

import generic.restriction.model.Vehicle;

public class VehicleRepairService<T extends Vehicle> {
    public boolean isSupport(T t) {
        return (t instanceof Vehicle);
    }

    public void repair(T t) {
        Vehicle vehicle = t;
        System.out.println(vehicle.getType() + " 수리완료");
    }
}
