package exceptionhandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account newAccount = new Account("famil2233", "Famil", 456);
        Student famil = new Student("Famil", 67);
        Library book = new Library();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your car model: ");
        String model = sc.nextLine();
        ATM atm = new ATM();
            Restaurant restaurant = new Restaurant();



        try{
            newAccount.withdraw(400);
            famil.checkExamResult();
            book.findBook("RDR2");
            User user = new User(name, age);
            user.buyProduct("Something");
            CarRentalService car = new CarRentalService();
            car.rentCar("bmw");
            restaurant.reserveTable();
            atm.start();

        }


        catch (InsufficientBalanceException e){
            System.out.println("⚠️ " + e.getMessage());
        }
        catch (CardBlockedException e){
            System.out.println("⚠️ " + e.getMessage());
        }
        catch (NoTableAvailableException e) {
            System.out.println("⚠️ " + e.getMessage());
        }
        catch (CarNotAvailableException e){
            System.out.println("⚠️ " + e.getMessage());
        }
        catch (AllCarsBusyException e){
            System.out.println("⚠️ " + e.getMessage());
        }
        catch (LowGradeException e){
            System.out.println("⚠️ " + e.getMessage());
        }
        catch (BookNotFoundException e) {
            System.out.println("⚠️ " + e.getMessage());
        }
        catch (AgeRestrictionException e){
            System.out.println("⚠️ " + e.getMessage());
        }

    }
}
