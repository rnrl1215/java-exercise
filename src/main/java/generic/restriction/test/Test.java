package generic.restriction.test;


import generic.restriction.model.Boat;
import generic.restriction.model.House;
import generic.restriction.model.Vehicle;
import generic.restriction.service.VehicleRepairService;

public class Test {
    public static void main(String[] args) {

        VehicleRepairService<Vehicle> vehicleRepairService = new VehicleRepairService<>();
        VehicleRepairService<Boat> boatVehicleRepairService = new VehicleRepairService<>();
        //VehicleRepairService<House> repairService = new VehicleRepairService<>();
    }
}
