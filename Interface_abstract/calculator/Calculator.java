package Interface_abstract.calculator;

public class Calculator implements Calculate{


    @Override
    public double plus(double a , double b){
        return a+b;
    }
    @Override
    public double minus(double a , double b){
        return a-b;
    }
    @Override
    public double vurma(double a , double b){
        return a*b;
    }
    @Override
    public double bolme(double a , double b){
        return a/b;
    }
}
