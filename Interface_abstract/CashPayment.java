package Interface_abstract;

public class CashPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " AZN with cash");
    }
}
