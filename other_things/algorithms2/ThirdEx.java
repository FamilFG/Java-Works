package other_things.algorithms2;

import java.util.Scanner;

public class ThirdEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int massiv[][] = new int[n][n];
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    sum+= massiv[i][j];
                }

            }
        }
        System.out.println("The sum is " + sum);
    }
}
