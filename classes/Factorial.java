package classes;

public class Factorial {
    int f=1;
    public void factorial (int n){
        for (int i=n ; i>0; i--){
            f = f*i;
        }
        System.out.println(f);
    }
}
