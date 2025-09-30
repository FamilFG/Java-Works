package inheritance.subclasses;
import inheritance.Product;
import static java.lang.Math.round;


public class Electronics extends Product {
    public Electronics(double price){
        super(price);
    }
    @Override
    public double getDiscountPrice() {
        System.out.println("The discounted price for electronics is" + round(price*1.1));
        return price*1.1;
    }
}
