package other_things;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    @Override
    public double calculateArea() {
        System.out.println(width * height);
        return width * height;

    }
    @Override
    public double calculatePerimeter() {
        System.out.println((width + height)*2);
        return (width + height)*2;
    }
}
