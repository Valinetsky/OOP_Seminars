package Classes;

public class OrdinaryClient extends Actor {

	public OrdinaryClient(String name) {
		super(name);
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
