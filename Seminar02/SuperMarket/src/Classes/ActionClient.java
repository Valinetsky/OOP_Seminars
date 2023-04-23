package Classes;

// https://github.com/H43apo8/OOP_Java/tree/main/HomeWork2/src/Classes

/** 
 * Наследник класса Actor - класс акционного покупателя
*/
public class ActionClient extends OrdinaryClient {
       
    // Включить поле название акции и номер клиента в акции(поле статическое)
    /** дополнительное поле - название акции */
    private String nameAction;
    /** дополнительное поле - максимальное число участников акции */
    private static int lastManStanding = 3;

    /** Возможное поле для подтверждения или отмены участия покупателя в акции. Однако хотелось бы при исчерпании лимита (lastManStanding) - создавать не акционного покупателя, а обыкновенного (OrdinaryClient) */
    // private boolean saleAction = true;

    /**
     * 
     * @param name - имя покупателя
     * @param nameAction - название акции
     */
    public ActionClient(String name, String nameAction){
        super(name);
        lastManStanding--;
        if (lastManStanding < 0) {
            lastManStanding = 0;
            // saleAction = false;
            System.out.printf("Отказ клиенту %s: исчерпан лимит акционных покупателей\n", name);
            this.nameAction = "Out";
            System.out.println("Name of the current class nameAction: " + getClass().getName() + " " + this.nameAction);
            return;
            
            // return (new OrdinaryClient(String name));
        }
        else {
            this.nameAction = nameAction;
        }
        System.out.println("Name of the current class: " + getClass().getName());
        
    }


    public int getAction() {
        return lastManStanding;
    }

    public String getActionName() {
        return nameAction;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isReturnable'");
    }


    @Override
    public boolean returnOrder(int orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
    }

}
