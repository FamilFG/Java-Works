import java.lang.Math;
import java.util.Scanner;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number: ");
        float a = sc.nextFloat();
        System.out.println(Math.round(a));
        System.out.println(Math.sqrt(a));
        System.out.println("Write the second number: ");
        float b = sc.nextFloat();
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));

        System.out.println("Write negative number: ");
        float c = sc.nextFloat();
        System.out.println(Math.abs(c));
        double deg = 3.14;
        System.out.println(Math.sin(deg));
        System.out.println(Math.cos(deg));
        System.out.println(Math.round(Math.random()*100));
        System.out.println(Math.pow(a,2));
        System.out.println(Math.ceil(b));
        System.out.println(Math.floor(b));
        System.out.println("Write a number from 1 to 7: ");
        int g = sc.nextInt();
        switch(g){
            case 1:
                System.out.println("Birinci gun");
                break;
            case 2:
                System.out.println("Ikinci gun");
                break;
            case 3:
                System.out.println("Ucuncu gun");
                break;
            case 4:
                System.out.println("Dorduncu gun");
                break;
            case 5:
                System.out.println("Besinci gun");
                break;
                case 6:
                    System.out.println("Alinci gun");
                    break;
            case 7:
                System.out.println("Yeddinci gun");
                break;
            default:
                System.out.println("Error");
        }

    }
}
