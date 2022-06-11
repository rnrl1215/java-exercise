package generic.test;

import generic.base.Boat;
import generic.base.Car;
import generic.base.House;
import generic.service.VehicleRepairService;

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
