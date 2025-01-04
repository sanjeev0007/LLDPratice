package ParkingLot.CostComputationFactory;

import ParkingLot.ParkingLotManager.BikeParkingLotManager;
import ParkingLot.ParkingLotManager.CarParkingLotManager;
import ParkingLot.Vehicle;
import ParkingLot.VehicleType.VehicleType;

public class CostComputationFactory {
    public CostComputation getPrice(Vehicle vehicle)
    {
        switch (vehicle.getVehicleType())
        {
            case VehicleType.BIKE:
                return  new BikeCostComputation();
            case VehicleType.CAR:
                return new CarCostComputation();
            default:
                return null;
        }

    }
}
