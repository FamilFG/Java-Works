import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write your first number: ");
        int num = sc.nextInt();

        System.out.println("Which operation to do?: ");
        System.out.println("1)+  2)-  3)*  4)/  5)%");
        int choice = sc.nextInt();

        System.out.print("Write your second number: ");
        int num2 = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(num + " + " + num2 + " = " + (num + num2));
            case 2:
                System.out.println(num + " - " + num2 + " = " + (num - num2));
            case 3:
                System.out.println(num + " * " + num2 + " = " + (num * num2));
            case 4:
                if (num2 != 0) {
                    System.out.println(num + " / " + num2 + " = " + (num / num2));
                } else {
                    System.out.println("Error: division by zero");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println(num + " % " + num2 + " = " + (num % num2));
                } else {
                    System.out.println("Error: division by zero");
                }
                break;
            default:
                System.out.println("Wrong choice");
        }


    }
}
