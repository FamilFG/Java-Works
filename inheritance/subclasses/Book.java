package inheritance.subclasses;
import inheritance.Product;
import static java.lang.Math.round;


public class Book extends Product {
    public Book(double price){
        super(price);

    }
    @Override
    public double getDiscountPrice() {
        System.out.println("The discounted price is"+ round(price*1.05));
        return price*1.05;
    }
}
