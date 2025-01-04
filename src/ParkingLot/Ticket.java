package ParkingLot;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {
    public Vehicle vehicle;
    public LocalDateTime in_time;
    public ParkingSpot parkingSpot;

    public Ticket(LocalDateTime in_time, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.in_time = in_time;
        this.vehicle = vehicle;
        this.parkingSpot=parkingSpot;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getIn_time() {
        return in_time;
    }

    public void setIn_time(LocalDateTime in_time) {
        this.in_time = in_time;
    }
}
