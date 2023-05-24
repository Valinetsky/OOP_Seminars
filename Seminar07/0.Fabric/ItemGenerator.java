public abstract class ItemGenerator {
    public void openReward()
    {
        iGameItems gameItem = createItem();
        gameItem.open();
    }
    
    
    public abstract iGameItems createItem();
}
