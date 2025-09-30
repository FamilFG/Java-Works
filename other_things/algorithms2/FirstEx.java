package other_things.algorithms2;

import java.util.Scanner;

public class FirstEx {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int min = n%10;
        n = n/10;
        while(n>0){
            int i = n%10;
            if (min>=i){
                n = n/10;
                min = i;
            }else{
                n = n/10;
                continue;
            }
        }
        System.out.println("Minimum number is "+min);
    }
}
