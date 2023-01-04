package fablicts;
import interfaces.GameItem;
import interfaces.ITemGenerator;
import rewards.SulfurReward;

public class SulfurGenerator extends ITemGenerator {
    @Override   //переопределяем
    public GameItem createIterm() {
        return new SulfurReward();
    }
}
