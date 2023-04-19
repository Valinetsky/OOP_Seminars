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
     * @param heat - температура (нормализуем входящие значения: не менее 0°K и не более 451°F)
     */
    public HotDrink(String name, double price, int volume, int heat)
        {
            super(name, price);
            this.volume = volume;

            if (heat < -273) {
                heat = -273;
            }
            if (heat > 232) {
                heat = 232;
            }
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