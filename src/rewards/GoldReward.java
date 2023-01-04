package rewards;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import interfaces.GameItem;

public class  GoldReward implements GameItem {

    @Override
    public void open(){
        System.out.println("Gold " + random.nextInt(1,20) );
    }
}

