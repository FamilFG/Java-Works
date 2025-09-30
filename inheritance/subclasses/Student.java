package inheritance.subclasses;

import inheritance.Person;

public class Student extends Person {

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("Student is studying");
    }

    @Override
    public void Introduce() {
        System.out.println("Name" + name + ", Age " + age);
    }
}
