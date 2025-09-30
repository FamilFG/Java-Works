package classes;

public class Shape {
    double radius;
    double width;
    double height;
    double pi = 3.14;

    public Shape(double radius) {
        this.radius = radius;
        System.out.println(radius*radius*pi);

    }
    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println(this.width*this.height);
    }


}
