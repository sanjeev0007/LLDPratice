package ParkingLot;

public class ParkingSpot {
    public int spotNumber;
    public Vehicle vehicle;
    public boolean isEmpty;
    public ParkingSpot(int spotNumber)
    {
        this.spotNumber=spotNumber;
        this.isEmpty=true;
    }
    public ParkingSpot(int spotNumber, Vehicle vehicle) {
        this.spotNumber = spotNumber;
        this.vehicle = vehicle;
        this.isEmpty=false;
    }


    public void parkVehicle(Vehicle vehicle) {
        this.isEmpty=false;
        this.vehicle=vehicle;
    }

    public void unparkVehicle(Vehicle vehicle) {
        this.isEmpty=true;
        this.vehicle=null;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}

/*
* 1
*
* */
