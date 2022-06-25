package generic.method.service;

import generic.method.model.Vehicle;
import generic.method.model.VehicleContainer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VehicleServiceCenterV2 {
    public static <T extends Vehicle> void repair(VehicleContainer<T> vehicleContainer1, VehicleContainer<T> vehicleContainer2) {
        log.info("container list size : {}", vehicleContainer1.getSize());
        for(Vehicle vehicle : vehicleContainer1.getVehicleList()) {
            log.info("{} 수리완료", vehicle.toString());
        }

        log.info("container list size : {}", vehicleContainer2.getSize());
        for(Vehicle vehicle : vehicleContainer2.getVehicleList()) {
            log.info("{} 수리완료", vehicle.toString());
        }
    }
}
