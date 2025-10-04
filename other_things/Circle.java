package other_things;

public class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * r;

    }
    @Override
    public double calculateArea() {
        return Math.PI * r * r;

    }

}
