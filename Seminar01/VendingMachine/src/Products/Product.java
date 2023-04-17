package Products;


/**
 * Базовый класс продукта
 */
public class Product {

    /** Наименование продукта  */
    private String name;
    /** Цена продукта */
    private Double price;

    /**
     * Конструктор продукта
     * @param name это название
     * @param price это цена
     */
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product() {
        this.name = "Paper";
        this.price = 0.0;
    }

    public String getName(){
        return name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double value){
        if (value <= 0) {
            throw new IllegalStateException(String.format("Price too small", value));
        }
        this.price = value;
    }

    @Override
    public String toString(){
        return "Product{" + "name='" + name + '\'' + ", cost=" + price + '}';
    }
    // Override
}
