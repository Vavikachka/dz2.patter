package fablicts;
import interfaces.GameItem;
import interfaces.ITemGenerator;
import rewards.WoodReward;

public class WoodGenerator extends ITemGenerator {
    @Override
    public GameItem createIterm() {
        return new WoodReward();
    }
}
