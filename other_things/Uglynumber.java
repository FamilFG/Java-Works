package other_things;

import java.util.Scanner;

public class Uglynumber {



    public static boolean isUgly(int n){
        int[] primes = {2,3,5};
        if (n<=0){return false;};

        for (int i=0;i<primes.length;i++){
            if (n%primes[i]==0){
                n/=primes[i];
            }
        }
        return n==1;
    };


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();
        if  (isUgly(n)){
            System.out.println("Ugly number");

        } else{
            System.out.println("Not Ugly number");
        }
        ;
    }



}
