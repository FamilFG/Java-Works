package inheritance;

public class Product {
    public String name;
    public double price;

    public Product(double price) {
        this.price = price;
    }

    public double getDiscountPrice(){
        System.out.println("The price is");
        return price;
    }
}
