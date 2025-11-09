package set_map;

import java.util.HashSet;
import java.util.Scanner;

public class Settest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> uniquenumbers = new HashSet<>();
        int i=0;
        while (i<5){
            System.out.println("Please enter a number: ");
            int number = sc.nextInt();
            if (uniquenumbers.contains(number)){
                System.out.println("Duplicate, try again");
            }
            else{
                uniquenumbers.add(number);
                i++;
            }
        }
        System.out.println(uniquenumbers);
    }
}
