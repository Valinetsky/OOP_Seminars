package Interfaces;

public class iReturnOrder {
    
}


public class Customer implements iReturnOrder {

    private int customerId;
    private String customerName;
    private String customerAddress;
    
    // конструктор класса Customer
    public Customer(int customerId, String customerName, String customerAddress) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.customerAddress = customerAddress;
    }
    
    // реализация метода returnOrder интерфейса iReturnOrder
    @Override
    public String returnOrder(int orderId, int numberOfReturnedItems, String reasonForReturn, double returnAmount) {
    // код для возврата товара
    return "Товар успешно возвращен";
    }
    
    // реализация метода getReasonForReturn интерфейса iReturnOrder
    @Override
    public String getReasonForReturn() {
    // код для получения причины возврата товара
    return "Брак";
    }
    
    // реализация метода getNumberOfReturnedItems интерфейса iReturnOrder
    @Override
    public int getNumberOfReturnedItems() {
    // код для получения количества товаров, которые нужно вернуть
    return 2;
    }
    
    // реализация метода getTotalAmount интерфейса iReturnOrder
    @Override
    public double getTotalAmount() {
    // код для получения общей стоимости товаров, которые нужно вернуть
    return 30;
    }
    }