package Interfaces;


public interface iReturnOrder {
    
    public boolean isReturnable(boolean canBeReturned); // Метод, позволяющий узнать, может ли товар быть возвращен
    public boolean returnOrder(int orderId); // Метод, позволяющий вернуть товар по его ID
}
