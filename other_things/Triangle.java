package other_things;

public class Triangle extends Shape {
    double a;
    double b;
    double c;
    public  Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2.0;
        System.out.println((s * (s - a) * (s - b) * (s - c)));// semiperimeter
        return (s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
