package generic.wildcard.service;

import generic.wildcard.model.Car;
import generic.wildcard.model.Vehicle;
import generic.wildcard.model.VehicleContainer;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class RepairService {

    public static void repair(VehicleContainer<Vehicle> vehicleContainer) {
        log.info("container list size : {}", vehicleContainer.getSize());
        List<Vehicle> vehicles = vehicleContainer.getVehicleList();
        for(Vehicle vehicle : vehicles) {
            log.info("{} 수리완료", vehicle.toString());
        }
    }
}
