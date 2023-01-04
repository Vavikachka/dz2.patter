package fablicts;
import interfaces.GameItem;
import interfaces.ITemGenerator;
import rewards.DiamondReward;
public class DiamondGenerator extends ITemGenerator{
    @Override   //переопределяем
    public GameItem createIterm() {
        return new DiamondReward();
    }
}
