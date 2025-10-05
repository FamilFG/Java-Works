package Interface_abstract;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + " AZN with Credit Card");

    }

}
