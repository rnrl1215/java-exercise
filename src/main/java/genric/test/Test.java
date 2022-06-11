package genric.test;

import genric.base.Boat;
import genric.base.Car;
import genric.base.House;
import genric.service.VehicleRepairService;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Boat boat = new Boat("기본 보트");
        VehicleRepairService<Boat> boatVehicleRepairService = new VehicleRepairService<>();
        boatVehicleRepairService.repair(boat);

        Car car = new Car("기본 자동차");
        VehicleRepairService<Car> carVehicleRepairService = new VehicleRepairService<>();
        carVehicleRepairService.repair(car);
        //carVehicleRepairService.repair(boat);

        House house = new House();
        VehicleRepairService<House> vehicleRepairRepairService = new VehicleRepairService<>();
        vehicleRepairRepairService.repair(house);

    }
}
