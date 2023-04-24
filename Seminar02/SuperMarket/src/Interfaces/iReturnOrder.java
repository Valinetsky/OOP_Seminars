package Interfaces;

public interface iReturnOrder {
	/**
	 * Возможен ли возврат товара
	 * 
	 * @param canBeReturned параметр из базы товаров (можно возвратить - true)
	 * @return boolean
	 */
	public boolean isReturnable(boolean canBeReturned);

	/**
	 * Возврат товара по его идентификационному номеру
	 * 
	 * @param orderId параметр из базы товаров (уникальный идентификационный
	 *                номер)
	 * @return boolean
	 */
	public boolean returnOrder(int orderId); // Метод, позволяющий вернуть товар по его ID
}
