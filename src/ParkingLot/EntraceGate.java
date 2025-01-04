package ParkingLot;

import ParkingLot.ParkingLotManager.ParkingLotManager;
import ParkingLot.ParkingLotManager.ParkingLotManagerFactory;

import java.time.LocalDateTime;
import java.util.Date;

public class EntraceGate {
    public Vehicle vehicle;
    public ParkingLotManagerFactory parkingLotManagerFactory;
    public Ticket ticket;
    ParkingLotManager parkingLotManager;


    public EntraceGate(Vehicle vehicle)
    {
        this.parkingLotManagerFactory=new ParkingLotManagerFactory();
        this.vehicle=vehicle;
    }
    public void addParkingSpot()
    {
        this.parkingLotManager=parkingLotManagerFactory.getParkingLotManager(vehicle);
        this.parkingLotManager.addParkingSpots();
    }
    public ParkingSpot findParkingSpot(Vehicle vehicle)
    {
        this.parkingLotManager=parkingLotManagerFactory.getParkingLotManager(vehicle);
        return parkingLotManager.getFreeSpot(vehicle);
    }

    public void BookSlot(ParkingSpot parkingSpot,Vehicle vehicle)
    {
        this.parkingLotManager.bookSlot(parkingSpot,vehicle);
    }



    public Ticket generateTicket(Vehicle vehicle,ParkingSpot parkingSpot)
    {
        return new Ticket(LocalDateTime.now(),vehicle,parkingSpot);
    }





}
