package rewards;
import interfaces.GameItem;
public class WoodReward implements GameItem  {
    @Override
    public void open() {
        System.out.println("Wood " + random.nextInt(20,80));
    }
}
