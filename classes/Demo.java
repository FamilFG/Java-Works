package classes;

public class Demo {
    static {
        System.out.println("Class loaded");
    }

    {
        System.out.println("Instance created");
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}
