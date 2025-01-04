package ParkingLot.PaymentStrategy;

public class Main {
    public static void main(String[] args)
    {
        ShopingCard shopingCard=new ShopingCard(new CreditCardPayment());
        shopingCard.makePayment(40);

    }
}
