package exceptionhandling;



public class Account {
    String id;
    String owner;
    double ownerBalance;

    public  Account(String id, String owner, double ownerBalance) {
        this.id = id;
        this.owner = owner;
        this.ownerBalance = ownerBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (ownerBalance-amount<10) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        ownerBalance -= amount;
        System.out.println(amount + " withdrawn from account");
        System.out.println(ownerBalance + " left");
    }

}
