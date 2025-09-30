package inheritance;

public  class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void Introduce() {
        System.out.println(name);
    }

}
