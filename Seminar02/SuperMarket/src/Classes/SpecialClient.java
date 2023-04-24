package Classes;

public class SpecialClient extends Actor {
	private int idVIP;

	public SpecialClient(String name, int idVIP) {
		super(name);
		this.idVIP = idVIP;
	}

	@Override
	public String getName() {
		return super.name;
	}

	public int getIdVIP() {
		return idVIP;
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