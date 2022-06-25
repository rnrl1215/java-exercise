package generic.method.service;

import generic.method.model.Vehicle;
import generic.method.model.VehicleContainer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VehicleServiceCenter {
    public static <T extends Vehicle> void repair(VehicleContainer<T> vehicleContainer) {
        log.info("container list size : {}", vehicleContainer.getSize());
        for(Vehicle vehicle : vehicleContainer.getVehicleList()) {
            log.info("{} 수리완료", vehicle.toString());
        }
    }
}
