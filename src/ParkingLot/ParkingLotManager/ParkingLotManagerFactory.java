package ParkingLot.ParkingLotManager;

import ParkingLot.Vehicle;
import ParkingLot.VehicleType.VehicleType;

public class ParkingLotManagerFactory {
    ParkingLotManager parkingLotManager;
    public ParkingLotManager getParkingLotManager(Vehicle vehicle)
    {
        switch (vehicle.getVehicleType())
        {
            case VehicleType.BIKE:
                return  new BikeParkingLotManager();
            case VehicleType.CAR:
                return new CarParkingLotManager();
            default:
                return null;
        }
    }
}
