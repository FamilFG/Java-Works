package inheritance.subclasses;

import inheritance.Account;

public class CurrentAccount extends Account {
    public final int overdraftLimit = -100;


    public CurrentAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount <= overdraftLimit) {
            balance -= amount;
            System.out.println("Current account balance is " + balance);
        }else {
            System.out.println("Overdraft limit reached");
        }
    }


}
