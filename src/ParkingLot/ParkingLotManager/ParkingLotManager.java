package ParkingLot.ParkingLotManager;

import ParkingLot.ParkingSpot;
import ParkingLot.Vehicle;

public interface ParkingLotManager {

    public ParkingSpot getFreeSpot(Vehicle vehicle);
    public void bookSlot(ParkingSpot parkingSpot,Vehicle vehicle);
    public void removeSlot(ParkingSpot parkingSpot,Vehicle vehicle);
    public void addParkingSpots();

}
