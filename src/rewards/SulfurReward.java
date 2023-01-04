package rewards;
import interfaces.GameItem;
public class SulfurReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Sulfur " + random.nextInt(5,30));
    }
}
