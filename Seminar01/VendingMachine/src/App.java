import Products.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola", 88.);

        item1.setPrice(98.);


        System.out.println(item1.toString());
    }
}
