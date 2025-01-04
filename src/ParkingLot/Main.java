package ParkingLot;

import ParkingLot.VehicleType.Bike;
import ParkingLot.VehicleType.Car;
import ParkingLot.VehicleType.VehicleType;

public class Main {
    public static void main(String[] args)
    {
        Vehicle vehicle=new Bike(1340, VehicleType.BIKE);
        Vehicle car=new Car(2232,VehicleType.CAR);
        // Entrance
        EntraceGate entraceGate=new EntraceGate(vehicle);
        entraceGate.addParkingSpot();


        // For bike
        ParkingSpot parkingSpot=entraceGate.findParkingSpot(vehicle);

        Ticket ticket=entraceGate.generateTicket(vehicle,parkingSpot);
        entraceGate.BookSlot(parkingSpot,vehicle);


        // For car
        ParkingSpot parkingSpotForCar=entraceGate.findParkingSpot(car);

        Ticket ticketForCar=entraceGate.generateTicket(car,parkingSpotForCar);
        entraceGate.BookSlot(parkingSpotForCar,car);


        //Exit for bike
        ExitGate exitGate=new ExitGate(ticket,vehicle);
        exitGate.freeSpot();
        int price= exitGate.calculateCost();
        System.out.println(price);

        //Exit for car







    }
}
