package inheritance.subclasses;

import inheritance.Employee;

public class Developer extends Employee {
    public String programmingLanguage;
    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Programming Language String: " + programmingLanguage);
    }
}
