import classes.*;

import java.lang.module.FindException;

public class Test_the_classes {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        Findmax.findMax(arr);

        int a = 4;
        Factorial fac = new Factorial();
        fac.factorial(a);

        int b = 6;
        double c= 7.6;
        double d = 6.4;

        Calculator.sum(a,b);
        Calculator.sum(c,d);

        Car bmw = new Car("Bmw", "X5", 2010);
        Car mclaren = new Car("Mclaren", "720s", 2007);
        bmw.display();
        mclaren.display();

        Animal lion = new  Animal("Lion");
        Animal cat  = new  Animal("Cat");

        Shape kruq = new Shape(3);
        Shape pramouqolnik = new Shape(4,5);




    }
}
