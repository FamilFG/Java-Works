package inheritance.subclasses;
import inheritance.Product;

import static java.lang.Math.round;


public class Clothing extends Product {
    public Clothing(double price){
        super(price);

    }
    @Override
    public double getDiscountPrice() {
        System.out.println("The discounted price for clothing is"+ round(price*1.2));
        return price*1.2;
    }
}
