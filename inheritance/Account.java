package inheritance;

public class Account {
    public double balance;
    public String accountNumber;

    static {
        System.out.println("Bank system");
    }
    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;

    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + amount);

    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw Successful");
        }else  {
            System.out.println("Not enough Money");
        }
    }
}
