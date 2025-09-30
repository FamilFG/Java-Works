package other_things;

import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if  (n % i == 0) {
                sum += i;
            }
        }
        if(sum == n){
            System.out.println("Perfect number");

        }else {
            System.out.println("Not Perfect number");
        }
    }
}
