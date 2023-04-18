package Products;


/** 
 * Наследник класса продукта - новый класс HotDrink
*/
public class HotDrink extends Product {

    /** дополнительное поле - объем */
    private int volume;
    /** дополнительное поле - температура */
    private int heat;
    

    /**
     * конструктор "Горячий напиток" - 4 параметра
     * @param name - название
     * @param price - цена
     * @param volume - объём
     * @param heat - температура
     */
    public HotDrink(String name, double price, int volume, int heat)
        {
            super(name, price);
            this.volume = volume;
            this.heat = heat;
        }

    public int getVolume() {
        return volume;
    }

    public int getHeat() {
        return heat;
    }

    /**
    * переопределение вывода информации продукта для HotDrink
    */
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume + 
        ", heat=" + heat + "°C" +
        '}';
    }
}