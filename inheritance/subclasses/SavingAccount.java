package inheritance.subclasses;

import inheritance.Account;

public class SavingAccount extends Account {

    public SavingAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    public void addInterest(){
        balance += balance * 0.05;
        System.out.println("Interest Added");
    }


}
