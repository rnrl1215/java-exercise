package generic.method.test;


import generic.method.model.Boat;
import generic.method.model.Car;
import generic.method.model.Vehicle;
import generic.method.model.VehicleContainer;
import generic.method.service.VehicleServiceCenter;
import generic.method.service.VehicleServiceCenterV2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("car1");
        VehicleContainer<Car> carVehicleContainer = new VehicleContainer<>();
        VehicleContainer<Boat> boatVehicleContainer = new VehicleContainer<>();
        VehicleServiceCenter.<Boat>repair(boatVehicleContainer);
        VehicleServiceCenter.<Car>repair(carVehicleContainer);
        VehicleServiceCenterV2.<Boat>repair(boatVehicleContainer, boatVehicleContainer);
    }
}
