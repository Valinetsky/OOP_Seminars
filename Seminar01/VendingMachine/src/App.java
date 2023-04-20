import Products.Product;
import Products.BottleOfWater;
import Products.HotDrink;
import VendingMachines.VendingMachine;


public class App {
    public static void main(String[] args) throws Exception {


        Product item1 = new Product("Cola",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Chips", 60.0));
        itemMachin.addProduct(new Product("Butter", 50.0));
        itemMachin.addProduct(new Product("Breed", 40.0));
        itemMachin.addProduct(new Product("Snack", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500));
        itemMachin.addProduct(new HotDrink("Soup", 1337, 250, 300));
        itemMachin.addProduct(new HotDrink("Borsch", 100500, 777, -300));

        String probe = "";
        
        for(Product prod: itemMachin.getProdAll())
        {
            System.out.println(prod.toString());
            probe = probe + prod + "\n";
        }

        MyWindow app = new MyWindow(probe);

        app.setVisible(true);
    }
}
