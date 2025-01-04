package ParkingLot;

import ParkingLot.VehicleType.VehicleType;

public class Vehicle {
    public int vehicleNumber;
    VehicleType vehicleType;
    public Vehicle(int vehicleNumber,VehicleType vehicleType)
    {
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
    }

    public Vehicle()
    {

    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

}
