package interfaces;

public abstract class ITemGenerator {
    public void openReward(){
        GameItem gameItem = createIterm();
        gameItem.open();
    }
    public abstract GameItem createIterm();
}
