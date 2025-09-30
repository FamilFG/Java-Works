package inheritance;

public class Employee {
    public String name;
    public double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

}
