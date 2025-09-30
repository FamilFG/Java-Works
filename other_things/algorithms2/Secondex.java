package other_things.algorithms2;

import java.util.Scanner;

public class Secondex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(a%4==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
