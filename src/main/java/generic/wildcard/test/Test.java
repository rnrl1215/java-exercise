package generic.wildcard.test;


import generic.wildcard.model.Boat;
import generic.wildcard.model.Car;
import generic.wildcard.model.Vehicle;
import generic.wildcard.model.VehicleContainer;
import generic.wildcard.service.RepairService;
import generic.wildcard.service.VehicleServiceCenter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("base","vehicle1");
        Vehicle vehicle2 = new Vehicle("base","vehicle2");
        VehicleContainer<Vehicle> vehicleVehicleContainer = new VehicleContainer<>();

        Car car1 = new Car("car1");
        VehicleContainer<Car> carVehicleContainer = new VehicleContainer<>();
        VehicleContainer<Boat> boatVehicleContainer = new VehicleContainer<>();
        VehicleServiceCenter.repair(vehicleVehicleContainer);
        VehicleServiceCenter.repair(boatVehicleContainer);
    }
}
