package ParkingLot.VehicleType;

import ParkingLot.Vehicle;

public class Car extends Vehicle {
    public int vehicleNo;
    VehicleType vehicleType;
    public Car(int vehicleNo, VehicleType vehicleType)
    {
        super(vehicleNo,vehicleType);
    }


}
