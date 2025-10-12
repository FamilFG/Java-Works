package ExceptionHandling;

import java.util.Scanner;

public class ATM {
    private final String pin = "4344";
    private int attempts = 0;
    private final int maxattempts = 3;

    public void checkPin(String input) throws CardBlockedException {
        if (input.equals(pin)) {
            System.out.println("Logged in successfully");
        } else {
            attempts++;
            if (attempts >= maxattempts) {
                throw new CardBlockedException("Card blocked!");
            } else {
                System.out.println("Incorrect pin. Please try again.");
            }
        }
    }
    public void start() throws CardBlockedException {
        Scanner sc = new Scanner(System.in);
        while (attempts < maxattempts) {
            System.out.print("Write the PIN: ");
            String input = sc.nextLine();
            checkPin(input);
            if (input.equals(pin)) break;
        }
    }
}
