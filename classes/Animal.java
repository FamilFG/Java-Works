package classes;

public class Animal {
    String name;
    static{
        System.out.println("Animal class loaded");
    }
    {
        System.out.println("New animal created");
    }
    public Animal(String name){
        this.name = name;
    }
}
