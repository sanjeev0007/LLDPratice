package ParkingLot.PaymentStrategy;

public class ShopingCard {
    PaymentStrategy payment;
    ShopingCard(PaymentStrategy payment)
    {
        this.payment=payment;
    }
    void makePayment(int amount)
    {
        payment.pay(amount);
    }
}
