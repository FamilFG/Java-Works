package other_things.algorithms2;

import java.util.Scanner;

public class ThirdEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[][] massiv = new int[n][n];
        int sum = 0;
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                massiv[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            sum += massiv[i][i];
        }
        for (int j = 0; j < n; j++) {

        }

        System.out.println("The sum: " + sum);
    }
}
