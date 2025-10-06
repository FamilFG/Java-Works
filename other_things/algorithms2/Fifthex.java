package other_things.algorithms2;

public class Fifthex {
    public static void main(String[] args) {
        int massiv[] = {1, 4, 6, 12, 42, 21, 3};

        for (int i = 0; i < massiv.length; i++) {
            for (int j = i + 1; j < massiv.length; j++) {
                if (massiv[i]*2 == massiv[j]) {
                    System.out.println("yees");
                }
            }
        }
    }
}
