package other_things;

import java.util.Scanner;

public class Happynumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The number: ");
        int n = input.nextInt();
        while (n != 1 && n != 4) {
            n = sumofn(n);
        }
        if (n == 1) {
            System.out.println("Happy number");
        } else {
            System.out.println("Not a happy number");
        }



    }
    public static int sumofn(int n){
        int sum = 0;
        while (n > 0) {
            int i = n % 10;
            sum += i * i;
            n /= 10;
        }
        return sum;
    }
}
