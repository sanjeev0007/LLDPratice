package ParkingLot.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid using credit card!");
    }

}
