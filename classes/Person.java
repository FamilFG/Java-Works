package classes;

public class Person {
    String name;
    int age;

    static{
        System.out.println("Person class loaded");
    }
    {
        System.out.println("Creating person...");
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


   public void display(){
       System.out.println("Displaying person "+name+" with age "+age);
   }
}
