package generic.service;

import generic.base.Vehicle;

public class VehicleRepairService<T> {
    public boolean isSupport(T t) {
        return (t instanceof Vehicle);
    }

    public void repair(T t){
        if (isSupport(t)) {
            Vehicle vehicle = (Vehicle) t;
            System.out.println(vehicle.getType() + " 수리완료");
        } else {
            System.out.println("수리불가");
        }
    }
}
