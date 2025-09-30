package inheritance.subclasses;

import inheritance.Person;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("Teacher teaching!");
    }

    @Override
    public void Introduce() {
        System.out.println("Name " + name + ", Age " + age + "He/She is a teacher");
    }
}
