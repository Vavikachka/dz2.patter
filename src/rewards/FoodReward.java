package rewards;
import interfaces.GameItem;
public class FoodReward implements GameItem{
    @Override
    public void open() {
        System.out.println("Food " + random.nextInt(10,110));
    }
}
