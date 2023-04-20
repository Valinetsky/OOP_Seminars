package Classes;

public class ActionClient extends Actor {
       
    // Включить поле название акции и номер клиента в акции(поле статическое)
    String nameAction;
    static int lastManStanding = 3;
    private boolean saleAction = true;

    public ActionClient(String name, String nameAction){
        super(name);
        lastManStanding--;
        if (lastManStanding <= 0) {
            lastManStanding = 0;
            saleAction = false;
            System.out.printf("Отказ клиенту %s: исчерпан лимит акционных покупателей\n", name);
        }
    }



    @Override
    public String getName() {
        return super.name;
    }

    public int getAction() {
        return lastManStanding;
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

}
