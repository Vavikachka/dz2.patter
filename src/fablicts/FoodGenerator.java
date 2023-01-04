package fablicts;
import interfaces.GameItem;
import interfaces.ITemGenerator;
import rewards.FoodReward;

public class FoodGenerator extends ITemGenerator{
    @Override   //переопределяем
    public GameItem createIterm() {
        return new FoodReward();
    }
}
