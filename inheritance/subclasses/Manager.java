package inheritance.subclasses;

import inheritance.Employee;

public class Manager extends Employee {
    double bonus;
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;

        }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bonus: " + bonus);
    }


}
