import classes.*;
import classes.Student;

public class Testclasses {
    public static void main(String[] args) {
        Kvadrattenliy kv = new Kvadrattenliy();
        kv.getD(1, 3, -2);

        Greet g = new Greet();
        g.greet("Famil");

        Student s = new Student("Famil",18);
        s.display();

        Demo demo = new Demo();
        Demo.main(args);

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
    }
}
