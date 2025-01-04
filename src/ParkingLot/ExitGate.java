package ParkingLot;

import ParkingLot.CostComputationFactory.CostComputation;
import ParkingLot.CostComputationFactory.CostComputationFactory;
import ParkingLot.ParkingLotManager.ParkingLotManager;
import ParkingLot.ParkingLotManager.ParkingLotManagerFactory;


public class ExitGate {
    Ticket ticket;
    ParkingLotManagerFactory parkingLotManagerFactory;
    CostComputationFactory costComputationFactory;
    Vehicle vehicle;
    public ExitGate(Ticket ticket,Vehicle vehicle)
    {
        this.ticket=ticket;
        this.vehicle=vehicle;
        this.parkingLotManagerFactory=new ParkingLotManagerFactory();
        this.costComputationFactory=new CostComputationFactory();
    }

    public void freeSpot()
    {
        this.vehicle=ticket.getVehicle();
        ParkingLotManager parkingLotManager= parkingLotManagerFactory.getParkingLotManager(this.vehicle);
        parkingLotManager.removeSlot(ticket.getParkingSpot(),this.vehicle);
    }

    public int calculateCost()
    {
        CostComputation costComputation=costComputationFactory.getPrice(this.vehicle);
        return costComputation.getPrice();
    }
}
