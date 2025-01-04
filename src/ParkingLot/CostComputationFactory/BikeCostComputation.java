package ParkingLot.CostComputationFactory;

public class BikeCostComputation implements CostComputation{
    @Override
    public int getPrice() {
        return 20;
    }
}
