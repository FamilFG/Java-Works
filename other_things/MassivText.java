import java.util.Scanner;

public  class MassivText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of massiv: ");
        int n = sc.nextInt();
        int cut = 0;
        int tek = 0;
        int massiv[] = new int[n];
        int i;
        int sum = 0;
        for (i = 0; i < n; i++){
            System.out.println("Write the number of massiv");
            massiv[i] = sc.nextInt();
        }
        int max = massiv[0];
        int min = massiv[0];

        for(i = 0; i < massiv.length; i++){
            sum += massiv[i];
            if (massiv[i] > max) {
                max = massiv[i];
            }
            if (massiv[i] < min) {
                min = massiv[i];
            }
            if (massiv[i]%2 == 0) {
                cut++;
            }else if (massiv[i]%2 == 1){
                tek++;
            }

        }
        System.out.println("The massiv value is " + sum);
        System.out.println("The massiv mean is " + sum/n );
        System.out.println("The maximum massiv value is " + max);
        System.out.println("The minimum massiv value is " + min);
        System.out.println("The tek is " + tek);
        System.out.println("The cut is " + cut);
        for (int idx = n - 1; idx >= 0; idx--) {
            System.out.println("The massiv value is " + massiv[idx]);
        }
        int summat = 0;

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int maxmat = mat[0][0];
        int minmat = mat[0][0];
        for (int m = 0; m < mat.length; m++) {
            for (int j = 0; j < mat[m].length; j++) {
                summat+= mat[m][j];
                if  (mat[m][j] > maxmat) {
                    maxmat = mat[m][j];
                }
                if (mat[m][j] < minmat) {
                    minmat = mat[m][j];
                }

            }
            System.out.println(summat);
            System.out.println(maxmat);
            System.out.println(minmat);
        }

    }
}