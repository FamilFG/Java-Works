package Interface_abstract.calculator;

public class testcalc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.plus(1.0, 2.0));
        System.out.println(calc.vurma(1.0, 2.0));
        System.out.println(calc.bolme(1.0, 2.0));
        System.out.println(calc.minus(1.0, 2.0));
    }
}
