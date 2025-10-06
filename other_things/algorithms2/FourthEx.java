package other_things.algorithms2;
public class FourthEx {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 4, 2, 2, 1, 2, 4, 4};

        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == number) {
                    count++;
                }
            }
            if (count == number) {
                System.out.println("Found it!");
                System.out.println(number);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("No such number!");
        }
    }
}
