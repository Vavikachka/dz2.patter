package rewards;

import interfaces.GameItem;

public class GemReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gem " + random.nextInt(1,5));
    }
}
