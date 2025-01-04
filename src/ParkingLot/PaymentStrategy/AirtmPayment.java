package ParkingLot.PaymentStrategy;

public class AirtmPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid using airtm!");
    }

}
