package ParkingLot.ParkingLotManager;

import ParkingLot.ParkingSpot;
import ParkingLot.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CarParkingLotManager implements ParkingLotManager{
    public static List<ParkingSpot> parkingSpots;


    @Override
    public ParkingSpot getFreeSpot(Vehicle vehicle) {
        for(ParkingSpot parkingSpot:this.parkingSpots)
        {
            if(parkingSpot.isEmpty())
            {
                return parkingSpot;
            }
        }
        return null;
    }

    @Override
    public void bookSlot(ParkingSpot parkingSpot,Vehicle vehicle) {
        parkingSpot.parkVehicle(vehicle);
    }

    @Override
    public void removeSlot(ParkingSpot parkingSpot,Vehicle vehicle) {
        parkingSpot.unparkVehicle(vehicle);
    }


    @Override
    public void addParkingSpots() {
        this.parkingSpots=new ArrayList<>();
        for(int i=0;i<100;++i)
        {
            this.parkingSpots.add(new ParkingSpot(i));
        }
    }

}
