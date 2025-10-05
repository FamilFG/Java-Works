package Interface_abstract;

public class Airplane implements Vehicle{
    @Override
    public void move(){
        System.out.println("Airplane is flying in the sky");
    }
}
