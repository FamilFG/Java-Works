import Interface_abstract.*;
import Interface_abstract.Car;
import classes.*;
import classes.Student;
import Interface_abstract.Circle;

public class Testclasses {
    public static void main(String[] args) {
        Kvadrattenliy kv = new Kvadrattenliy();
        kv.getD(1, 3, -2);

        Greet g = new Greet();
        g.greet("Famil");

        Student s = new Student("Famil",18);
        s.display();



        Book constructor1 = new Book("Journey of guys", "Newson Mathews");
        Book constructor2 = new Book("Journey of girls", "Newson Mathews");
        constructor1.printBooks();
        constructor2.printBooks();


        Counter counter = new Counter();
        counter.getCount();

        Person person = new Person("Famil", 18);
        Person person2 = new Person("Emil", 19);
        person2.display();
        person.display();

        Circle circle = new Circle(3);
        circle.calculateArea();
        circle.calculatePerimeter();

        Triangle triangle = new Triangle(3,3,3);
        triangle.calculateArea();
        triangle.calculatePerimeter();

        Rectangle rectangle = new Rectangle(3,3);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Shape[] figures = {rectangle,circle,triangle};
        for (Shape figure : figures) {
            figure.calculateArea();
            figure.calculatePerimeter();
        }


        CreditCardPayment ccp = new CreditCardPayment();
        ccp.pay(20);

        PayPalPayment ppp = new PayPalPayment();
        ppp.pay(30);

        CashPayment cash = new CashPayment();
        cash.pay(40);

        Cat kotik = new Cat();
        kotik.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cow  cow = new Cow();
        cow.makeSound();

        Car car = new Car();
        car.move();

        Airplane airplane = new Airplane();
        airplane.move();

        Bicycle bicycle = new Bicycle();
        bicycle.move();




    }
}
