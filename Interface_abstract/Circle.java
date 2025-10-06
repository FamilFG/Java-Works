package Interface_abstract;

public class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println(Math.PI * 2 * r);
        return Math.PI * 2 * r;

    }
    @Override
    public double calculateArea() {
        System.out.println(Math.PI * r * r);
        return Math.PI * r * r;

    }

}
