package ParkingLot.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid using paypal!");
    }

}
