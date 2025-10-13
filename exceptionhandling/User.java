package exceptionhandling;


public class User {
    String name;
    int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void buyProduct(String product) throws AgeRestrictionException{
        if (age<18){
           throw new AgeRestrictionException("Not enough age");
        }
        else{
            System.out.println("You bought " + product );
        }
    }
}
