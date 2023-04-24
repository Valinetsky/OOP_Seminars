package Classes;

/**
 * Наследник класса Actor - класс акционного покупателя
 */
public class ActionClient extends OrdinaryClient {

	// Включить поле название акции и номер клиента в акции(поле статическое)
	/** дополнительное поле - название акции */
	private String nameAction;
	/** дополнительное поле - номер участника акции */
	private static int lastManStanding = 0;
	/** Максимальное кличество участников акции */
	final int VALUE = 3;

	/**
	 * 
	 * @param name       - имя покупателя
	 * @param nameAction - название акции
	 */
	public ActionClient(String name, String nameAction) {
		super(name);

		lastManStanding++;
		if (lastManStanding > VALUE) {

			System.out.printf("Отказ клиенту %s: исчерпан лимит акционных покупателей\n", name);
			this.nameAction = "NoMoreAction";
			System.out.println("Name of the current class nameAction: " + getClass().getName() + " " + this.nameAction);
		}
	}

	/**
	 * Геттер номера участника акции
	 * 
	 * @return
	 */
	public int getAction() {
		return lastManStanding;
	}

	/**
	 * Геттер максимального количества участников акции
	 * 
	 * @return
	 */
	public int getActionMaxCount() {
		return VALUE;
	}

	/**
	 * Геттер названия акции
	 * 
	 * @return
	 */
	public String getNameAction() {
		return nameAction;
	}

	/**
	 * Сеттер названия акции.
	 * 
	 * @param nameAction Название акции.
	 */
	public void setNameAction(String nameAction) {
		this.nameAction = nameAction;
	}

	@Override
	public String getName() {
		return super.name;
	}

	@Override
	public boolean isMakeOrder() {
		return super.isMakeOrder;
	}

	@Override
	public boolean isTakeOrder() {
		return super.isTakeOrder;
	}

	@Override
	public void setMakeOrder(boolean makeOrder) {
		super.isMakeOrder = makeOrder;
	}

	@Override
	public void setTakeOrder(boolean pickUpOrder) {
		super.isTakeOrder = pickUpOrder;
	}

	@Override
	public Actor getActor() {
		return this;
	}

	@Override
	public boolean isReturnable(boolean canBeReturned) {
		System.out.println("Возврат возможен");
		return true;
	}

	@Override
	public boolean returnOrder(int orderId) {
		System.out.printf("Номер позиции возврата: %d\n", orderId);
		return true;
	}

}
