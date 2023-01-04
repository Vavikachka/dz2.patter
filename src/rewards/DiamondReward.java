package rewards;
import interfaces.GameItem;
public class DiamondReward implements GameItem{
    @Override
    public void open() {
        System.out.println("Diamond " + random.nextInt(1,100)) ;
    }
}
