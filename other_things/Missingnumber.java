package other_things;

import java.util.Arrays;
import java.util.Scanner;

public class Missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of list");
        int n = sc.nextInt();
        int list[] = new int[n];
        for (int i = 1; i <= n-1; i++){

            System.out.println("Write the number: ");
            list[i]= sc.nextInt();
        }
        Arrays.sort(list);
        int sum = 0;
        int sumlist = n*(n+1)/2;
        for (int i = 0; i < list.length; i++){
            sum += list[i];
        }
        System.out.println((sumlist-sum) + " is the missing number");
    }
}
