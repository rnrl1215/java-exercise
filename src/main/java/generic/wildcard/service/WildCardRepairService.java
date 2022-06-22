package generic.wildcard.service;

import generic.wildcard.model.Vehicle;
import generic.wildcard.model.VehicleContainer;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class WildCardRepairService {

    public static void repair(VehicleContainer<? extends Vehicle> vehicleContainer) {
        log.info("container list size : {}", vehicleContainer.getSize());
        for(Vehicle vehicle : vehicleContainer.getVehicleList()) {
            log.info("{} 수리완료", vehicle.toString());
        }
    }
}
