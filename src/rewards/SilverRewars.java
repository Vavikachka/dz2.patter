package rewards;

import interfaces.GameItem;

public class SilverRewars implements GameItem {
    @Override
    public void open() {
        System.out.println("Silver " + random.nextInt(1,10)) ;
    }

}
