package generic.base.test;

import generic.base.model.Boat;
import generic.base.model.Car;
import generic.base.model.House;
import generic.base.service.VehicleRepairService;

public class Test {
    public static void main(String[] args) {

        Boat boat = new Boat("기본 보트");
        VehicleRepairService<Boat> boatVehicleRepairService = new VehicleRepairService<>();
        boatVehicleRepairService.repair(boat);

        Car car = new Car("기본 자동차");
        VehicleRepairService<Car> carVehicleRepairService = new VehicleRepairService<>();
        carVehicleRepairService.repair(car);
        //carVehicleRepairService.repair(boat);

        // 가능하면 안됨
        House house = new House();
        VehicleRepairService<House> vehicleRepairRepairService = new VehicleRepairService<>();
        vehicleRepairRepairService.repair(house);

    }
}
