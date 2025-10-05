package Interface_abstract;

public class PayPalPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " AZN with PayPal Card");
    }
}
