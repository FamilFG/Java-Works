import java.util.Scanner;

//EXERCISE 1
// public class Exercise {
//    public static void main(String[] args) {
//        int age = 18;
//        double salary = 0;
//        char initial = 'F';
//        boolean isStudent = true;
//    }
//}

//EXERCISE 2
//public class Exercise  {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your score: ");
//        int score = sc.nextInt();
//        if(score >=90){
//            System.out.println("Amazing");
//        }else if(score >=70 || score <=89){
//            System.out.println("Good");
//        }else if(score >=50 || score <=69){
//            System.out.println("Enough");
//        }else{
//            System.out.println("F");
//        }
//
//    }
//}
//EXERCISE 3
//public class Exercise {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Write your age: ");
//        int age = sc.nextInt();
//        if(age<18){
//            System.out.println("Teenager");
//        }else if (age>18) {
//            System.out.println("Adult");
//        }else{
//            System.out.println("Typo");
//        }
//    }
//}

//EXERCISE 4
//public class Exercise  {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Write your score: ");
//        int score = sc.nextInt();
//        if (score >= 50 || score<=100) {
//            System.out.println("Right score");
//        }else{
//            System.out.println("Wrong score");
//        }
//    }
//}

//EXERCISE 5
//public class Exercise{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Write the temperature: ");
//        int temp = sc.nextInt();
//        if(temp<0 || temp>35 ){
//            System.out.println("Weather is dangerous.");
//        }else{
//            System.out.println("Weather is normal.");
//        }
//    }
//}

//EXERCISE 6
//public class Exercise  {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean isStudent = true;
//        if(isStudent==true){
//            System.out.print("Student");
//        }else if(!isStudent){
//            System.out.print("Not a student");
//        }
//    }
//}

//EXERCISE 7
public class Exercise  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your age: ");
        int age = sc.nextInt();
        System.out.print("Write your score: ");
        int score = sc.nextInt();
        if(age >= 18 && score >= 70){
            System.out.println("You passed the exam");
        }else{
            System.out.println("You failed the exam");
        }
    }
}