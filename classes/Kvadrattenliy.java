package classes;

public class Kvadrattenliy {
    int a;
    int b;
    int c;

    public void getD(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else if (d < 0) {
            System.out.println("No real answer");
        } else {
            double x = -b / (2.0 * a);
            System.out.println("x1 = x2 = " + x);
        }
    }
}
