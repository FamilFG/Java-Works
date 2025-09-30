package inheritance;

import inheritance.subclasses.*;

public class Testinheritances {

    public static void main(String[] args) {
        Car bmw = new Car(180, "Bmw");
        bmw.drive();
        Bike yamaha = new Bike(220, "Yamaha");
        yamaha.drive();

        SavingAccount account = new SavingAccount(120, "Famil99");
        account.deposit(1000);
        account.withdraw(500);
        System.out.println(account.balance);
        account.addInterest();
        System.out.println(account.balance);


        Student Famil = new Student("Famil", 18);
        Famil.Introduce();
        Famil.study();
        Teacher Sedat = new Teacher("Sedat", 26);
        Sedat.Introduce();
        Sedat.teach();


        Book book = new Book(23);
        book.getDiscountPrice();
        Electronics electronics = new Electronics(23);
        electronics.getDiscountPrice();
        Clothing clothing = new Clothing(23);
        clothing.getDiscountPrice();


        Manager famil = new Manager("Famil", 1500, 100);
        famil.printInfo();
        Developer daniil = new Developer("Daniil", 1200, "Java");
        daniil.printInfo();


    }
}
